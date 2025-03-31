package s2bigonotation

import kotlin.time.measureTime

fun addUpToFormula(n: Int) : Int {
    return n * (n + 1) / 2
}

fun main () {
    val duration = measureTime {     addUpToFormula(1000000000)  }

    println("Time elapsed: ${duration.inWholeMilliseconds / 1000} seconds")
}