package module7.lesson2

import kotlin.random.Random

class Car(val brand: String, val model: String, val color: String = "White") {

    constructor(descriptor: Pair<String, String>, color: String) : this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color
    ) {
       println("Дополнительный конструктор")
    }

    init {
        println("Автомобиль создан")
    }

    var currentSpeed = 0.0

    init {
        println("Второй инит")
    }

    fun move() {
        val distance = Random.nextInt(1, 10)
        println("Автомобиль проехал $distance km")
    }

    fun start() {
        println("Автомобиль завелся")
    }

    fun stop() {
        println(" Автомобиль остановился")
    }
}