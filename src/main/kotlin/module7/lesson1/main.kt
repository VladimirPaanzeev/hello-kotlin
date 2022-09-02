package module7.lesson1

fun main() {
    val auto = Car()

    println("Информация по автомобилю")
    println("${auto.brand} ${auto.model} ${auto.color}")

    auto.start()
    auto.move()
    auto.move()
    auto.move()
    auto.stop()
}