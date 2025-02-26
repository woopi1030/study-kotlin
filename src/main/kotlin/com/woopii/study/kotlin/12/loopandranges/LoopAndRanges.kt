package src.main.kotlin.com.woopii.study.kotlin.`12`.loopandranges

fun main() {
    for (i in 1..3) {
        println("hey $i")
    }

    val range1 = 1..10
    val range2 = 0 until 10
    println(range1)
    println(range2)

    var sum = 0
    for (n in 10..100) {
        sum += n
    }
    println("sum = $sum")

    showRange(1..5)
    showRange(0 until 5)
    showRange(5 downTo 1)
    showRange(0..9 step 2)
    showRange(0 until 10 step 2)
    showRange(9 downTo 2 step 3)

    for (c in 'a'..'z') {
        print(c)
    }

    val s = "abc"
    for (i in 0..s.lastIndex) {
        print(s[i] + 1)
    }

    val ch : Char = 'a'
    println(ch + 25)
    println(ch < 'z')

    for (ch in "Jnskim ") {
        print(ch + 1)
    }

    println(hasChar("kotlin", 't'))
    println(hasChar("kotlin", 'a'))

    repeat(2) {
        println("hi")
    }
}

fun showRange(r: IntProgression) {
    for (i in r) {
        print("$i ")
    }

    print(" // $r")
    println()

}

fun hasChar(s:String, ch:Char): Boolean {
    for (c in s) {
        if (c == ch) return true
    }
    return false
}