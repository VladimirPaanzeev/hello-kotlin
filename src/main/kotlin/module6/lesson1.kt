package module6

import kotlin.random.Random

fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 5)
    val carList = listOf("Mercedes", "BMW", "Ferrari")

    val emptyList = listOf<String>()
    val secondEmptyList = emptyList<String>()

    val secondList = List(5) { index -> (index + 1) * 5 }
    val secondCarList = List<String> (3) { index -> "Car №${index +1}"}

    val mutableList = mutableListOf<Int>(1, 2, 3, 4, 5)
    val mutableCarList = mutableListOf("Mercedes", "BMW", "Ferrari")

    val mutableSecondList = MutableList(5) {0}
    val mutableSecondCarList = MutableList<String>(size = 3) { index -> "Car №${index + 1}"  }

    println(list)
    println(carList)
    println()
    println(secondList)
    println(secondCarList)
    println()
    println(mutableList)
    println(mutableCarList)

    println(mutableList.size)
    mutableList[1] = 4
    mutableList.add(6)
    mutableList.add(13)

    println()
    println(mutableList)
    println(mutableCarList)
    println(mutableList.size)
    println(mutableList.joinToString(", "))
    println(mutableList[mutableList.lastIndex])

    for (i in list.indices) {
        println(list[i] * i)
    }
    println()

    list.forEach { item -> println(item * item) }
    println()
    list.forEachIndexed { index, i -> println(i * index) }
    println()
    println(list.sumOf { it })
    println(carList.sumOf { it.length })

    val numbers = MutableList(10) {Random.nextInt(-10, 10)}
    val secondNumbers = numbers
    val thirdNumbers = numbers
    println(numbers.joinToString(", "))
    val candidatesToRemove = mutableListOf<Int>()
    numbers.forEach {
        if (it < 0)
            candidatesToRemove.add(it)
    }
    numbers.removeAll(candidatesToRemove)
    println(numbers.joinToString(", "))

    val iterator = secondNumbers.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item < 0)
            iterator.remove()
    }
    println(secondNumbers.joinToString(", "))
    println()
    thirdNumbers.removeAll { it < 0 }
    println(thirdNumbers.joinToString(", "))

    val stringList = list.map { "Это число $it" }
    stringList.forEach { println(it) }
    println()
    val mutableStringList = stringList.toMutableList()
    mutableStringList.add("Новая строка")
    mutableStringList.forEach { println(it) }
}