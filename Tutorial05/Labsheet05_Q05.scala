import scala.io.StdIn.readInt
object Labsheet05_Q05 {
  def main(args: Array[String]): Unit = {
    print("Enter a Number : ")
    var n = readInt()
    println(evenAddition(n))
  }

  def evenAddition(n: Int): Int = {
    if (n % 2 == 0) {
      if (n == 0)
        0
      else
        n + evenAddition(n - 1)
    }
    else {
      evenAddition(n - 1)
    }
  }
}
