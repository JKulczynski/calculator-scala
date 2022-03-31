import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
import org.scalacheck.Gen

class CalculatorTest extends AnyFlatSpec {

  behavior of "Calculator"
  it should "for addition of two numbers return their sum" in {
    val args = Table(
      ("first", "second"),
      (0, 1),
      (1, 2),
      (-1, 1)
    )
    forAll(args) {
      (first: Int, second: Int) => Calculator(0).add(first, second) shouldBe(Calculator(first + second))
    }
  }

  it should "for addition of one number return its sum with result" in {
    val args = Table(
      ("second"),
      (1),
      (2),
      (1)
    )
    forAll(args) {
      (second: Int) => Calculator(0).add(second = second) shouldBe(Calculator(second))
    }
  }

  it should "for subtraction of two numbers return their difference" in {
    val args = Table(
      ("first", "second"),
      (0, 1),
      (1, 2),
      (-1, 1)
    )
    forAll(args) {
      (first: Int, second: Int) => Calculator(0).subtract(first, second) shouldBe(Calculator(first - second))
    }
  }
  it should "for subtraction of one number return its difference with result" in {
    val args = Table(
      ("second"),
      (1),
      (2),
      (1)
    )
    forAll(args) {
      (second: Int) => Calculator(0).subtract(second = second) shouldBe(Calculator(0 - second))
    }
  }

  it should "for multiply of two numbers return their product" in {
    Calculator(0).multiply(1, 2) shouldBe Calculator(2)
  }

it should "for multiply of one number return its product with result" in {
    Calculator(2).multiply(second = 1) shouldBe Calculator(2)
  }

  it should "for divide of two numbers return their quotient" in {
    Calculator(0).divide(4, 2) shouldBe Calculator(2)
  }

  it should "for divide of one number return its quotient with result" in {
    Calculator(4).divide(second = 2) shouldBe Calculator(2)
  }

  it should "for negation of number return opposite number" in {
    Calculator(0).negation(2) shouldBe Calculator(-2)
  }

  it should "for negation without argument return negation of result" in {
    val results =  for (i <- Gen.choose(Integer.MIN_VALUE, Integer.MAX_VALUE)) yield i
    ScalaCheckDrivenPropertyChecks.forAll(results) {
      result => Calculator(result).negation() shouldBe Calculator(-result)
    }
  }
}
