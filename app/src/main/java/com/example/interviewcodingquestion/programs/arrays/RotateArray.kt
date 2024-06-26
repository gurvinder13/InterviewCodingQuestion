package com.example.interviewcodingquestion.programs.arrays

import java.util.Arrays

/**
 * Rotate array k times
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * The time complexity of the rotate function is O(n), where n is the size of the array.
 * This is because the function iterates through the array three times, each time reversing a portion of the array.
 *
 * The space complexity of the rotate function is O(1), as it only uses a constant amount
 * of extra space regardless of the size of the input array. This is because the function
 * performs the rotation in place without using any additional data structures that grow with
 * the size of the input.
 *
 * Overall, the rotate function is efficient in terms of both time and space complexity,
 * as it rotates the array in place without requiring extra memory, and it performs the
 * rotation in linear time relative to the size of the array.
 */

fun main() {
    //val array = intArrayOf(1, 2, 3, 4, 5)
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Before rotate array is :- { ${array.joinToString()}}")
    rotate(array, k = 3)
    println("After rotate array is :- { ${array.joinToString()} }")
    /**
     *  Output
     * Before rotate array is :- { 1, 2, 3, 4, 5}
     * After rotate array is :- { 3, 4, 5, 1, 2 }
     */

}

/**
 *  Given an integer array nums, rotate the array to the left by k steps, where k is non-negative.
 */
fun rotate(arr: IntArray, k: Int) {
    val size = arr.size
    var rotations = k % size

    if (rotations <= 0) {
        rotations += size
    }
    reverse(arr, 0, rotations - 1)
    reverse(arr, start = rotations, end = size - 1)
    reverse(arr, 0, size - 1)
}

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */

fun rotate1(nums: IntArray, k: Int): Unit {
    var k1 = k % nums.size
    if (k1 <= 0) {
        k1 += nums.size
    }
    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, k1 - 1)
    reverse(nums, k1, nums.size - 1)

}

private fun reverse(arr: IntArray, start: Int, end: Int) {
    var left = start
    var right = end
    while (left < right) {
        val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp
        left++
        right--
    }
}



