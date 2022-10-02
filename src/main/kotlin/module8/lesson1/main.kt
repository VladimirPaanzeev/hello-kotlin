package module8.lesson1

fun main() {
    /*val person = Person("Alex", 25)
    val driver = Driver("Ivan", 46, 2)

    person.age
    person.name
    person.sleep()
    person.eat()
    person.walk()

    driver.age
    driver.name
    driver.sleep()
    driver.eat()
    driver.walk()*/

    val ktDev = KotlinDeveloper(name = "Alex", age = 25)
    val javaDev = JavaDeveloper(name = "Ivan", age = 48, experience = 20)
    val cppDev = CppDeveloper(name = "Anna", age = 30, experience = 7)
    val developer = Developer("Maga", 100, 80)
    val scalaDev = ScalaDeveloper(name = "Scala", age = 30, experience = 5)

    ktDev.writeCode()
    println("ktDev level - ${ktDev.getLevel()}")

    println()
    javaDev.writeCode()
    println("javaDev level - ${javaDev.getLevel()}")

    println()
    cppDev.writeCode()
    println("cppDevLor level - ${cppDev.getLevel()}")

    println()
    developer.writeCode()
    println("developer level - ${developer.getLevel()}")

    println()
    println("javaDev paradigm - ${javaDev.paradigm}")
    println("scalaDev paradigm - ${scalaDev.paradigm}")
}