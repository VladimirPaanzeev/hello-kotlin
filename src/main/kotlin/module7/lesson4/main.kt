package module7.lesson4

fun main() {
    /*println("Высота - ${EiffelTower.height}")
    EiffelTower.turnOnBacklights()
    EiffelTower.turnOffBacklights()*/

    val tower1 = EiffelTower
    val tower2 = EiffelTower

    println("Башня №1 подсветка включена? - ${tower1.backlightsOn}")
    println("Башня №2 подсветка включена? - ${tower2.backlightsOn}")

    tower1.turnOnBacklights()

    println("Башня №1 подсветка включена? - ${tower1.backlightsOn}")
    println("Башня №2 подсветка включена? - ${tower2.backlightsOn}")

    println("Количество коллес - ${Car.wheelsCount}")
    val classType = Car.getCarClass(4.5)
    println(classType)
}