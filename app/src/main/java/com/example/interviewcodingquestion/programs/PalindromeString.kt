package com.example.interviewcodingquestion.programs

/**
 * A palindrome string is a sequence of characters that reads the same forwards and backwards.
 * In other words, if you reverse the characters of a palindrome string, you will get the same string.
 * For example, "radar", "level", and "racecar" are all examples of palindrome strings because
 * they read the same forwards and backwards.
 */

fun main() {
    val str = "abba"
    val result = isPalindromeUsingRecursive(str, 0, str.length - 1)
    println("$str is palindrome $result")
    val result1 = isPalindrome(str)
    println(result1)

}

/**
 * Using Recursion
 * TC- O(n)
 * SC - O(n)
 * where n is the length of the input string.
 */

fun isPalindromeUsingRecursive(str: String, i: Int, j: Int): Boolean {
    if (str[i] != str[j]) {
        return false
    }
    if (j <= i) {
        return true
    }
        return isPalindromeUsingRecursive(str, i + 1, j - 1)

}

/**
 * iterative approach with two pointers
 * Using Two pointer
 * time complexity of O(n) and a  space complexity of O(1), where n is the length of the input string.
 */

fun isPalindrome(str: String):Boolean{
    var left = 0
    var right = str.length-1
    while (left < right){
        if (str[left]!= str[right]){
            return false
        }
        left ++
        right--
    }
    return true
}
