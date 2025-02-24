package src.main.kotlin.com.woopii.study.kotlin.`5`.`if`

fun main() {
    if (1 > 0)
        println("it is true")
    if (10 < 11) {
        println("10 < 11")
        println("ten is less then eleven")
    }

    val x: Boolean = 1 >= 1
    if (x)
        println("it is true!")

    println(if (10 > 100) 4 else 42 )

    oneOrTheOther(true)
}

fun oneOrTheOther(exp: Boolean): String =
    if (exp)
        "true!!!!"
    else
        "false!!!!"


