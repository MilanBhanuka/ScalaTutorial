import scala.io.StdIn.readLine;
object Labsheet10_Q01 {
  def main(args: Array[String]): Unit = {
    println("Enter temperatures in Celsius, separated by spaces: ")
    val input = readLine()
    val temperaturesCelsius = input.split(" ").map(_.toDouble).toList
    println(f"Average temperature in Fahrenheit: "+ calculateAverage(temperaturesCelsius))
  }

  def calculateAverage(temperaturesCelsius: List[Double]): Double = {
    val temperaturesFahrenheit = temperaturesCelsius.map(celsius => (celsius * 9 / 5) + 32)
    val totalFahrenheit = temperaturesFahrenheit.reduce((temp1,temp2) => temp1 + temp2)
    val averageFahrenheit = totalFahrenheit / temperaturesFahrenheit.length.toDouble
    averageFahrenheit
  }
}
