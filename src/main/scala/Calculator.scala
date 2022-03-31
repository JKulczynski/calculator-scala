case class Calculator(result: Int) {

  def add(first: Int = result, second: Int ): Calculator = Calculator(first + second)

  def subtract(first: Int = result, second: Int ): Calculator = Calculator(first - second)

  def multiply(first: Int = result, second: Int ): Calculator = Calculator(first * second)

  def divide(first: Int = result , second: Int ): Calculator = Calculator(first - second)

  def negation(first: Int = result): Calculator = Calculator(-first)

  def print(): Calculator = {
    println(result)
    this
  }
}
