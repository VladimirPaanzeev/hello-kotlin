package module3

fun main() {
    print("Введите степень числа: ")
    val number: Int? = readLine()?.toIntOrNull()?: return

    print("Введите первое число: ")
    val firstVariable: Int? = readLine()?.toIntOrNull()?: return
    print("Введите второе число: ")
    val secondVariable: Int? = readLine()?.toIntOrNull()?: return

    exponentiation(number?:return, firstVariable?:return)
    exponentiation(number?:return, secondVariable?:return)
}
fun exponentiation (exponent: Int, x: Int): Long {
    var result = 1
    for (i in 1.. exponent ) {
        result *= x
    }
    println("Число $x в степени $exponent равно: $result")
    return result.toLong()
}
