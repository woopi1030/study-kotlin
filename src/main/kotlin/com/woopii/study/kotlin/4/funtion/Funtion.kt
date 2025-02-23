fun main() {
    val result = multipleByTwo(5)
    println(result)
}

fun multipleByTwo(x: Int) : Int {
    println("inside multiplyByTwo");
    return x * 2
}