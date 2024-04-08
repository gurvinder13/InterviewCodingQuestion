package com.example.interviewcodingquestion.programs.arrays

/**
 * Remove duplicate from array
 *
 */

fun main() {

    val arr = intArrayOf(1, 2, 3, 4, 2, 1, 5, 4)
    val result = removeDuplicateUsingSet(arr)
    val result1 = removeUsingNestedLoop(arr)
    println(result.joinToString(","))
    println(result1.joinToString(","))
}

/**
 * Using Set
 * time complexity -  O(n), where n is the number of elements in the input array.
 * The space complexity of the function is also O(n) in the worst case
 *
 */
private fun removeDuplicateUsingSet(array: IntArray): IntArray {
    val set = HashSet<Int>()
    val list = mutableListOf<Int>()
    for (num in array) {
        if (set.add(num)) {
            list.add(num)
        }
    }
    return list.toIntArray()
}
/**
 *
 * Sure! Let's break down the removeDuplicateUsingSet function step by step:
 *
 * Input:
 *
 * array: An input array containing integers with potential duplicates.
 * Initialization:
 *
 * We initialize an empty hash set called set to store unique elements.
 * We also initialize an empty mutable list called list to store the unique elements in the order they appear.
 * Iteration:
 *
 * We iterate over each element num in the array.
 * For each num:
 * If num is successfully added to the set (meaning it's not a duplicate), we add it to the list.
 * This step ensures that only unique elements are added to list.
 * Output:
 *
 * We convert the list to an integer array using toIntArray() and return it.
 * Here's a breakdown of the process with an example:
 *
 * Consider the input array: array = [1, 2, 2, 3, 3, 4, 5, 5].
 *
 * Iteration 1: num = 1
 *
 * 1 is added to the set.
 * 1 is added to the list.
 * Iteration 2: num = 2
 *
 * 2 is added to the set.
 * 2 is added to the list.
 * Iteration 3: num = 2
 *
 * 2 is already present in the set, so it's not added to list.
 * Iteration 4: num = 3
 *
 * 3 is added to the set.
 * 3 is added to the list.
 * Iteration 5: num = 3
 *
 * 3 is already present in the set, so it's not added to list.
 * Iteration 6: num = 4
 *
 * 4 is added to the set.
 * 4 is added to the list.
 * Iteration 7: num = 5
 *
 * 5 is added to the set.
 * 5 is added to the list.
 * Iteration 8: num = 5
 *
 * 5 is already present in the set, so it's not added to list.
 * Output: list = [1, 2, 3, 4, 5]
 *
 * This demonstrates how the function removes duplicates and retains only unique elements while
 * preserving the original order of elements in the list.
 *
 */
//.......................................................................................................
/**
 * Nested Loop Approach
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
private fun removeUsingNestedLoop(array: IntArray): IntArray {
    val result = mutableListOf<Int>()
    for (num in array) {
        if (!result.contains(num)) {
            result.add(num)
        }
    }
    return result.toIntArray()
}
/**
 * Certainly! Let's break down the removeUsingNestedLoop function step by step:
 *
 * Input:
 *
 * array: An input array containing integers with potential duplicates.
 * Initialization:
 *
 * We initialize an empty mutable list called result to store the unique elements.
 * This list will eventually contain the elements from the input array, with duplicates removed.
 * Iteration:
 *
 * We iterate over each element num in the array.
 * For each num:
 * If result does not already contain num, we add it to the result list.
 * This step ensures that only unique elements are added to the result.
 * Output:
 *
 * We convert the result list to an integer array using toIntArray() and return it.
 * Here's a breakdown of the process with an example:
 *
 * Consider the input array: array = [1, 2, 2, 3, 3, 4, 5, 5].
 *
 * Iteration 1: num = 1
 *
 * Since result is empty, 1 is added to result.
 * Iteration 2: num = 2
 *
 * 2 is not present in result, so it is added.
 * Iteration 3: num = 2
 *
 * 2 is already present in result, so it is skipped.
 * Iteration 4: num = 3
 *
 * 3 is not present in result, so it is added.
 * Iteration 5: num = 3
 *
 * 3 is already present in result, so it is skipped.
 * Iteration 6: num = 4
 *
 * 4 is not present in result, so it is added.
 * Iteration 7: num = 5
 *
 * 5 is not present in result, so it is added.
 * Iteration 8: num = 5
 *
 * 5 is already present in result, so it is skipped.
 * Output: result = [1, 2, 3, 4, 5]
 *
 * This demonstrates how the function removes duplicates and retains only unique elements in the result list.
 */
