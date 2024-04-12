package com.example.interviewcodingquestion.programs.string

/**
 * Anagrams String
 */

fun main(){
    val str1 = "listen"
    val str2 = "silent"
    println("Are '$str1' and '$str2' anagrams? = ${areAnagrams(str1, str2)}")
    println("Are '$str1' and '$str2' anagrams? = ${areAnagramsUsingXOR(str1, str2)}")
}

/**
 * Approach Name: Sorting Approach
 * time complexity is O(n log n),
 *  space complexity is O(n).
 *
 */
fun areAnagrams(s1:String,s2:String):Boolean{
    if (s1.length!= s2.length) return false
    val arr1 = s1.toCharArray().sorted()
    val arr2 = s2.toCharArray().sorted()
    return arr1 == arr2
}

/**
 * time complexity is O(n),
 * space complexity is O(n).
 */
fun areAnagramsUsingXOR(str1:String,str2:String):Boolean {
    // Step 1: Check if lengths are equal
    if (str1.length != str2.length) return false

    // Step 2: Convert strings to character arrays
    val arr1 = str1.toCharArray()
    val arr2 = str2.toCharArray()

    // Step 3: XOR each character's ASCII value
    var xorResult = 0
    for (i in 0 until  arr1.size) {
        xorResult = xorResult xor arr1[i].code
        xorResult = xorResult xor arr2[i].code
        //xorResult = xorResult xor arr2[i].toInt()

    }
    // Step 4: Check if XOR result is 0
    return xorResult == 0

}

/**
 *  time complexity is O(n),
 *  * space complexity is O(1).
 */
fun areAnagramsUsingXOR2(str1:String,str2:String):Boolean {
    // Step 1: Check if lengths are equal
    if (str1.length != str2.length) return false

    // Step 2: Convert strings to character arrays
    val arr1 = str1.toCharArray()
    val arr2 = str2.toCharArray()

    // Step 3: XOR each character's ASCII value
    var xorResult = 0
    str1.forEach { xorResult = xorResult xor it.toInt() }
    str2.forEach { xorResult = xorResult xor it.toInt() }
    // Step 4: Check if XOR result is 0
    return xorResult == 0

}
