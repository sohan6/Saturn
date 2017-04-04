package com.ms.qaTools.io.rest.client

import org.apache.http.client.methods.HttpDelete
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.methods.HttpPut

import com.ms.qaTools.io.rowSource.rest.RestDeleteText
import com.ms.qaTools.io.rowSource.rest.RestGetText
import com.ms.qaTools.io.rowSource.rest.RestPostText
import com.ms.qaTools.io.rowSource.rest.RestPutText



/**
 * TEXT Rest Client definition
 */
object RestTextClient {
  // Put operation for a text input
  def apply(httpPutObject: HttpPut, requestInput: Seq[(String, String)], acceptHeader: String, contentType: String) = {
    RestPutText(httpPutObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpPutObject: HttpPut, requestInput: Seq[(String, String)]) = {
    RestPutText(httpPutObject, requestInput)
  }
  // Get operation for a text input
  def apply(httpGetObject: HttpGet, requestInput: Seq[(String, String)], acceptHeader: String, contentType: String) = {
    RestGetText(httpGetObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpGetObject: HttpGet, requestInput: Seq[(String, String)]) = {
    RestGetText(httpGetObject, requestInput)
  }
  // Post operation for a text input
  def apply(httpPostObject: HttpPost, requestInput: Seq[(String, String)], acceptHeader: String, contentType: String) = {
    RestPostText(httpPostObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpPostObject: HttpPost, requestInput: Seq[(String, String)]) = {
    RestPostText(httpPostObject, requestInput)
  }
  // Delete operation for a text input
  def apply(httpDeleteObject: HttpDelete, requestInput: Seq[(String, String)], acceptHeader: String, contentType: String) = {
    RestDeleteText(httpDeleteObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpDeleteObject: HttpDelete, requestInput: Seq[(String, String)]) = {
    RestDeleteText(httpDeleteObject, requestInput)
  }
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