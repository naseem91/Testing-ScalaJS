import org.scalatest.FunSpec
import org.querki.jquery._
class JsTest extends FunSpec {
  describe("JsTest") {
    val button =$("#view").value()
    assert(button.toString =="View")
  }
}