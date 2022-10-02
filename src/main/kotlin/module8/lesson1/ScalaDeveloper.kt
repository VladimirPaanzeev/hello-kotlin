package module8.lesson1

class ScalaDeveloper: Developer {
    constructor(name: String, age: Int) :super(name, age)
    constructor(name: String, age: Int, experience: Int = 2):super(name, age, experience)

    override val paradigm: String = "Functional"
}