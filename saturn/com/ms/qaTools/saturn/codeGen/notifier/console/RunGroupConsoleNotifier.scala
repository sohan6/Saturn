package com.ms.qaTools.saturn.codeGen.notifier.console

import scala.util.Failure
import scala.util.Success

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.RunGroupResult
import com.ms.qaTools.saturn.runtime.QUIET
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.statusToString
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString

case object RunGroupConsoleNotifier extends ConsoleNotifier[RunGroupResult] {
  override val runGroupType = "RunGroup"

  override def notifyAfterIteration(name: String, result: IterationResult[RunGroupResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor: Boolean = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      val runGroupResult = result.moduleResult
      if (!runGroupResult.runGroups.isEmpty) sc.logger.debug(spaces(1) + "Children:")
      for {
        childResultTuple <- runGroupResult.runGroups
      } {
        val (childFullName, childResult) = childResultTuple
        childResult match {
          case Success(c) => sc.logger.debug(spaces(2) + s"${childFullName.split("\\.").lastOption.getOrElse(childFullName)} - " + statusToString(c.status))
          case Failure(e) => sc.logger.debug(spaces(2) + s"${childFullName.split("\\.").lastOption.getOrElse(childFullName)} - " + "FAIL".red)
        }
      }
      sc.logger.debug("")
    }
  }
}
