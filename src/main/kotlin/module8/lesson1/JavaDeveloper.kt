package module8.lesson1

class JavaDeveloper: Developer {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, experience: Int) : super(name, age, experience)

    override fun writeCode() {
        println("Java developer writing java code")
    }
}