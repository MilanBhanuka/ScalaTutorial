import scala.io.StdIn._
object Labsheet08_Q02 {
  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    val number = readInt()
    PatternMatching(number)
  }

  def PatternMatching(number: Int): Unit = number match {
    case n if n <= 0 => print("Negative/Zero number")
    case n if n % 2 == 0 => print("Even number")
    case _ => print("Odd number")
  }
}