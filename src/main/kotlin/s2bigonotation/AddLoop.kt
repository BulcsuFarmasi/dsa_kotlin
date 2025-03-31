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
    val duration = measureTime {     addUpTo(1000000000)  }

    println("Time elapsed: ${duration.inWholeMilliseconds / 1000} seconds")
}