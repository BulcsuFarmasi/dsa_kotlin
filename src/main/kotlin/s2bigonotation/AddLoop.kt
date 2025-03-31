package s2bigonotation

fun addUpTo(n: Int) : Int {
    var total = 0

    for (i in 1..n) {
        total += i
    }

    return total
}

fun main () {
    println(addUpTo(9))
}