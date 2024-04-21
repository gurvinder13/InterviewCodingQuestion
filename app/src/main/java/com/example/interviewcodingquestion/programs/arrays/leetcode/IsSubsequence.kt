package com.example.interviewcodingquestion.programs.arrays.leetcode

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 *
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 *
 */

fun main() {
    val s = "abc"
    val t = "ahbgdc"
    val rs = isSubsequence(s,t)
    println(rs)
}

fun isSubsequence(s: String, t: String): Boolean {
    var left = 0
    var right = 0
    while (left < s.length && right < t.length) {
        if (s[left] == t[right]) {
            left++
        }
        right++
    }
    return left == s.length
}