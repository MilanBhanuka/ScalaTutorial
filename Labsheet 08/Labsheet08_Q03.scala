import scala.io.StdIn._
object Labsheet08_Q03 {
  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def format(names: List[String], formatFunction: String => String): List[String] = {
    names.map(formatFunction)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    print("Upper: 1 \nLower: 2 \nEnter case:  ")
    val Case = readInt()

    val formatCase = Case match {
      case 1 => toUpper(_)
      case 2 => toLower(_)
    }

    println("\nOutput:")
    format(names, formatCase).foreach(println)
  }
}
