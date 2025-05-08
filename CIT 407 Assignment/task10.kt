fun main() {
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    val result1 = multiply(5, 4)
    println("Product of 5 and 4 is: $result1")

    val result2 = multiply(-2, 10)
    println("Product of -2 and 10 is: $result2")
}