import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a number: ")
    val number = scanner.nextInt()

    if (number % 2 == 0) {
        println("$number is an even number.")
    } else {
        println("$number is an odd number.")
    }

    scanner.close()
}
