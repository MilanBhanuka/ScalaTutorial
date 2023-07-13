object Q03 {
  def main(args: Array[String]): Unit = {
    print("Input first number   : ")
    var num1 = scala.io.StdIn.readInt()
    print("Input second number  : ")
    var num2 = scala.io.StdIn.readInt()

    printf("Average : %.2f",average(num1,num2))
  }

  private def average(a:Int,b:Int):Double= {
    var sum = a.toFloat+b.toFloat
    var avg = sum/2
    avg
  }
}


