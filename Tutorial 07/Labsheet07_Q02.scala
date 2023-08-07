import scala.io.StdIn._
object Labsheet07_Q02 {
  def main(args: Array[String]): Unit = {
    print("Enter number list: ")
    val input = readLine().split(" ").map(_.toInt).toList
    println("Output : "+calculateSquare(input))
  }
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
  }
}


/*
Enter number list: 1 2 3 4 5 6 7 8 9 10
Output : List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
 */