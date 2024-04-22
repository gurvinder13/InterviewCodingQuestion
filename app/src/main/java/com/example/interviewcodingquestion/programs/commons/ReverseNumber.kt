package com.example.interviewcodingquestion.programs.commons

/**
 * Reverse number
 */

fun main(){
    val num = 1534236469
    println(reverseNum(num))
}

/**
 *   Time Complexity:  O(log10(num) - where num is the input integer.
 *   This is because the number of iterations in the while loop is proportional to the
 *   number of digits in the input number, which is log10(num).
 *
 *  * Space Complexity: O(1) - because the space used by the variables originalNum,
 *  reversedNum, and rem remains constant regardless of the input size.
 */

private fun reverseNum(num: Int):Int{
    var originalNum = num
    var reversedNum = 0
    while(originalNum != 0){
        val rem = originalNum % 10
        reversedNum = reversedNum * 10 + rem
        originalNum /= 10

    }
    return reversedNum
}

/**
 *  Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

fun reverse(x: Int): Int {
    var num = x.toLong()
    var revNum:Long = 0

    while(num != 0L){
        val rem = num % 10
        revNum = revNum * 10 + rem
        num = num / 10
    }

    if(revNum > Int.MAX_VALUE || revNum < Int.MIN_VALUE) return 0
    return revNum.toInt()
}
