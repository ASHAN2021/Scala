object NumberCategorizer {

  def main(args: Array[String]): Unit = {
    
    println("Please enter an integer:")
    val input = scala.io.StdIn.readLine().toInt

    
    val multipleOfThree: Int => Boolean = _ % 3 == 0
    val multipleOfFive: Int => Boolean = _ % 5 == 0

    
    input match {
      case x if multipleOfThree(x) && multipleOfFive(x) =>
        println("Multiple of Both Three and Five")
      case x if multipleOfThree(x) =>
        println("Multiple of Three")
      case x if multipleOfFive(x) =>
        println("Multiple of Five")
      case _ =>
        println("Not a Multiple of Three or Five")
    }
  }
}
