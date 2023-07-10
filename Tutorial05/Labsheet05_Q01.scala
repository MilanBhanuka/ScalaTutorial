object Labsheet05_Q01 {
  def main(args: Array[String]): Unit = {
    println(isPrime(5))
    println(isPrime(8))
  }
  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case b if (b > a) => gcd(b, a)
    case _ => gcd(b, a % b)
  }

  def isPrime(n: Int, i: Int=2): Boolean = n match {
    case n if n == i => true
    case n if gcd(n, i) > 1 => false
    case _ => isPrime(n, i + 1)

  }
}