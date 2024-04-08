package com.example.interviewcodingquestion.programs.string

/**
 *
 * Subsequence Of A Given String  Using Recursion
 */

fun main() {
    val str = "abc"
    val result = mutableListOf<String>()
    subSequenceString(str, "", result)
    println(result)
    // output - [abc, ab, ac, a, bc, b, c, ]
}

/**
 *  Time complexity is O(2^N), where N is the length of the input string str\
 *  Space complexity is also exponential O(2^N * N) due to the recursive nature of the solution
 */
fun subSequenceString(str: String, ans: String, list: MutableList<String>) {
    if (str.isEmpty()) {
        list.add(ans)
        return
    }
      // pick
    subSequenceString(str.substring(1), ans + str[0], list)
    // not pick

    subSequenceString(str.substring(1), ans, list)
}

fun subSequenceString1(str: String, ans: String) {
    if (str.isEmpty()) {
       println(ans)
        return
    }
    // pick
    subSequenceString1(str.substring(1), ans + str[0])
    // not pick

    subSequenceString1(str.substring(1), ans)
}
