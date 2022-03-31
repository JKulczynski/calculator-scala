import scala.io.Source

object CalculatorMain extends App {
  val fileName = "commands.txt"
  val commands = Source.fromFile(fileName).getLines().toSeq

  commands.foldLeft(Calculator(0))(execute).print()



  def execute(calculator: Calculator, command: String): Calculator = {
    command.toLowerCase match {
      case s"+ $first $second" => calculator.add(first.toInt, second.toInt)
      case s"+ $second" => calculator.add(second = second.toInt)

      case s"- $first $second" => calculator.subtract(first.toInt, second.toInt)
      case s"- $second" => calculator.subtract(second = second.toInt)

      case s"* $first $second" => calculator.multiply(first.toInt, second.toInt)
      case s"* $second" => calculator.multiply(second = second.toInt)

      case s"/ $first $second" => calculator.divide(first.toInt, second.toInt)
      case s"/ $second" => calculator.divide(second = second.toInt)

      case s"- $first" => calculator.negation(first.toInt)
      case "-" => calculator.negation()

      case "print" => calculator.print()
      case s"#$_" => calculator

      case _ => println("Invalid Command")
        calculator
    }
  }

}
