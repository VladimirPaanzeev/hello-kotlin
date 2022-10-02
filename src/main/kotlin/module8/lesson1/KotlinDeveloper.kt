package module8.lesson1

class KotlinDeveloper : Developer {
    constructor(name: String, age: Int) :super(name, age)
    constructor(name: String, age: Int, experience: Int = 2):super(name, age, experience)

    override fun writeCode() {
        println("Kt developer writing kt code")
        super.getCoffeeBreak()
    }

    override fun getCoffeeBreak() = true
}
