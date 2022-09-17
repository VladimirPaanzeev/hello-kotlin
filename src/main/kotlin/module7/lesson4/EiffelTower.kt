package module7.lesson4

object EiffelTower {
    /*private*/ var backlightsOn = false
    val height = 324

    fun turnOnBacklights() {
        println("Подсветка включена")
        backlightsOn = true
    }

    fun turnOffBacklights() {
        println("Подсветка выключена")
        backlightsOn = false
    }
}