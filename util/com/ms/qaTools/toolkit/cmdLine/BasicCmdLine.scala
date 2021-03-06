package com.ms.qaTools.toolkit.cmdLine
import org.kohsuke.args4j.CmdLineException
import org.kohsuke.args4j.CmdLineParser
import org.kohsuke.args4j.Option

object EarlyExit extends Throwable

class BasicCmdLine {
  @Option(name = "-h", aliases = Array("--help"), usage = "Show help/usage")
  val help: Boolean = false

  @Option(name = "--debug", usage = "Turn on debugging information")
  val debug: Boolean = false

  @Option(name = "--noExitCode", usage = "Do not exit JVM (for unit tests)", hidden = true)
  val noExitCode: Boolean = false

  @Option(name = "--version", usage = "Show current release version")
  val version: Boolean = false

  val cmdLineParser = new CmdLineParser(this)
  util.Try(sys.env("COLUMNS").toInt).foreach(cmdLineParser.setUsageWidth)

  def parseArguments(args: Array[String], app: String, version: String, buildTime: String) = {
    try {
      cmdLineParser.parseArgument(args: _*)
    } catch {
      case (e: CmdLineException) => if(! this.version && ! help) throw e
    }

    if (this.version) {
      println(s"$app $version $buildTime")
      println("Bin path: " + getClass.getProtectionDomain.getCodeSource.getLocation.getPath)
      throw EarlyExit
    }

    if (help) {
      println("Usage information")
      cmdLineParser.printUsage(System.out)
      throw EarlyExit
    }
  }
}
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
