package my_app 
import com.thoughtworks.binding.{Binding, dom}
import com.thoughtworks.binding.Binding.{BindingSeq, Var, Vars}
import scala.scalajs.js
import scala.scalajs.js._
import js.annotation._
import scala.concurrent._
import collection.mutable
import collection.mutable._
import scala.scalajs.js.Dynamic.{ global => g }
import org.scalajs.dom._
import org.scalajs.dom.ext._
import org.scalajs.dom.raw._

import monix.execution.Scheduler.Implicits.global
import monix.eval._

import scala.scalajs.js.annotation.JSExport

@JSExportTopLevel("MainController")
object MainController {


	/* 
		Initiate app with a URL to an online CEX file	
	*/
	@JSExport
	def main(libUrl: String): Unit = {
		dom.render(document.body, MainView.mainDiv)
		welcomeUser
	}

	/*
	 	Handles displaying messages to the user, color-coded according to type.
	 	Fades after 10 seconds.		
	*/
	def updateUserMessage(msg: String, alert: Int): Unit = {
		MainModel.userMessageVisibility.value = "app_visible"
		MainModel.userMessage.value = msg
		alert match {
			case 0 => MainModel.userAlert.value = "default"
			case 1 => MainModel.userAlert.value = "wait"
			case 2 => MainModel.userAlert.value = "warn"
		}
		js.timers.clearTimeout(MainModel.msgTimer)
		MainModel.msgTimer = js.timers.setTimeout(10000){ MainModel.userMessageVisibility.value = "app_hidden" }
	}

	def welcomeUser:Unit = {
		MainController.updateUserMessage(s"Welcoming user.", 0)
		MainModel.welcomeMessage.value = "Welcome User!"	
	}



}
