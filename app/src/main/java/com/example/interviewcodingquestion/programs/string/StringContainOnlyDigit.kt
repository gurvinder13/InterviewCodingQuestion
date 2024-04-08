package com.example.interviewcodingquestion.programs.string

/**
 * How do you check if a string contains only digits?
 */

fun main(){
    println(isContainDigit("123"))
}

/**
 * Approach 1: Using a Loop
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 */
fun isContainDigit(string: String):Boolean{
    for (char in string){
        if (!char.isDigit()){
            return false
        }
    }
    return true
}

/**
 * Approach 2: Using Char Array
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

fun containsOnlyDigits(str: String): Boolean {
    val chars = str.toCharArray()
    for (char in chars) {
        if (char !in '0'..'9') {
            return false
        }
    }
    return true
}
