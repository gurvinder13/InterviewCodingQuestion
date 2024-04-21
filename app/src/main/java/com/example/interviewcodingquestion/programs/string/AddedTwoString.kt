package com.example.interviewcodingquestion.programs.string

/**
 * Merge String
 *
 *  The time complexity of the mergeString function is O(n)
 *  The space complexity of the function is also O(n)
 *
 */

fun main() {
    val st1 = "abcd"
    val st2 = "1234"

    val result = mergeString(st1, st2)
    println(result)
}

fun mergeString(st1: String, st2: String): String {
    val result = CharArray(st1.length + st2.length)
    var index1 = 0
    var index2 = 0
    var index = 0
    while (index1 < st1.length || index2 < st2.length){
        if (index1 < st1.length){
            result[index] = st1[index1]
            index1++
            index++
        }
        if (index2 < st2.length){
            result[index] = st2[index2]
            index2++
            index++
        }
    }
     return result.joinToString("")

}
