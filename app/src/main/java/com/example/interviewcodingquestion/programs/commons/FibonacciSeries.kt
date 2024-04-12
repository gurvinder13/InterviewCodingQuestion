package com.example.interviewcodingquestion.programs.commons

/**
 * Fibonacci Series
 */

fun main() {
    for (i in 0 until 10) {
       // println(fibonacciRecursive(i))
        println(fibonacciIterative(i))
    }
    //println("value of " + fibonacciRecursive(5))
    println("value of " + fibonacciIterative(5))

}

/**
 * Recursive Approach:
 *
 * Time complexity: O(2^N)
 * Space complexity: O(N)
 */
private fun fibonacciRecursive(num: Int): Int {
    if (num <= 1) {
        return num;
    }
    return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2)
}

/**
 * 2. Iterative Approach:
 *
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

private fun fibonacciIterative(n: Int): Int {
    var a = 0
    var b = 1
    var sum: Int
    // special case
    if (n == 0) {
        return  a
    }
    if (n == 1) {
        return  b
    }
        for (i in 1 until n) {
            sum = a + b
            a = b
            b = sum
        }
    return b

}
