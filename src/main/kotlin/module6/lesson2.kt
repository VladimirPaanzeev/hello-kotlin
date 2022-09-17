package module6

fun main() {
    /*    val map = mapOf<Int, String>(1 to "2", Pair(2, "123"))
        val mutableMap = mutableMapOf<Int, String>()
        val hashMap = hashMapOf(1 to "one", 2 to "two", 3 to "three")
        val treeMap = sortedMapOf(1 to "one")
        val linkedHashMap = linkedMapOf<Int, Int>()

        map[222] = "1234"
        hashMap[222] = "1234"
        treeMap[222] = "1234"
        linkedHashMap[222] = 1234
        */
    val priceList = mutableMapOf(
        "Молоко" to 80,
        "Йогурт" to 50,
        "Яблоки" to 150,
        "Бананы" to 70,
        "Кола" to 100,
        "Апельсиновый сок" to 150
    )
    /*
        val priceListHash = hashMapOf(
            "Молоко" to 80,
            "Йогурт" to 50,
            "Яблоки" to 150,
            "Бананы" to 70,
            "Кола" to 100,
            "Апельсиновый сок" to 150
        )

        val priceListSorted = sortedMapOf(
            "Молоко" to 80,
            "Йогурт" to 50,
            "Яблоки" to 150,
            "Бананы" to 70,
            "Кола" to 100,
            "Апельсиновый сок" to 150
        )
    println(priceListHash)
    println(priceListSorted)
        */
    println(priceList)
/*

    priceList["Мороженное"] = 75
    priceList["Молоко"] = 90
    println()
    println(priceList)
    priceList.remove("Йогурт")
    println()
    println(priceList)
    println()
    println(priceList.keys)
    println(priceList.values.maxOrNull())
    val maxValue = priceList.values.maxOrNull()
    println(priceList.filterValues { it == maxValue })

    for (entry in priceList.entries) {
        println("Товар: ${entry.key} - стоимость: ${entry.value}")
    }
    println()

    priceList.forEach { entry -> println("Товар: ${entry.key} - стоимость: ${entry.value}") }
    println()
    priceList.forEach { t, u -> println("$t - $u") }
*/

    val sortedMap = priceList.toSortedMap(compareBy<String> { it.length }.thenBy { it })
    println(sortedMap)



}