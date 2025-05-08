fun main() {
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    println("\nEven numbers from 1 to 20:")
    for (i in 2..20 step 2) {
        print("$i ")
    }
    println()
}
