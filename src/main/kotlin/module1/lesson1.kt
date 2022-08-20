package module1

fun main() {
    val hello = "Привет"
    val kotlin = "kotlin"

    println("Привет друг!")
    println("Как тебя зовут?")
    val name = readLine()
    if (name != null) {
        printHello(hello, name)
    }
}

fun printHello(a: String, b: String){
    println("$a $b! Очень приятно :)")
    println("А я kotlin.")
    println()
    println("Давай дружить! :)")
}