package com.example.interviewcodingquestion.programs.string

/**
 * How do you print the first non-repeated character from a string?
 *   (Time: O(n), Space: O(n))
 */

fun main(){
    val str = "abcdab"
   // val result = firstNonRepeatedCharUsingHashMap(str)
    val result = firstNonRepeatedCharSinglePass(str)
    println(result.toString())
}

fun firstNonRepeatedCharUsingHashMap(str: String): Char? {
    val charCount = HashMap<Char, Int>()
    for (char in str) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    for (char in str) {
        if (charCount[char] == 1) {
            return char
        }
    }
    return null
}

/**
 * Using Single Pass
 * (Time: O(n), Space: O(1))
 */

fun firstNonRepeatedCharSinglePass(str: String): Char? {
    val seen = HashSet<Char>()
    val repeated = HashSet<Char>()
    for (char in str) {
        if (!seen.add(char)) {
            repeated.add(char)
        }
    }
    for (char in str) {
        if (!repeated.contains(char)) {
            return char
        }
    }
    return null
}

