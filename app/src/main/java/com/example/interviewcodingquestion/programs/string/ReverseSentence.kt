package com.example.interviewcodingquestion.programs.string

/**
 *
 *
 */

fun main (){
    val str  = "Gurvinder Singh"
    val result = reverseWords(str)
    val result1 = reverseWordsUsingRecursion(str)
    println(result)
    println(result1)
}

/**
 * Approach Name: Word Reversal -  Using Two-Pointers Approach:
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *  Space Complexity: The space complexity is O(n) because the function splits the input string
 *  into an array of words, which requires additional space proportional to the length of the string
 */
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
 * Using Recursion:
 *
 *  Time Complexity: O(n)
 * Space Complexity: O(n) (considering recursion stack space)
 */

private fun reverseWordsUsingRecursion(str :String) :String{
    if(str.isEmpty()){
        return str
    }
    val index = str.indexOf(' ')
    if(index < 0){
        return str
    } else {
        return reverseWordsUsingRecursion(str.substring(index + 1)) + " " + str.substring(0,index)
    }
}
