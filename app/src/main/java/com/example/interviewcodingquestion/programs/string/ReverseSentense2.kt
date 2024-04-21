package com.example.interviewcodingquestion.programs.string



fun main() {
    val input1 = "the sky is blue"
    val input2 = "  hello world  "
    val input3 = "a good   example"

    println("Input: $input1")
    println("Output: ${reverseWords(input1)}\n")

    println("Input: $input2")
    println("Output: ${reverseWords(input2)}\n")

    println("Input: $input3")
    println("Output: ${reverseWords(input3)}")
}
private fun reverseWords(s: String): String {
    //val words = s.trim().split(" ").filter { it.isNotBlank() }.toTypedArray() // Split by any whitespace
    val words = s.trim().split("\\s+".toRegex()).toTypedArray()
    var left = 0
    var right = words.size - 1
    while (left < right) {
        val temp = words[left]
        words[left] = words[right]
        words[right] = temp
        left++
        right--
    }
    return words.joinToString(" ")
}


