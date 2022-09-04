package module7.lesson3

fun main() {
    /*val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    val lada = Car(brand = "Lada", model = "Vesta", color = "Yellow")
    val audi = Car(brand = "Audi", model = "A3", color = "Red")
    val bmw = Car(brand = "BMW", model = "X6")

    println("Текущая скорость - ${renault.currentSpeed}")
    println("Текущее топливо - ${renault.fuelCount}")

    renault.accelerate(100.0)
    println("Текущая скорость - ${renault.currentSpeed}")
    println("Текущее топливо - ${renault.fuelCount}")

    renault.decelerate(50.0)
    println("Текущая скорость - ${renault.currentSpeed}")
    println("Текущее топливо - ${renault.fuelCount}")
    */

    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")

    println("Текущая скорость - ${renault.currentSpeed} ")

}