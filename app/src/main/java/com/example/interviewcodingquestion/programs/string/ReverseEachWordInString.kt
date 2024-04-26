package com.example.interviewcodingquestion.programs.string

/**
 * Given a string s, reverse the order of characters in each word within a
 *   sentence while still preserving whitespace and initial word order.
 */

fun main(){
    val r = "I am good"
    val rs = revEachWords("I am good")
    println(rs) // I ma doog
}

fun reverseWord(s: String) =
    s.reversed().split(" ").reversed().joinToString(" ")

/**
 *  time complexity is O(n * m),
 *  the space complexity is O(n)
 */
private fun revEachWords(str:String):String{
    val words = str.split(" ")
    val result = words.joinToString(" "){ reversedStr(it) }
    return result.trim()
}

fun reversedStr(str: String):String {
    var left = 0
    var right = str.length - 1
    val arr = str.toCharArray()
    while (left < right){
       val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp
        left++
        right--
    }
    return arr.joinToString("")
}
