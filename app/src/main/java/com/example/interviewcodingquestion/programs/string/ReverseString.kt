package com.example.interviewcodingquestion.programs.string

/**
 * Reverse the String
 */

fun main() {
    val str = "ram"
    // val print  = reverseStr(str)
    // println(print)
    val result = reverseUsingRecursive(str)
    println(result)
}


/**
 * Approach Name: Iterative String Reversal
 * Time Complexity: The time complexity of this function is O(n), where n is the length of the input string.
 * This is because the function iterates through each character of the string exactly once.
 *
 * Space Complexity: The space complexity is also O(n). Although a new string result is created to
 * store the reversed string, its size is directly proportional to the size of the input string string.
 *
 */

private fun reverseStr(string: String): String {
    var result = ""
    for (i in string.indices) {
        val char: Char = string[i]
        result = char + result
    }
    return result
}

/**
 * Recursive String Reversal
 *  Time Complexity: The time complexity of this function is O(n)
 *  Space Complexity: The space complexity is also O(n) due to the recursive calls
 */

private fun reverseUsingRecursive(string: String): String {
    if (string.isEmpty() || string.length == 1) {
        return string
    }
    return reverseUsingRecursive(string.substring(1)) + string[0]
}
