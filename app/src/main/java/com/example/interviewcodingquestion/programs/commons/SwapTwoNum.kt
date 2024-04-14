package com.example.interviewcodingquestion.programs.commons

/**
 * Swap two number without using of third variable
 */

fun main(){
    swapNum()
}

/**
 *  Using Arithmetic Operators:
 *  Time Complexity: O(1)
 *  Space Complexity: O(1)
 */
fun swapNum(){
   var a = 10
    var b = 20;
    a += b // a + b
    b = a - b
    a -= b // a - b
    println("swap number - updated a value is:-  $a and updated b value is :- $b")
}

fun swapNumbers(a: Int, b: Int): Pair<Int, Int> {
    var x = a
    var y = b
    x = x + y
    y = x - y
    x = x - y
    return Pair(x, y)
}
// Time Complexity: O(1)
// Space Complexity: O(1)
