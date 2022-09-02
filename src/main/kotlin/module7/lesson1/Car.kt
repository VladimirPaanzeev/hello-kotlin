package module7.lesson1

import kotlin.random.Random

class Car {
    val brand = "Audi"
    val model = "A3"
    val color = "Red"

    fun move (){
        val distance = Random.nextInt(1, 10)
        println("Автомобиль проехал $distance км")
    }

    fun start() {
        println(" Автомобиль запустился")
    }
    
    fun stop() {
        println(" Автомобиль остановился")
    }
}