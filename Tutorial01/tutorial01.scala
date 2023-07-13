object Labsheet_01 {
  def main(args: Array[String]): Unit = {
    println("01. Area of the disk : " + AreaofDisk(5))
    println("02. Fahrenheit : " + temperature(35))
    println("03. Volume of the sphere : " + volume(5))
    println("04. Cost : " + cost(60))
    println("05. Total running time : " + (easy(2) + tempo(3) + easy(2)))
  }

  //Q1
  def AreaofDisk(r: Double): Double = Math.PI * r * r

  //Q2
  def temperature(c: Double): Double = c * 1.8 + 32

  //Q3
  def volume(r: Double): Double = (4 / 3) * Math.PI * r * r * r

  //Q4
  def coverPrice(n: Int): Double = 24.95 * n
  def discount(n: Int): Double = n * 24.95 * 40 / 100
  def shipingCost(n: Int): Double = if (n < 50) { n * 3 } else (50 * 3 + (n - 50) * 0.75)
  def cost(n: Int): Double = coverPrice(n) - discount(n) + shipingCost(n)

  //Q5
  def easy(d: Int): Double = d * 8
  def tempo(d: Int): Double = d * 7
}
