import scala.io.StdIn._
object Labsheet05_Q03{
  def main(args: Array[String]): Unit = {
    print("Enter a Number : ")
    var n = readInt()
    println(sum(n))
  }
  def sum(n: Int): Int = {
      if (n == 0)
        0
      else
        n + sum(n - 1)
  }
}

