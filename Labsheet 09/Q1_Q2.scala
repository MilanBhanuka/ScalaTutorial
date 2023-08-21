class Rational(n:Int,d:Int){
  require(d!=0)
  val numerator:Int = n
  val denominator:Int = d
  def neg:Rational = new Rational(-numerator,denominator)
  def sub(that:Rational):Rational = new Rational(numerator*that.denominator - that.numerator*denominator,denominator*that.denominator)
  override def toString: String = numerator + "/" + denominator
}

object Main{
  def main(args: Array[String]): Unit = {
    val A =new Rational(1,2)
    val minusA = A.neg
    println(s"A = $A      -A = $minusA")

    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    val result = x.sub(y).sub(z)
    println(s"x-y-x = $result")

  }
}


