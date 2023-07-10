import scala.io.StdIn._
import scala.util.control.Breaks._
object Labsheet05_Q02{
  def main(args: Array[String]): Unit = {
    print("Enter a Number : ")
    var n = readInt()
    printSeq(n)
  }
  def gcd(a:Int,b:Int):Int=b match{
      case 0=>a
      case b if(b>a) =>gcd(b,a)
      case _ =>gcd(b,a%b)
    }
  def isPrime(n:Int,i:Int):Boolean= n match{
      case n if n==i => true
      case n if gcd(n,i)>1 => false
      case _  =>isPrime(n,i+1)
    }
    def printSeq(n:Int,i:Int=2){
      if(n==i) {
        break
      }
      if(isPrime(i,2)){
        println(i)
      }
      printSeq(n,i+1)
    }
}
