package com.example.interviewcodingquestion.programs.string

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 *   or -1 if needle is not part of haystack.
 */

fun main() {
    val str1 = "hello world"
    val str2 = "world"
   val result =  strStr(str1,str2)
    println(result)

}

fun strStr(haystack: String, needle: String): Int {
    return if (needle.isEmpty()) 0 else if (haystack.contains(needle)) haystack.indexOf(needle) else -1

}