package com.example.interviewcodingquestion.programs.arrays

/**
 * To Check If A Given Array Is Sorted Or Not
 *  Time Complexity: O(n)
 *   Space Complexity: O(1)
 */

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 6, 5)
    val result = isSorted(arr)
    println("Given array is sorted :- $result")
}

fun isSorted(array: IntArray): Boolean {
    for (i in 1 until array.size) {
        if (array[i] < array[i - 1]) {
            return false
        }
    }
    return true
}
