package com.ms.qaTools.toolkit.sql

import scala.util.Failure
import scala.util.Success
import scala.util.Try

import org.apache.commons.io.FilenameUtils

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.definition.CsvIO
import com.ms.qaTools.io.rowSource.Utils.ResultSetIteratorUtil
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.withCloseable

case class SQLCall(dbConnection: DatabaseConnection,
                   sqlExprs: Seq[String],
                   parameters: Seq[Option[Iterator[Seq[String]]]],
                   outputFilenames: Seq[Option[String]]) extends Runnable[SQLCallResult] {
  def run = (for ((sqlExpr, parametersOption, outputOption) <- (sqlExprs, parameters, outputFilenames).zipped.toSeq) yield {
    Try {
      val parameters = parametersOption.getOrElse(Iterator.single(Seq()))
      withCloseable(dbConnection.call(sqlExpr, parameters)) { callResult =>
        outputOption foreach { fileName =>
          for ((iterRs, outerIndex) <- callResult.zipWithIndex) {
            val baseName = FilenameUtils.getBaseName(fileName) + "." + "%04d".format(outerIndex)
            val fullPath = FilenameUtils.getFullPath(fileName)
            val extension = FilenameUtils.getExtension(fileName)
            for ((rs, innerIndex) <- iterRs.zipWithIndex) withCloseable(rs) { rs =>
              (new CsvIO(new FileIO(fullPath + baseName + "." + "%04d".format(innerIndex) + "." + extension)).output) match {
                case Success(writer) => withCloseable(writer) { _.write(rs.toSeqStringIterator) }
                case Failure(t)      => throw new Exception("An exception occurred while connecting rotating file.")
              }
            }
            (new CsvIO(new FileIO(fullPath + baseName + "." + "parameters" + "." + extension)).output) match {
              case Success(writer) => withCloseable(writer) { _.write(iterRs.outputParametersAsDelimitedRowIterator) }
              case Failure(t)      => throw new Exception("An exception occurred while connecting rotating file.")
            }
          }
        }
      }
      SQLCallActionResult(Passed(), sqlExpr)
    }.recover { case t: Throwable => SQLCallActionResult(Failed(), sqlExpr, Some(t)) }
  }).toTrySeq.map(results => SQLCallResult(if (results.forall { _.passed }) Passed() else Failed(), results))
}

object SQLCall {
  //apply method for Saturn Runtime
  def apply(dbResourceTry: Try[DatabaseConnection],
            sqlExprsTry: Seq[Try[String]],
            outputFilenamesTry: Seq[Option[Try[String]]],
            parameterIOsTry: Seq[Option[Try[Iterator[Seq[String]]]]]): Try[SQLCall] = {
    for {
      dbConnection <- dbResourceTry.rethrow("An exception occurred while connecting database resource.")
      sqlExprs <- sqlExprsTry.toTrySeq.rethrow("An exception occurred while generating sql expressions.")
      parameters <- parameterIOsTry.map(_.map(_.map(Option(_))).getOrElse(Try(None))).toTrySeq.rethrow("An exception occurred while connecting parameter resources.")
      outputFileNames <- outputFilenamesTry.map(_.map(_.map(Option(_))).getOrElse(Try(None))).toTrySeq.rethrow("An exception occurred while connecting to output resources.")
    } yield SQLCall(dbConnection, sqlExprs, parameters, outputFileNames)
  }.rethrow("An exception occurred while setting up SQLCall.")
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
