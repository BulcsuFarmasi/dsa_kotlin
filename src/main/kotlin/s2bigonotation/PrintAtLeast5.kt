package s2bigonotation

import kotlin.math.max

fun printAtLeast5(n: Int) {
    for (i in 1..max(5, n)) {
        println(i)
    }
}

fun main () {
    printAtLeast5(3)
}