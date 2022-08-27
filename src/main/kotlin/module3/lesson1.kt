package module3

fun main() {
    val firstVariable = 6
<<<<<<< Updated upstream
    val secondVariable = 10
    secondVariable += firstVariable
=======
    var secondVariable = 10
>>>>>>> Stashed changes
    println("Сумма чисел $firstVariable и $secondVariable равна: ${sum(firstVariable, secondVariable)}")
}

fun sum(number1: Int, number2: Int) = number1 + number2
