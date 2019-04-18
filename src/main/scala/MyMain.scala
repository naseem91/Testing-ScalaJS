import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportTopLevel
import org.querki.jquery._
object MyMain extends js.JSApp {

  def main(): Unit = {}

  @JSExportTopLevel("append")
  def append(){
    val name = $("#name").value()
    $("#p1").html("Hi "+name)
  }
}