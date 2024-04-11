package com.example.interviewcodingquestion.programs.string

/**
 *  Maximum occurrence character in string with count
 *
 */

fun main() {
    val str = "ababcd"
    val result = maxOccurrence(str)
    println("Maximum occurring character: ${result.first}, Count: ${result.second}")
    println(maxOccurrence2(str))
    maxOccurenceWithCount(str)

}

/**
 *  Approach Name: HashMap with Pair
 * Time Complexity: O(n), where  n is the length of the input string.
 * This is because you iterate through the string once to count the occurrences of each character.
 *
 * Space Complexity: O(k), where k is the number of unique characters in the input string.
 *  This is because you store each unique character along with its count in the HashMap.
 */
private fun maxOccurrence(string: String): Pair<Char, Int> {
    val map = hashMapOf<Char, Int>()
    var maxCount = 0
    var maxChar: Char? = null
    for (char in string) {
        val count = map.getOrDefault(char, 0) + 1
        map[char] = count
        if (count > maxCount) {
            maxCount = count
            maxChar = char
        }
    }
    return Pair(maxChar!!, maxCount)
    // return Pair(maxChar, maxCount) as Pair<Char, Int>
    // return maxChar?.let { Pair(it, maxCount) }
}

/**
 *  Approach Name: Map of Maximum Occurrence Character
 *  Time Complexity: O(n)
 *  Space Complexity: O(n)
 */
private fun maxOccurrence2(string: String): Map<String, String>? {
    val map = hashMapOf<Char, Int>()
    var maxCount = 0
    var maxChar: Char? = null
    for (char in string) {
        val count = map.getOrDefault(char, 0) + 1
        map[char] = count
        if (count > maxCount) {
            maxCount = count
            maxChar = char
        }
    }
    //return if (maxChar != null) mapOf("character" to maxChar, "count" to maxCount) else null
    if (maxChar != null) {
        return mapOf("char" to maxChar.toString(), "count" to maxCount.toString())
    } else {
        return null
    }
}

fun maxOccurenceWithCount(str:String) {
    val map = mutableMapOf<Char, Int>()
    var maxChar: Char? = null
    var maxCount = Int.MIN_VALUE
    for(char in str){
        val count = map.getOrDefault(char, 0) + 1
        map[char] = count

    }
    for((char, count) in map){
        if(count > maxCount){
            maxChar = char
            maxCount = count
        }

    }
    println("$maxChar $maxCount")
}
