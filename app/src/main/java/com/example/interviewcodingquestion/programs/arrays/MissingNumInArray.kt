package com.example.interviewcodingquestion.programs.arrays

/**
 * Missing num in array
 *
 */

fun main() {
    val array = intArrayOf(1, 2, 4, 5, 6)
    val result = missingNum(array)
    println("Missing num in array is :- $result")
}

/**
 * Arithmetic Progression Sum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
fun missingNum(array: IntArray): Int {
    val n = array.size + 1
    val expectedSum = n * (n + 1) / 2
    var actualSum = 0
    for (num in array) {
        actualSum += num
    }
    return expectedSum - actualSum
}
