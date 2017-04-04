package com.ms.qaTools.saturn.codeGen

import java.io.Closeable

import scala.collection.mutable.LinkedHashMap
import scala.collection.mutable.ListBuffer
import scala.util.Failure
import scala.util.Success
import scala.util.Try

import com.ms.qaTools.saturn.kronus.runtime.ConstellationDecoration
import com.ms.qaTools.saturn.kronus.runtime.ConstellationEntity
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.WriteOnlyJsonFormat

import spray.json._

case class Attribute(name: String, value: Either[String, Throwable])
case class Resource(name: String, resource: Either[Any, Throwable])

trait AbstractContext {
  val metaDataContexts = LinkedHashMap[String, MetaDataContext]()
  val resourceContexts = LinkedHashMap[String, ResourceContext]()

  def appendMetaDataContext[T](name: String, metaData: T) = {
    val metaDataContext = MetaDataContext(name, Option(metaData))
    metaDataContexts += ((name, metaDataContext))
    metaDataContext
  }

  def appendResourceContext(name: String, resourceType: String) = {
    val resourceContext = ResourceContext(name, resourceType)
    resourceContexts += ((name, resourceContext))
    resourceContext
  }
}

abstract class Context(implicit sc: SaturnExecutionContext)
extends AbstractContext with ConstellationDecoration.HighPriorityFromImplicits {
  def name: String
  def parent: Option[Context]
  def getFullContextName: String
  def constellationEntityName: String

  val closeableResources = ListBuffer[Closeable]()
  val resources = ListBuffer[Resource]()
  val complexValues = ListBuffer[Context.ComplexValue]()
  val attributes = ListBuffer[Attribute]()

  val constellationEntity: ConstellationEntity = parent match {
    case None    => new ConstellationEntity(constellationEntityName)(sc.constellationClient, sc.executionContext)
    case Some(p) => p.constellationEntity.newChild(constellationEntityName)
  }

  def attributeTry(valueTry: Try[String], name: String): Try[String] = {
    valueTry match {
      case Success(v) => attributes += Attribute(name, Left(v))
      case Failure(e) => attributes += Attribute(name, Right(e))
    }
    constellationEntity.newChild(name).complete(valueTry, Nil)
    valueTry
  }

  def connectTry[X: ConstellationDecoration.From](resourceTry: Try[X], name: String, isReference: Boolean): Try[X] = {
    resourceTry match {
      case Success(c: Closeable) if !isReference => { closeableResources += c; resources += Resource(name, Left(c)) }
      case Success(r)            => resources += Resource(name, Left(r))
      case Failure(e)            => resources += Resource(name, Right(e))
    }
    if (resourceContexts.contains(name)) constellationEntity.newChild(name).complete(resourceTry, Nil)
    resourceTry
  }

  def closeAll { closeableResources.foreach(r => Try { r.close() }) }
}

case class IterationContext(name: String, parent: Some[IteratorContext], iterationNo: Option[Int])
                           (implicit sc: SaturnExecutionContext) extends Context {
  // Skip the names of the IteratorContext - Get only the names of the Iteration context.
  def getFullContextName(): String = {
    val withItnNo = constellationEntityName
    parent match {
      case Some(p) =>
        p.parent match {
          case Some(pp) => s"${pp.getFullContextName()}.$withItnNo"
          case None     => withItnNo
        }
      case _ => withItnNo
    }
  }

  def constellationEntityName = name + iterationNo.fold("")(i => s"[$i]")
}

case class IteratorContext(name: String, parent: Option[IterationContext])
                          (implicit sc: SaturnExecutionContext) extends Context {
  def getFullContextName(): String = {
    parent match {
      case None    => name
      case Some(p) => p.getFullContextName + "." + name
    }
  }

  def constellationEntityName = name
}

case class MetaDataContext(name: String, metaData: Option[Any]) extends AbstractContext

object MetaDataContext {
  implicit object JsonFormat extends WriteOnlyJsonFormat[MetaDataContext] {
    import DefaultJsonProtocol._

    def write(md: MetaDataContext) = {
      val key = md.metaData.map(_.toString)
      val value = if (md.metaDataContexts.isEmpty) key.toJson else {
        val value = toJson(md.metaDataContexts)
        key.fold(value)(k => JsObject(Map(k -> value)))
      }
      JsObject(Map(md.name -> value))
    }
  }

  def toJson(mds: collection.Map[String, MetaDataContext]): JsObject = {
    val builder = Map.newBuilder[String, JsValue]
    mds.mapValues(_.toJson).foreach {
      case (k, JsObject(fs)) if fs.keySet == Set(k) => builder += k -> fs(k)
      case kv                                       => builder += kv
    }
    JsObject(builder.result())
  }
}

case class ResourceContext(name: String, resourceType: String) extends AbstractContext

object Context {
  case class ComplexValue(name: String, value: Either[String, Throwable])
}
