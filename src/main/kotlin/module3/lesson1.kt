package module3

fun main() {
    print("Введите степень числа: ")
    val number: Int = readLine()?.toIntOrNull() ?: return

    print("Введите первое число: ")
    val firstVariable: Int = readLine()?.toIntOrNull() ?: return
    print("Введите второе число: ")
    val secondVariable: Int = readLine()?.toIntOrNull() ?: return

    exponentiation(number?: return, firstVariable?:return )
    exponentiation(number?: return, secondVariable?:return )
    sum(firstVariable?: return, secondVariable?: return)
    multiply(firstVariable?:return, secondVariable?: return)


}

fun exponentiation(exponent: Int?, x: Int?): Int {
    var result = 1
    if (exponent != null && x != null) {

        for (i in 1..exponent) {
            result *= x
        }
        println("Число $x в степени $exponent равно: $result")
    } else {
        result = 0
        println ("Не корректный ввод")
    }

    return result
}

fun multiply(a: Int?, b: Int?): Int{
    val c: Int
    if (a != null && b != null){
        c = a * b
        println("Произведение чисел $a и $b равно: $c")
    }
    else {
        println ("Не корректный ввод")
        c = 0
    }
    return c
}

fun sum(number1: Int?, number2: Int?): Int? {
    val result: Int
    if(number1 != null && number2 != null){
        result = number1 + number2
        println("Сумма чисел $number1 и $number2 равна: $result")
    }
    else {
        println ("Не корректный ввод")
        result = 0
    }
    return result
}
