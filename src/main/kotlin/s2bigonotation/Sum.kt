package s2bigonotation

fun sum(list: List<Int>): Int {
    var total = 0

    for (i in list) {
        total += i
    }

    return total
}

fun main() {
    println(sum(listOf(44, 23, 77, 16, 9)))
}
