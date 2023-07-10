object Q03 {
  def main(args: Array[String]): Unit = {
    println(toUpper("Benny"))
    println(formatNames("Niroshan", 1))
    println(toLower("Saman"))
    println(formatNames("Kumara", 5))
  }

  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def formatNames(name: String, index: Int): String = {
    val charToChange = name.charAt(index)
    val charModified = charToChange.toUpper
    name.patch(index, charModified.toString, 1)
  }
}







//patch() - replace the character at the specified index with the modified character