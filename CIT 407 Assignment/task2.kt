import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter your name: ")
    val name = scanner.nextLine()

    print("Enter your age: ")
    val age = scanner.nextInt()

    println("Hello $name, you are $age years old!")

    scanner.close()
}
