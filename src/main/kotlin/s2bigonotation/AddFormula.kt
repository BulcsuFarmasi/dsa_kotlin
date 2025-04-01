package s2bigonotation

import kotlin.time.measureTime

fun addUpToFormula(n: Int) : Int {
    return n * (n + 1) / 2
}

fun main () {
    val startTime = System.currentTimeMillis()

    addUpToFormula(1000000000)

    val endTime = System.currentTimeMillis()

    println("Time elapsed: ${(endTime - startTime) / 1000f} seconds")
}