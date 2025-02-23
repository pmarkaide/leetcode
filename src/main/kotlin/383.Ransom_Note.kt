

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val charMap = mutableMapOf<Char, Int>()
    for (c in magazine) {
        charMap[c] = charMap.getOrDefault(c, 0) + 1
    }
    for (c in ransomNote) {
        if (c !in charMap || charMap[c] == 0) {
            return false
        }
        charMap[c] = charMap[c]!! - 1
    }
    return true
}


fun main(){
    println(canConstruct("aa","aab"))
}