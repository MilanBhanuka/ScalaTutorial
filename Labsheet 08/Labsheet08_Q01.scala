import scala.io.StdIn._
object Labsheet08_Q01 {
  def Interest(): Double => Double = {
    deposit => {
      deposit match {
        case amount if amount <= 20000 => amount * 0.02
        case amount if amount <= 200000 => amount * 0.04
        case amount if amount <= 2000000 => amount * 0.035
        case _ => deposit * 0.065
      }
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter deposit amount: ")
    val deposit = readDouble()
    val calculateInterest: Double => Double =Interest()
    println("The interest earned on Rs. $deposit deposit is Rs. " + calculateInterest(deposit))
  }

}