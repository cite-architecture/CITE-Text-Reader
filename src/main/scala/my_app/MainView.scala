package my_app 

import com.thoughtworks.binding.{Binding, dom}
import com.thoughtworks.binding.Binding.{BindingSeq, Var, Vars}
import scala.scalajs.js
import scala.scalajs.js._
import org.scalajs.dom._
import org.scalajs.dom.ext._
import scala.scalajs.js.Dynamic.{ global => g }
import org.scalajs.dom.raw._
import org.scalajs.dom.document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.ext.Ajax
import edu.holycross.shot.cite._
import edu.holycross.shot.ohco2._
import edu.holycross.shot.citeobj._
import scala.scalajs.js.annotation.JSExport
import js.annotation._


@JSExportTopLevel("my_eapp.MainView")
object MainView {

	//val textView = O2View.o2div




	@dom
	def mainMessageDiv = {
			<div id="main_message" class={ s"app_message ${MainModel.userMessageVisibility.bind} ${MainModel.userAlert.bind}" } >
				<p> { MainModel.userMessage.bind }  </p>
			</div>
	}

	@dom
	def mainDiv = {
		<div id="main-wrapper">
		<header>
			My Application
			<span id="app_header_versionInfo">version { BuildInfo.version }</span>
		</header>

		<article id="main_Container">

			{ mainMessageDiv.bind }
			

		</article>
		 <div class="push"></div>
		<footer>
		{ footer.bind }
		</footer>
	</div>
	}


	@dom
	def footer = {
		<p>
		{ MainModel.currentLibraryMetadataString.bind }
		</p>
		<p>
		CITE/CTS is ©2002–2018 Neel Smith and Christopher Blackwell. This implementation of the <a href="http://cite-architecture.github.i">CITE</a> data models was written by Neel Smith and Christopher Blackwell using <a href="https://www.scala-lang.org">Scala</a>, <a href="http://www.scala-js.org">Scala-JS</a>, and <a href="https://github.com/ThoughtWorksInc/Binding.scala">Binding.scala</a>. Licensed under the <a href="https://www.gnu.org/licenses/gpl-3.0.en.html">GPL 3.0</a>. Sourcecode on <a href="https://github.com/cite-architecture/ScalaJS-CITE-Environment">GitHub</a>. Copyright and licensing information for the default library is available <a href="https://raw.githubusercontent.com/Eumaeus/cts-demo-corpus/master/CEX-Files/LICENSE.markdown">here</a>. Report bugs by <a href="https://github.com/cite-architecture/CITE-App/issues">filing issues on GitHub.</a>
		</p>
	}

}
