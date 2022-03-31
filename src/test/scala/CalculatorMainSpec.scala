import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
import org.scalacheck.Gen

class CalculatorMainSpec extends AnyFlatSpec {

  behavior of "execute method in CalculatorMain"
  it should "return for command with two arguments (e.g. + 5 3) calculator with result of the operation" in {
    val args = Table(
      ("calculator", "command", "result"),
      (Calculator(0), "+ 5 3", Calculator(5 + 3)),
      (Calculator(0), "- 5 3", Calculator(5 - 3)),
      (Calculator(0), "* 5 3", Calculator(5 * 3)),
      (Calculator(0), "/ 5 3", Calculator(5 / 3))
    )
    forAll(args) {
      (calculator, command, result) => CalculatorMain.execute(calculator,command) shouldBe result
    }
  }

}
