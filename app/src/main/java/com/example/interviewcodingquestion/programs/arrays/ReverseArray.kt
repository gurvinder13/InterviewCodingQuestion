package com.example.interviewcodingquestion.programs.arrays

/**
 * How do you reverse an array in place in Kotlin?
 *
 */

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    println("Original Array: ${arr.joinToString(", ")}")
   // reverseArray(arr)
   // println("Reversed Array: ${arr.joinToString(", ")}")
    //reverseUsingRecursion(arr, 0, arr.size - 1)
   // println("Reversed Array Using Recursion: ${arr.joinToString(", ")}")
    val result = reverseArrayUsingFunction(arr)
    println("Reversed Array Using library function: ${result.joinToString(", ")}")

}

/**
 * Two-pointer" or "in-place reversal approach
 * Output
 * Time Complexity: O(n/2)
 * Space Complexity: O(1)
 * The function efficiently reverses the elements of the input array in place
 * Original Array: 1, 2, 3, 4, 5
 * Reversed Array: 5, 4, 3, 2, 1
 */

fun reverseArray(arr: IntArray) {
    val size = arr.size
    var left = 0
    var right = size - 1
    while (left < right) {
        val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp
        left++
        right--
    }
}

/**
 * reverse array using recursion
 * Recursive approach
 * Time Complexity: O(n/2) or simply O(n)
 * Space Complexity: O(n) :-
 *  The space complexity of the reverseUsingRecursion function is O(n),
 *  where n is the size of the input array. This is because the function makes recursive calls,
 *  potentially creating a new stack frame for each call. The maximum depth of the recursion depends
 *  on the size of the input array (specifically, the number of elements that need to be swapped).
 *  Therefore, the space required grows linearly with the size of the array.
 */

fun reverseUsingRecursion(arr: IntArray, start: Int, end: Int): IntArray {
    if (start >= end) {
        return arr
    }
    val temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
    return reverseUsingRecursion(arr, start + 1, end - 1)
}

/**
 * reversedArray() function provided by Kotlin's standard library
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

fun reverseArrayUsingFunction(arr:IntArray):IntArray{
    return arr.reversedArray()
}
