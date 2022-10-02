package module6

fun main() {
    val list = listOf<String>("Один", "Два", "Три")
    val map = mutableMapOf<Int, String>()

    list.forEach { item -> println(item) }
    list.forEachIndexed { index, i -> map[index+1] = i }
    println(map)
}