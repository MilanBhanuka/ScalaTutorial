import scala.util.control.Breaks.break
object Labsheet05_Q06 {
  def main(args: Array[String]): Unit = {
    print("Enter a Number : ")
    var n = scala.io.StdIn.readInt()
    printFibo(n,0)
  }
  def fib(n: Int): Int = {
    if (n <= 1)
      n
    else
      fib(n - 1) + fib(n - 2)
  }

  def printFibo(n: Int, i: Int) {
    if (n == i)
      break
    else
      println(fib(i))
    printFibo(n, i + 1)
  }
}
