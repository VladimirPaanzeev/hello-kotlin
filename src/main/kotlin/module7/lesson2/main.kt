package module7.lesson2

fun main() {
/*    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    val lada = Car(brand = "Lada", model = "Vesta", color = "Yellow")
    val audi = Car(brand = "Audi", model = "A3", color = "Red")
    val bmw = Car(brand = "BMW", model = "X6")

    printInfo(vw)
    printInfo(lada)
    printInfo(audi)
    printInfo(bmw)*/

    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")
    printInfo(vw)
    printInfo(renault)
}

fun printInfo(car: Car) {
    println("Брэнд - ${car.brand} модель - ${car.model} цвет - ${car.color}")
}