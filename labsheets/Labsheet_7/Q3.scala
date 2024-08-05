object PrimeFilter {

  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2) true
    else !(2 until num).exists(i => num % i == 0)
  }

  def filterPrime(nums: List[Int]): List[Int] = {
    nums.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterPrime(input)
    println(s"Input: $input")
    println(s"Output: $output")
  }
}
