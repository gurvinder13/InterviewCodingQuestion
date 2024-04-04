package com.example.interviewcodingquestion.programs.arrays

/**
 *
 */

fun main() {
    val array = intArrayOf(4, 2, 55, 20, 12)
    thirdLargestNum(array)
}

/**
 *  Bubble Sort approach
 *  Time complexity - O(n^2)
 *  Space complexity - O(1)
 */
fun thirdLargestNum(array: IntArray) {
    val l = array.size
    for (i in 0 until l) {
        for (j in i + 1 until l) {
            if (array[i] < array[j]) {
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }
    println("third largest num is ${array[2]}")
}
