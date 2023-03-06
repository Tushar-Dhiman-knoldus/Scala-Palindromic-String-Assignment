
class PalindromicStringChecker {

  private var string_input = ""

  // FUNCTION TO TAKE STRING AS A INPUT FROM THE USER.
  def takeInput(): String = {

    println("Enter any string to get the palindromic string")
    string_input = scala.io.StdIn.readLine()

    string_input

  }

  //FUNCTION TO GENERATE THE PALINDROME OR REVERSE OF THE STRING ENTERED BY USER.

  def generatePalindrome(user_string: String): String = {

    var palindrome_string = ""
    for (index <- user_string.length - 1 to 0 by -1) {

      palindrome_string = palindrome_string + user_string.charAt(index)

    }

    palindrome_string
  }

  // FUNCTION TO CHECK WHETHER THE REVERSED STRING IS EQUAL TO THE USER ENTERED STRING.

  def checkPalindrome(palindrome_string: String, user_string: String): Unit = {

    if (palindrome_string == user_string) {
      println("YES")
    }
    else {
      println("NO")
    }

  }

}

object PalindromicString extends App {

  private val palindromicStringChecker_object = new PalindromicStringChecker()

  private val user_string = palindromicStringChecker_object.takeInput()
  println("Inputted String is = " + user_string)


  try {
    val palindrome_string = palindromicStringChecker_object.generatePalindrome(user_string)

    palindromicStringChecker_object.checkPalindrome(palindrome_string, user_string)
  }
  catch {
    case exception: Exception =>
      println("Something went wrong" + exception.getMessage)
  }


}
