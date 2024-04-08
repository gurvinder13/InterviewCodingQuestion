package com.example.interviewcodingquestion.programs.commons

/**
 * Factorial program
 */

fun main() {
    val n = 0
    val factorial = factorialIterative(n)
    println("Factorial of $n is: $factorial")
    println(factorialRecursive(n))
}

/**
 *  Iterative Approach
 *  Time Complexity: O(n)
 * Space Complexity: O(1)
 */

private fun factorialIterative(num: Int): Long {
    var result = 1L
    for (i in 2 until num + 1) {
        result *= i
    }
    return result
}

fun factorialIterative1(n: Int): Long {
    var result = 1L
    for (i in 2..n) {
        result *= i
    }
    return result
}

/**
 *  Recursive Approach
 *
 *   Time Complexity: O(n)
 * Space Complexity: O(n) due to recursive stack space
 */

fun factorialRecursive(num: Int): Long {
    if (num == 0) {
        return 1
    } else {
        return num * factorialRecursive(num - 1)
    }
}