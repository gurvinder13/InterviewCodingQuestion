package com.example.interviewcodingquestion.programs.string

/**
 *  Remove duplicate characters from String
 *
 */

fun main (){
    val str  = "abcab"
    val result = removeUsingSet(str)
    val result1 = removeUsingIterator(str)
    println(result)
    println(result1)
}

/**
 * Using Set
 *  time complexity of the removeUsingSet function is O(n),
 *   space complexity is also O(n), where n is the length of the input string s.
 *
 */

private fun removeUsingSet(s: String):String {
    val set = mutableSetOf<Char>()
    var  result = ""
    for (char in s){
        if (set.add(char)){
            result += char
        }
    }
    return result
}

/**
 *  Iterative Removal of Duplicate Characters
 *
 *  The time complexity of the removeUsingIterator function is O(n^2)
 *  the space complexity is O(n) because the result string stores the unique characters from the
 *     input string, potentially growing linearly with the input size.
 */

private fun removeUsingIterator(string: String):String{
    var  result = ""
    for (char in string){
        if (!result.contains(char)){
            result += char
        }
    }
    return result
}
