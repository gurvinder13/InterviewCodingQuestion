package com.example.interviewcodingquestion.programs.arrays

/**
 * Sort array
 */

fun main() {
    val arr = intArrayOf(2, 3, 1, 5, 4)
     sortUsingBubbleSort(arr)
     println("sort array using bubble sort ${arr.joinToString(" ,")}")
     val result = sorted(arr)
    println("sort array using single loop ${result.joinToString(" ,")}")

}

/**
 * Using Bubble Sort
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

fun sortUsingBubbleSort(array: IntArray) {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}

/**
 * Using single loop
 *  Time Complexity:
 * Best-case time complexity: O(n) when the array is already sorted.
 * Worst-case time complexity: O(n^2) when the array is sorted in reverse order.
 * Average-case time complexity: O(n^2).
 * Space Complexity:
 *  Space complexity: O(1) - It sorts the array in place without using any additional space.
 *
 */

fun sorted(a: IntArray): IntArray {
    var i = 0
    while (i < a.size - 1) {
        if (a[i] > a[i + 1]) {
            val temp = a[i]
            a[i] = a[i + 1]
            a[i + 1] = temp
            i = -1
        }
        i++
    }
    return a
}