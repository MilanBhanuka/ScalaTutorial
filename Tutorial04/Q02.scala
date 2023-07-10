object Q02 {
  def main(args: Array[String]): Unit = {
    print("Enter an integer: ")
    val n = scala.io.StdIn.readInt()
    println("Entered Number Is " + message(n))
  }

  def message(num: Int): String = num match {
    case num if num <= 0 => "Negative/Zero"
    case num if num % 2 == 0 => "Even Number"
    case _ => "Odd Number"
  }
}
