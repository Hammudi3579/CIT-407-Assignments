open class Person(val name: String, val age: Int) {
    fun printPersonDetails() {
        println("Name: $name, Age: $age")
    }
}

class Student(name: String, age: Int, val grade: Char) : Person(name, age) {
    fun printStudentDetails() {
        super.printPersonDetails()
        println("Grade: $grade")
    }
}

fun main() {
    val person1 = Person("Hassan Ibrahim", 30)
    person1.printPersonDetails()

    val student1 = Student("Dauda Musa", 20, 'A')
    student1.printStudentDetails()
}
