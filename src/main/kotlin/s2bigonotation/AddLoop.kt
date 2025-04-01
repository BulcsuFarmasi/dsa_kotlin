package s2bigonotation

import kotlin.time.measureTime

fun addUpTo(n: Int) : Int {
    var total = 0

    for (i in 1..n) {
        total += i
    }

    return total
}

fun main () {
    val startTime = System.currentTimeMillis()

    addUpTo(1000000000)

    val endTime = System.currentTimeMillis()

    println("Time elapsed: ${(endTime - startTime) / 1000f} seconds")
}