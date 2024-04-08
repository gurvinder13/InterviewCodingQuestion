package com.example.interviewcodingquestion.programs.string

/**
 *  How do you count the occurrence of a given character in a string?
 *
 */

fun main (){
    val str = "ABCAAAB"
    var target = 'C'
    val result = getCount(str,target)
    val result1 = countOccurrence1(str,target)
    println("count of $target is $result")
    println("count of $target is $result1")

}

/**
 * Iterative Character Count
 * Time Complexity: O(n)
 *  Space Complexity: O(1)
 */
private fun getCount(string: String , target: Char):Int{
    var count = 0
    for (char in string){
        if (char == target){
            count++
        }
    }
    return count
}

/**
 *  Approach 2: Using Kotlin's Extension Function with filter() and count()
 *
 *
 * time complexity is O(n) and
 * the space complexity is O(1)
 */
fun countOccurrence1(input: String, target: Char): Int {
    return input.filter { it == target }.count()
}
