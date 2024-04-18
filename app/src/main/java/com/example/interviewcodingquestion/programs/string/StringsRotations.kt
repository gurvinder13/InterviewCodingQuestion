package com.example.interviewcodingquestion.programs.string

/**
 * How do you check if two strings are a rotation of each other?
 */

fun main(){
    val str1 = "abcd"
    val str2 = "cdab"
    println(rotation(str1,str2))
    println(rotationUsingSort(str1,str2))
}

/**
 * The approach used in the rotation function is based on Concatenation
 * TC - O(n^2)
 * SC - O(n)
 */
fun rotation(str1:String, str2:String):Boolean {
    if (str1.length!= str2.length) return false
    val temp = str1 + str2
    return temp.contains(str2)
}

/**
 * Using sorting
 *   TC - O(n log n)
 *   SC - O(n)
 */

fun rotationUsingSort(str1: String,str2: String):Boolean{
    if (str1.length!= str2.length) return false
    val sortStr1 = str1.toCharArray().sorted().joinToString("")
    val sortStr2 = str2.toCharArray().sorted().joinToString("")
    return sortStr1 == sortStr2
}
