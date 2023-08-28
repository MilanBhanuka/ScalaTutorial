object Labsheet10_Q02 {

  def main(args: Array[String]): Unit = {
    print("Enter the list of words, separated by space: ")
    val input = scala.io.StdIn.readLine()
    val words = input.split(" ").toList

    println("Total count of letter occurrences: " + countLetters(words))
  }
  def countLetters(words: List[String]): Int = {
    val wordLengths = words.map(word => word.length)
    val totalLetterOccurrences = wordLengths.reduce((length1, length2) => length1 + length2)
    totalLetterOccurrences
  }
}
