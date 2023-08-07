import scala.io.StdIn._
object Labsheet07_Q01 {
  def main(args: Array[String]): Unit = {
    print("Enter number list: ")
    val input =readLine().split(" ").map(_.toInt).toList
    println("Output : "+filterEvenNumbers(input))
  }
  def filterEvenNumbers(numbers: List[Int]): List[Int]= {
    numbers.filter(number => number % 2 == 0)
  }
}

/*
Enter number list: 1 2 3 4 5 6 7 8 9 10
List(2, 4, 6, 8, 10)
*/