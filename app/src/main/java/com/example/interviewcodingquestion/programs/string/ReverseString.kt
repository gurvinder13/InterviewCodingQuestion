package com.example.interviewcodingquestion.programs.string

/**
 * Reverse the String
 */

fun main() {
    val str = "I am good"
     val print  = reverseStr(str)
     val rs = reverseWords(print)
    println(print)
    println(rs)
   // val result = reverseUsingRecursive(str)
   // println(result)
}

private fun reverseWords(string: String):String{
    //var words = string.split(" ").toTypedArray()
    var words = string.split(" ").toMutableList()
    var left = 0
    var right = words.size - 1
    while (left < right){
        val temp = words[left]
        words[left] = words[right]
        words[right] = temp
        left++
        right--
    }
    return words.joinToString(" ")
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

