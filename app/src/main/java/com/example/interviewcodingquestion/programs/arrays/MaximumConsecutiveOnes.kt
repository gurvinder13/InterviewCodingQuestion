package com.example.interviewcodingquestion.programs.arrays

/**
 *
 */

fun main() {
    val prices1 = intArrayOf(1, 1, 0, 1, 1, 1)
    println("Output for prices1: ${maxConsecutiveOnes(prices1)}")

    val prices2 = intArrayOf(1, 0, 1, 1, 0, 1)
    println("Output for prices2: ${maxConsecutiveOnes(prices2)}")
}

/**
 * Iterative Approach
 *  Time Complexity: O(n)
 * Space Complexity: O(1)
 */
fun maxConsecutiveOnes1(arr: IntArray): Int {
    var maxCount = 0
    var currentCount = 0
    for (num in arr) {
        if (num == 1) {
            currentCount++
        } else {
            maxCount = maxOf(maxCount, currentCount)
            currentCount = 0
        }
    }
    return maxOf(maxCount, currentCount)
}

fun maxConsecutiveOnes(arr: IntArray): Int {
    var maxCount = 0
    var currentCount = 0
    for (num in arr) {
        if (num == 1) {
            currentCount++
        } else {
            if (currentCount > maxCount) {
                maxCount = currentCount
            }
            currentCount = 0
        }
    }
    if (currentCount > maxCount) {
        maxCount = currentCount
    }
    return maxCount
}
