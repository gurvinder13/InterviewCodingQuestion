package com.example.interviewcodingquestion.programs.arrays

/**
 * Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
 */

import java.util.*

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = intArrayOf(2, 3, 4, 4, 5)
    //val arr1 = intArrayOf(6, 1, 3, 2, 5,7)
   // val arr2 = intArrayOf(2, 3, 4, 4, 5)

    // Method 1: Merge and Sort
    val method1Result = unionUsingMergeAndSort(arr1, arr2)
    println("Method 1 Output: ${method1Result.toList()}")

    // Method 2: Using HashSet
    val method2Result = unionUsingHashSet(arr1, arr2)
    println("Method 2 Output: ${method2Result.toList()}")

    val union = findUnionHashSet(arr1, arr2)
    println("Union of arr1 and arr2: $union")

    /**
     * Output:
     *  {1,2,3,4,5}
     */

}

// Method 1: Merge and Sort
/**
 * Time Complexity: O((n + m) log(n + m)) for sorting the merged array.
 * Space Complexity: O(n + m) for the merged array.
 */
fun unionUsingMergeAndSort(arr1: IntArray, arr2: IntArray): IntArray {
    val mergedArray = (arr1 + arr2).sorted().distinct().toIntArray()
    return mergedArray
}

// Method 2: Using HashSet
/**
 * Time Complexity: O(n + m) for traversing both arrays.
 * Space Complexity: O(n + m) for the HashSet.
 */
fun unionUsingHashSet(arr1: IntArray, arr2: IntArray): IntArray {
    val unionSet = HashSet<Int>()
    unionSet.addAll(arr1.toList())
    unionSet.addAll(arr2.toList())
    return unionSet.toIntArray()
}

/**
 * Unsorted array - find union
 *  Time Complexity: O(n + m) for traversing both arrays.
 *  * Space Complexity: O(n + m) for the HashSet.
 */
fun findUnionHashSet(arr1: IntArray, arr2: IntArray): Set<Int> {
    val set = HashSet<Int>()
    for (num in arr1) {
        set.add(num)
    }
    for (num in arr2) {
        set.add(num)
    }
    return set
}

/*fun main() {
    val arr1 = intArrayOf(6, 1, 3, 2, 5,7)
    val arr2 = intArrayOf(2, 3, 4, 4, 5)
    val union = findUnionHashSet(arr1, arr2)
    println("Union of arr1 and arr2: $union")
}*/
