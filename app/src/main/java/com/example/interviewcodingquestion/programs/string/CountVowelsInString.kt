package com.example.interviewcodingquestion.programs.string

/**
 * How do you count the number of vowels and consonants in a given string?
 */

fun main(){
    val str = "Gurvinder Singh"
    findVowels(str)
}

/**
 *  Iterative Approach with Character Comparison:
 *
 *  Time Complexity: O(n), where n is the length of the string.
 *  Space Complexity: O(1).
 */
fun findVowels(string: String){
    val vowels = "aeiouAEIOU"
    var vowelCount = 0
    var consonantCount = 0
    for (char in string ){ // char in 'A'..'Z' || char in 'a'..'z'
        if (char in vowels){
            vowelCount++
        } else if (char.isLetter()){
            consonantCount++
        }
    }
    println("Number of vowels in given string is $vowelCount")
    println("Number of consonants in given string is $consonantCount")
}
