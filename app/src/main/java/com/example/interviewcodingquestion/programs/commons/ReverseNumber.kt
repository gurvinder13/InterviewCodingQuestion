package com.example.interviewcodingquestion.programs.commons

/**
 * Reverse number
 */

fun main(){
    val num = 1234
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
