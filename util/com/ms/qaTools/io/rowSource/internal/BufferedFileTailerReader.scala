package com.ms.qaTools.io.rowSource.internal

import org.apache.commons.io.input.Tailer
import java.io.File
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.SynchronizedBuffer
import org.apache.commons.io.input.TailerListener
import java.io.Reader
import java.io.FileNotFoundException
import org.slf4j.{ LoggerFactory }
import java.io.FileInputStream
import org.apache.commons.io.IOUtils
import scala.util.Try
import java.io.IOException
import java.io.EOFException
import java.io.FileReader
import scala.annotation.tailrec
import scala.util.Failure
import com.ms.qaTools._

/**
 * This is an extension of the Java Reader, not a RowSource.
 *
 * This might've looked better as a Java class actually.
 */

sealed trait TailLocation
case object Beginning extends TailLocation
case object End extends TailLocation

class BufferedFileTailerReader(
  file: File,
  resolver: RotationResolver,
  location: TailLocation = End,
  throwIfNotFound: Boolean = false) extends Reader {

  val logger = LoggerFactory.getLogger(getClass)
  val buffer = new StringBuilder()
  @volatile var closed: Boolean = false

  val underlying = new Thread {
    var reader: Option[Reader] = None
    var lastPosition: Long = 0
    def onFileNotFound = if (throwIfNotFound) throw new FileNotFoundException(file.getAbsolutePath()) else Thread.`yield`
    @tailrec def position: Long =
      location match {
        case End if file.exists()  => file.length()
        case End if !file.exists() => { onFileNotFound; position }
        case Beginning             => 0
      }
    @tailrec def obtainReader: Option[Reader] = {
      if (!file.exists()) {
        onFileNotFound
        obtainReader
      }
      else {
        if (lastPosition > file.length()) {
          // file may have been rotated, new file started.
          logger.warn("File rotation detected")
          resolver.resolve().foreach { f =>
            def retryToAppend(n: Int): Try[StringBuilder] =
              Try {
                buffer.synchronized { buffer.appendAll(f.readFrom(position)) }
              } recoverWith { case _: Throwable if (n > 0) => retryToAppend(n - 1) }
            retryToAppend(10)            
          }
          lastPosition = 0
          Option(new FileReader(file))
        }
        else {
          reader.orElse { Option(new FileReader(file).withSideEffect { _.skip(position) }) }
        }
      }
    }

    override def run() = {
      while (true && !closed) {
        reader = obtainReader
        reader.foreach { r =>
          val b = new Array[Char](1024)
          val read = r.read(b)
          if (read > 0) {
            buffer.synchronized { buffer.appendAll(b.take(read)) }
            lastPosition += read
          }
          Thread.sleep(500)
        }
      }
      reader.foreach { _.close() }
    }
  }

  underlying.start()

  def close = closed = true

  def read(buf: Array[Char], offset: Int, len: Int): Int = {
    var read: Int = 0
    while (read != len) {
      read = buffer.synchronized {
        if (buffer.size >= offset + len) {
          buffer.copyToArray(buf, offset, len)
          buffer.delete(offset, len)
          len
        }
        else 0
      }
      if (read != len) Thread.`yield`
    }
    read
  }
}

object BufferedFileTailerReader {
  def apply(file: File, resolver: RotationResolver, location: TailLocation): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver, location = location)
  def apply(file: File, resolver: RotationResolver, location: TailLocation, throwIfNotFound: Boolean): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver, location = location, throwIfNotFound = throwIfNotFound)
  def apply(file: File, resolver: RotationResolver, location: TailLocation, throwIfNotFound: Boolean, delay: Long): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver, location = location, throwIfNotFound = throwIfNotFound)
  def apply(file: File, resolver: RotationResolver, throwIfNotFound: Boolean): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver, throwIfNotFound = throwIfNotFound)
  def apply(file: File, resolver: RotationResolver): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver)
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
