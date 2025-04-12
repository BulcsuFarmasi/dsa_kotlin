package s2bigonotation

import kotlin.math.min

fun printAtMost5(n: Int) {
    for (i in 1..min(5, n)) {
        println(i)
    }
}

fun main () {
    printAtMost5(78)
}