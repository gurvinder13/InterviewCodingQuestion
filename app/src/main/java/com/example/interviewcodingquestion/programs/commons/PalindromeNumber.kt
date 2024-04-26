package com.example.interviewcodingquestion.programs.commons

/**
 * Given an integer x, return true if x is a palindrome , and false otherwise.
 *
 * TC - O(log10(x)), and the space complexity is O(1).
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

fun main(){
   val rs = isPalindrome(-121)
    println(rs)
}

fun isPalindrome(x: Int): Boolean {
    if(x < 0) return false
    val rev = revers(x)
    return x == rev
}

private fun revers(x:Int):Int{
    var num = x
    var rev = 0
    while(num != 0){
        val rem = num % 10
        rev = rev * 10 + rem
        num /= 10
    }
    return rev
}