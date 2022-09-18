package module6


import java.util.TreeSet
import kotlin.collections.HashSet

fun main() {
/*

    val set = setOf<Int>(1,3,1,2)
    val hashSet = hashSetOf(1,3,3,2,1)
    val sortedSet = sortedSetOf(1,3,3,2,1).toSet()
    val linkedSet = linkedSetOf(1,2,3,3,2,1)

    val hashSet2 = HashSet<String>()
    val sortedSet2 = TreeSet<String>()
    val linkedSet2 = LinkedHashSet<String>()

    println(linkedSet.joinToString(": "))
*/
/*
    val firstSet = setOf(1,2,3, 4)
    val secondSet = setOf(3,4,5,6)

    val unionSet = firstSet.union(secondSet)          // Сложение множеств
    val substract = firstSet.subtract(secondSet)      // Вычитание 1 - 2
    val intersect = firstSet.intersect(secondSet)     // Пересечение

    println(unionSet)
    println(substract)
    println(intersect)
    */

    val northBusSet = setOf(1,4,5,6,12,13,16,19,20)
    val southBusSet = setOf(1,2,3,7,4,5,6,8,16,19,20,31)

    val onlyNorthBus = northBusSet.subtract(southBusSet) // Автобусы которые ходят только по северу
    val onlySouthBus = southBusSet.subtract(northBusSet) // Автобусы которые ходят только по югу
    val globalBus = northBusSet.intersect(southBusSet)   // Автобусы ходят и в южную и в северную части города

    println("Северные автобусы: $onlyNorthBus")
    println("Южные автобусы: $onlySouthBus")
    println("Общегородские автобусы: $globalBus")
}