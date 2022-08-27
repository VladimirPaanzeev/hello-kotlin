package module3

fun main() {
    val firstVariable = 6
    var secondVariable = 10
    secondVariable += firstVariable
    println("Сумма чисел $firstVariable и $secondVariable равна: ${sum(firstVariable, secondVariable)}")
}

fun sum(number1: Int, number2: Int) = number1 + number2
