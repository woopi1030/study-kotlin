package src.main.kotlin.com.woopii.study.kotlin.`6`.stringtemplate

fun main() {
    val answer = 42
    println("found $answer")
    println("printing a $1")

    val s = "hi\n"
    val n = 11
    val d = 3.14
    println("first: " + s + "second: " + n + ", third: " + d)

    val condition = true
    println("${if (condition) 'a' else 'b'}")

    val x = 11
    println("$x + 4 = ${x + 4}")

    val ss = "value"
    println("s = \"$ss\".")
    println("""s = "$ss".""")
}