package s4problemsolvingapproach

fun charCount(str: String): HashMap<Char, Int> {
    // make object to return at end
    var result: HashMap<Char, Int> = hashMapOf(Pair('B', 1));
    // loop over string for each character
    for (char in str) {
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
    println(charCount("Benedek"))
}

