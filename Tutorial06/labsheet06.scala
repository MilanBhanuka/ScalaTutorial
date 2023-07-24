import scala.io.StdIn._

object Lb6 {
  def main(args : Array[String]) : Unit = {
    print("Enter a string to encrypt : ")
    val str = readLine()

    val key = 3

    cipher(str, key);
  }

  def encrypt(ch : Char, key : Int) : Char = {
    if(ch.isUpper){
      ((ch - 'A' + (26 - key)) % 26 + 'A').toChar
    }
    else{
      ((ch - 'a' + (26 - key)) % 26 + 'a').toChar
    }
  }

  def decrypt(ch : Char, key : Int) : Char = {
    if(ch.isUpper){
      ((ch - 'A' + key) % 26 + 'A').toChar
    }
    else{
      ((ch - 'a' + key) % 26 + 'a').toChar
    }
  }

  def cipher(str : String, key : Int) : Unit = {
    val encrypted = str.map(ch => if(ch.isLetter) encrypt(ch, key) else ch)
    println("Encrypted text : " + encrypted)
    println("Decrypted text : " + encrypted.map(ch => if(ch.isLetter) decrypt(ch, key) else ch))
  }
}
