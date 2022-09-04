package module7.lesson3

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
        println("Создан автомобиль $brand $model $color")
    }

    var currentSpeed = 0.0
        private set

    private var fuelCount = 0.0

    init {
        println("Второй инит")
    }

    fun accelerate(speed: Double) {
        val needFuel = speed * 0.1
        if (fuelCount > needFuel) {
            currentSpeed += speed
            useFuel(needFuel)
        }
        else {
            println("Недостаточно топлива")
        }

    }

    fun decelerate(speed: Double) {
        currentSpeed = maxOf(0.0, currentSpeed -speed)
    }
    private fun useFuel(fuelCount: Double) {
        this.fuelCount -= fuelCount
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