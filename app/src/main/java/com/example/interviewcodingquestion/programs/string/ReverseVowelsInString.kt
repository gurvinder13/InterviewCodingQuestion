package com.example.interviewcodingquestion.programs.string

/**
 * Reverse the vowels in String
 */
fun main() {
    val input1 = "hello"
    val input2 = "leetcode"
    val input3 = "aA"

    println("Input: $input1")
    println("Output: ${reverseVowels(input1)}")

    println("Input: $input2")
    println("Output: ${reverseVowels(input2)}")

    println("Input: $input3")
    println("Output: ${reverseVowels(input3)}")
}

/**
 * Two Pointer approach
 * TC - O(n)
 * SC - O(n)
 */
fun reverseVowels(s: String): String {
    val vowels = "aeiouAEIOU"
    var left = 0
    var right = s.length - 1
    val charArray = s.toCharArray()

    while (left < right) {
        if (charArray[left] !in vowels) {
            left++
            //continue
        }
        if (charArray[right] !in vowels) {
            right--
           // continue
        }
        // Swap vowels
        val temp = charArray[left]
        charArray[left] = charArray[right]
        charArray[right] = temp
        left++
        right--
    }

    return String(charArray)
}

private fun revVowel(s: String): String {
    val vowels = "aeiouAEIOU"
    val arr = s.toCharArray()
    var left = 0
    var right = arr.size - 1
    while (left < right){
        if (arr[left] in vowels && arr[right] in vowels){
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            left++
            right--
        } else if (arr[left] in vowels){
            right --
        } else if (arr[right] in vowels){
            left ++
        }else{
            left++
            right--
        }
    }

    return arr.joinToString("")
}
