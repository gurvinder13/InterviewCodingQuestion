package com.example.interviewcodingquestion.programs.arrays

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
fun main() {
    //val arr = arrayOf("flower", "flow", "flight")
    val arr = arrayOf("aaa", "aa","aaa")
    val result = longestCommonPrefix(arr)
    println(result) // "aa"
}
/**
 * The time complexity of the provided solution is O(n * m * log(n)),
 * and the space complexity is O(1),
 */
private fun longestCommonPrefix(arr: Array<String>): String {
    arr.sort()
    if (arr.isEmpty()) return ""
    var index = 0
    val first = arr[0]
    val last = arr[arr.size - 1]
    while (index < first.length && index < last.length) {
        if (first[index] == last[index]) {
            index++
        } else {
            break
        }
    }
    return first.substring(0, index)
}