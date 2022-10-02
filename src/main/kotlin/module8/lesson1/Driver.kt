package module8.lesson1

class Driver(
    nameArg: String,
    ageArg: Int,
    val experience: Int
    ) : Person(nameArg, ageArg) {
        fun drive() = println("driving")
}