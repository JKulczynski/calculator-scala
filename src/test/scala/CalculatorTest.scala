import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class CalculatorTest extends AnyFlatSpec {

  behavior of "Calculator"
  it should "for addition of two numbers return their sum" in {
    Calculator(0).add(1, 2) shouldBe Calculator(3)
  }
  it should "for addition of one number return its sum with result" in {
    Calculator(0).add(second = 1) shouldBe Calculator(1)
  }

  it should "for substraction of two numbers return their difference" in {
    Calculator(0).substract(2, 1) shouldBe Calculator(1)
  }
  it should "for substraction of one number return its difference with result" in {
    Calculator(2).substract(second = 1) shouldBe Calculator(1)
  }

  it should "for multiply of two numbers return their product" in {
    Calculator(0).multipy(1, 2) shouldBe Calculator(2)
  }

it should "for multiply of one number return its product with result" in {
    Calculator(2).multipy(second = 1) shouldBe Calculator(2)
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

}
