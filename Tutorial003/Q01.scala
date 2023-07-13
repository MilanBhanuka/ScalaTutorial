object Q01 {
  def main(args: Array[String]): Unit = {
    print("Input a string : ")
    var str = scala.io.StdIn.readLine()
    var reverseStr =reverse(str)
    print(reverseStr)
  }

  def reverse( str:String):String = {
    if(str.isEmpty){
      ""
    }
    else{
      reverse(str.tail)+str.head
    }
  }
}
