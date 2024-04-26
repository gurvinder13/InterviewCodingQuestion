package com.example.interviewcodingquestion.programs.arrays

/**
 *  Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 */

fun main(){
 val  arr1 = arrayOf("ab", "c")
 val  arr2 = arrayOf("a","bc")
    println(arrayStringsAreEqual(arr1,arr2))
}

/**
 *  Concatenate and Compare
 *  Time complexity: O(n), where n is the total number of characters in both arrays
 *  Space complexity: O(n), for storing concatenated strings
 *
 */
fun arrayStringsAreEqual(arr1:Array<String>, arr2: Array<String>):Boolean {
    var str1 = ""
    var str2 = ""
    for (char in arr1){
        str1 += char
    }
    for (char in arr2){
        str2 += char
    }
    return str1 == str2
}
/**
 * String Comparison
 */

fun arrayStringsAreEqual2(word1: Array<String>, word2: Array<String>): Boolean {
    val str1 = word1.joinToString("")
    val str2 = word2.joinToString("")
    return str1 == str2
}
