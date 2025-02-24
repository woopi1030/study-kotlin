
fun main() {
    val result = multipleByTwo(5)
    println(result)

    sayHello()
    sayGoodbye()

    println(multiplyByThree(5))
    println(multiplyByFour(5))
}

fun multipleByTwo(x: Int) : Int {
    println("inside multiplyByTwo");
    return x * 2
}

fun sayHello() {
    println("Hello!")
}

fun sayGoodbye(): Unit {
    println("GoodBye!")
}

fun multiplyByThree(x: Int): Int = x * 3

fun multiplyByFour(x: Int) = x * 4