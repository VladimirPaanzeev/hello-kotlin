package module3

fun main() {
    val number: Int = 5

    val firstVariable = 6
    var secondVariable = 10
    secondVariable += firstVariable
    println("Сумма чисел $firstVariable и $secondVariable равна: ${Sum(firstVariable, secondVariable)}")
}

fun Sum(number1: Int, number2: Int) = number1 + number2


//5.04