fun main() {
    val studentScores = mapOf(
        "Emma" to 85,
        "Hassan" to 60,
        "Musa" to 92,
        "Darma" to 75,
        "Mubarak" to 68
    )

    println("Students who scored above 70:")
    for ((name, score) in studentScores) {
        if (score > 70) {
            println("$name: $score")
        }
    }
}