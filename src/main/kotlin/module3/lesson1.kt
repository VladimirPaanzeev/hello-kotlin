package module3

fun main() {
    val number: Int = 5

    val firstVariable = 5
    var secondVariable = 10

    exponentiation(number, firstVariable)
    exponentiation(number, secondVariable)
}
fun exponentiation (exponent: Int, x: Int): Long {
    var result = 1
    for (i in 0.. exponent ) {
        result *= x
    }
    println("Число $x в степени $exponent равно: $result")
    return result.toLong()
}
