package s2bigonotation

fun double(list: List<Int>): List<Int> {
    val newList:ArrayList<Int> = arrayListOf()

    for (i in list) {
        newList.add(2 * i)
    }

    return newList
}

fun main () {
    println(double(listOf(2, 3, 4, 6, 70, 46)))
}