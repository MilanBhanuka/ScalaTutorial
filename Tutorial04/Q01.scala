object Q01 {
  def main(args: Array[String]): Unit = {
    print("Enter Deposit Amount :")
    val amount = scala.io.StdIn.readDouble();
    println("Interest : " + calculateInterest(amount));
  }

  def calculateInterest(amount: Double): Double= {
    val interest = amount match {
      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case _ => amount * 0.065
    }
    interest
  }
}
