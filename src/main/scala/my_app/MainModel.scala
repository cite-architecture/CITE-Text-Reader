package my_app 
import com.thoughtworks.binding.{Binding, dom}
import com.thoughtworks.binding.Binding.{BindingSeq, Var, Vars}
import com.thoughtworks.binding.Binding.{Var, Vars}
import com.thoughtworks.binding.dom
import org.scalajs.dom.document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.ext.Ajax
import scala.concurrent
              .ExecutionContext
              .Implicits
              .global

import scala.scalajs.js
import scala.scalajs.js._
import js.annotation._


@JSExportTopLevel("my_app.MainModel")
object MainModel {

		val userMessage = Var("Main loaded.")
		val userAlert = Var("default")
	   val userMessageVisibility = Var("app_hidden")
		var msgTimer:scala.scalajs.js.timers.SetTimeoutHandle = null

		val welcomeMessage = Var("")

}