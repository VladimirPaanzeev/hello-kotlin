package module3

fun main() {
    print("Введите степень числа: ")
    val number: Int? = readLine()?.toIntOrNull()?: return

    print("Введите первое число: ")
    val firstVariable: Int? = readLine()?.toIntOrNull()?: return
    print("Введите второе число: ")
    var secondVariableI: Int? = readLine()?.toIntOrNull()?: return
}