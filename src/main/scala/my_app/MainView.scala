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
			{ welcomeDiv.bind }
			

		</article>
		 <div class="push"></div>
		<footer>
		{ footer.bind }
		</footer>
	</div>
	}

	@dom
	def welcomeDiv = {
		<div>
			<p>{ MainModel.welcomeMessage.bind }</p>
		</div>

	}


	@dom
	def footer = {
		<p>
		CITE/CTS is ©2002–2018 Neel Smith and Christopher Blackwell. 
		</p>
	}

}
