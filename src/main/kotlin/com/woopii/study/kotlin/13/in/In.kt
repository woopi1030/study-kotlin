package src.main.kotlin.com.woopii.study.kotlin.`13`.`in`

fun main() {
    val percent = 35
    println(percent in 1..100)

    val values = 1..3
    for (v in values) {
        println("iteration $v")
    }

    val v = 2
    if (v in values)
        println("$v is a member of $values")

    println('t' in "kotlin")
    println('a' in "kotlin")

    println(isDisit('a'))
    println(isDisit('5'))
    println(notDisit('z'))

    inFloatRange(0.99999)
    inFloatRange(5.0)
    inFloatRange(10.0)
    inFloatRange(10.000001)

    println("ab" in "aa".."az")
    println("ba" in "aa".."az")
}

fun isDisit(ch: Char) = ch in '0'..'9'

fun notDisit(ch: Char) =ch !in '0'..'9'

fun inFloatRange(n: Double) {
    val r = 1.0..10.0
    println("$n in $r? ${n in r}")
}