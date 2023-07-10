import scala.io.StdIn._
object Labsheet05_Q04 {
    def main(args: Array[String]): Unit = {
      print("Enter a Number : ")
      var n = readInt()
      println(EvenOdd(n));
    }
    def EvenOdd(num: Int): String = num match {
      case 1 => "Odd"
      case 0 => "Even"
      case _ if (num < 0) => EvenOdd(-num)
      case _ => EvenOdd(num - 2)
    }
}
