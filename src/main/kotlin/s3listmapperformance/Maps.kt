package s3listmapperformance

val instructor =
    mapOf(Pair("firstName", "Kelly"), Pair("isInstructor", true), Pair("favoriteNumbers", listOf(1, 2, 3, 4)))

fun main() {
    println(instructor.keys)
    println(instructor.entries)
    println(instructor.containsKey("firstName"))
}
