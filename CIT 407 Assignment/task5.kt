fun sum(a: Int, b: Int): Int {
  return a + b
}

fun main() {
  val result1 = sum(5, 3)
  println("Sum of 5 and 3 is: $result1")

  val result2 = sum(-10, 20)
  println("Sum of -10 and 20 is: $result2")

  val result3 = sum(0, 0)
  println("Sum of 0 and 0 is: $result3")
}