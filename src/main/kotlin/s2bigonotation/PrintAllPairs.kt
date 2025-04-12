package s2bigonotation

fun printAllPairs(n:Int) {
    for (i in 0..< n) {
        for (j in 0..<n) {
            println("$i $j")
        }
    }
}

fun main () {
    printAllPairs(5)
}