package com.example.interviewcodingquestion.programs.arrays

/**
 *  Generate all subarrays" approach'
 *  Time Complexity: O(n^3)
 *  Space Complexity: O(1)
 */

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    findAllSubArray(array)
}

fun findAllSubArray(array: IntArray) {
    for (i in 0 until array.size) {
        for (j in i until array.size) {
            for (k in i..j) {
                print(array[k])
            }
            println()
        }
    }
}
