class Car(val brand: String, val model: String, val year: Int) {
  fun displayDetails() {
    println("Brand: $brand, Model: $model, Year: $year")
  }
}

fun main() {
  val car1 = Car("Toyota", "Camry", 2022)
  car1.displayDetails()

  val car2 = Car("Honda", "Civic", 2021)
  car2.displayDetails()
}
