package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import scala.util.Failure
import scala.util.Success

import org.jsoup.nodes.Element

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.saturn.dsl.annotation.ScenarioAnnotation
import com.ms.qaTools.saturn.metaData.RepetitionHandler
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.notifier.html.HTMLCSS
import com.ms.qaTools.saturn.runtime.notifier.html.appendException
import com.ms.qaTools.toolkit.Fail

class BasicHtmlGenerator(implicit sc: SaturnExecutionContext) extends HtmlGenerator {
  def runGroupIconClassName: String = "runGroupIcon"
  def runGroupType: String = "N/A!"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    createContent(parentElement, result.moduleResult)
  }

  override def generateIteratorResult(name: String, fullName: String, result: IteratorResult[Any], parentElement: Element, asScenario: Boolean = false): Unit = {
    val annotations = result.metaData.collect { case s: ScenarioAnnotation => s }
    val annotationApplied = getAnnotationByResult(annotations, result.status)
    val output = annotationApplied.map(!_.ignored).getOrElse(true)
    val hasRepetitionHandler = !{ result.metaData.collect { case rh: RepetitionHandler => rh } }.isEmpty

    if (output) {
      // If there is no annotation, expand by default on failed
      val expanded = annotationApplied.map(_.expandElement(result.status)).getOrElse(result.failed)

      val displayHeader = annotationApplied.filter(a => a.hideHeader) == None
      val displayRepeatingHeader = annotationApplied.filter(a => a.hideRepeatingHeader) == None
      val displayContent = annotationApplied.filter(a => a.hideContent) == None
      val displayRepeatingContent = annotationApplied.filter(a => a.hideRepeatingContent) == None
      val showIterationNo = annotationApplied.forall(_.showIterationNo)

      if (displayHeader) {
        val panelDiv = parentElement.appendDiv.addClass(HTMLCSS.PANEL_CLASS(expanded))

        val iterationsParentPanel = if (hasRepetitionHandler) {
          //Create group header runGroupName[0..n] and panelContent
          createIteratorResultHeaderPanel(panelDiv, name, fullName, runGroupType, runGroupIconClassName, result, showIterationNo, asScenario, annotations)
          panelDiv.appendDiv.asPanelContent.expand(expanded)
        } else panelDiv

        if (displayContent) {
          result.iterationResults.foreach(ir => ir match {
            case Success(r) => {
              val iterationAnnotations = r.metaData.collect { case s: ScenarioAnnotation => s }
              val iterationAnnotationApplied = getAnnotationByResult(iterationAnnotations, result.status)
              
              if (hasRepetitionHandler) {
                val iterationPanel = iterationsParentPanel.appendDiv.asPanelCollapsed
                if (displayRepeatingHeader) {
                  createIterationResultHeaderPanel(iterationPanel, name, fullName, runGroupType, runGroupIconClassName, r, showIterationNo, scenarioAnnotations = iterationAnnotations)
                }
                if (displayRepeatingContent) {
                  val iterationRepeatPanel = iterationPanel.appendDiv.asPanelContent.expand(false)
                  generateIterationResult(name, fullName, r, iterationRepeatPanel, asScenario = asScenario, displayIterationNo = showIterationNo)
                }
              } else {
                createIterationResultHeaderPanel(iterationsParentPanel, name, fullName, runGroupType, runGroupIconClassName, r, asScenario = asScenario, displayIterationNo = false, scenarioAnnotations = iterationAnnotations)
                val panelContent = iterationsParentPanel.appendDiv.asPanelContent.expand(expanded)
                generateIterationResult(name, fullName, r, panelContent, asScenario = asScenario, displayIterationNo = false)
              }
            }
            case Failure(e) => {
              createHeaderPanel(parentElement = iterationsParentPanel,
				                fullName = fullName,
				                runGroupType = runGroupType,
				                result = Fail(Option(e)),
				                iconClass = runGroupIconClassName,
				                title = name,
				                description = "",
				                tooltip = "%s: %s".format(runGroupType, fullName),
				                dialogTitle = "Configuration",
				                dialogContent = fullName,
				                asScenario = asScenario)
              val panelContent = iterationsParentPanel.appendDiv.asPanelContent.expand(expanded)
              appendException(panelContent, e)
            }

          })
        }
      } else if (displayContent) {
        result.iterationResults.foreach(ir => ir match {
          case Success(r) => {
            val iterationAnnotations = r.metaData.collect { case s: ScenarioAnnotation => s }
            val iterationAnnotationApplied = getAnnotationByResult(iterationAnnotations, result.status)
              
            val childPanel = parentElement.appendDiv.addClass(HTMLCSS.PANEL_CLASS(expanded))
            if (displayRepeatingHeader) //createHeader runGroupName[n]
              createIterationResultHeaderPanel(childPanel, name, fullName, runGroupType, runGroupIconClassName, r, showIterationNo, scenarioAnnotations = iterationAnnotations)
            if (displayRepeatingContent) {
              val panelContent = childPanel.appendDiv.asPanelContent
              generateIterationResult(name, fullName, r, panelContent, asScenario = asScenario, displayIterationNo = showIterationNo)
            }
          }
          case Failure(e) => {
            val childPanel = parentElement.appendDiv.addClass(HTMLCSS.PANEL_CLASS(expanded))
            appendException(childPanel, e)
          }

        })
      }
    }
  }

  def createContent(parentElement: Element, result: Any) = {
    val panelContent = parentElement.appendDiv.asPanelContent.expand(true)
    panelContent.text(result.toString)
  }
}

object BasicHtmlGenerator {
  def apply()(implicit sc: SaturnExecutionContext) = new BasicHtmlGenerator
}