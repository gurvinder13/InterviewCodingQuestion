package com.example.interviewcodingquestion.programs.arrays

/**
 * Print Duplicate items in array
 */

fun main() {
    val arr1 = intArrayOf(1, 2, 4, 2, 5, 3)
    //findDuplicateArray(arr)
    findDuplicatesHashSet(arr1)
}

/**
 *  Brute-force approach
 *  Time complexity: O(n^2)
 *  Space complexity: O(1)
 */
private fun findDuplicateArray(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (arr[i] == arr[j]) {
                val duplicate = arr[i]
                println("duplicate element is $duplicate")
            }
        }
    }
}

/**
 * HashSet
 *  time complexity of O(n) and a space complexity of O(n)
 */
private fun findDuplicatesHashSet(arr: IntArray) {
    val set = HashSet<Int>()
    println("Duplicate elements:")
    for (i in 0 until arr.size) {
        val num = arr[i]
        if (!set.add(num)) {
            println(num)
        }
    }
}
// Both are same
/*fun findDuplicatesHashSet(arr: IntArray) {
    val set = HashSet<Int>()
    println("Duplicate elements:")
    for (num in arr) {
        if (!set.add(num)) {
            println(num)
        }
    }
}*/
