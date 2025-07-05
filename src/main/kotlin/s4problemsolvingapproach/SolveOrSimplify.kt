package s4problemsolvingapproach

fun charCount(str: String): HashMap<Char, Int> {
    // make object to return at end
    val result: HashMap<Char, Int> = hashMapOf()
    // loop over string for each character
    for (i in str.indices) {
        val char = str[i].lowercaseChar()
        if (result[char] != null) {
            result[char] = result[char]!! + 1
        } else {
            result[char] = 1
        }
    }
    // if char is a number/letter AND a key in object, add one to count
    // if char is number/letter AND not in object add it to object and set value to 1
    /// if char is something else (space, period, etc.) don't do anything
    // return object at end
    return result
}

fun main() {
    println(charCount("Julian McMahon"))
}

