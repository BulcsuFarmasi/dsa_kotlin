package s2bigonotation

fun countUpDown(n:Int) {
    println("Going up!")

    for (i in 0..<n){
        println(i)
    }

    println("At the top!\nGoing down...")

    for (j in n - 1 downTo 0) {
        println(j)
    }
    println("Back down. Bye!")
}


fun main () {
    countUpDown(10)
}