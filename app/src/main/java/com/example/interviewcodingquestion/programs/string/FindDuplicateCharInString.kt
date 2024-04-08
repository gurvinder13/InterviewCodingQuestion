package com.example.interviewcodingquestion.programs.string

/**
 *  find duplicate characters in string
 *
 */

fun main (){
   val str  = "abcab"
    val result = findDuplicate(str)
    val result1 = findDuplicatesUsingHashSet(str)
    println(result)
    println(result1)
}

/**
 * Using HashMap
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */
private fun findDuplicate(string: String):Map<Char, Int>{
    val map = mutableMapOf<Char, Int>()
    for (char in string){
        val count = map.getOrDefault(char,0) + 1
         map[char] = count
    }
    return map.filter { it.value > 1 }
}

/**
 *  HashSet with HashMap
 *  Time Complexity: O(n)
 *  Space Complexity: O(n)
 */

fun findDuplicatesUsingHashSet(string: String):Map<Char,Int>{
    val set = mutableSetOf<Char>()
    val map = mutableMapOf<Char, Int>()
    for (char in string){
        if (!set.contains(char)){
            val count = map.getOrDefault(char,0) + 1
            map[char] = count
        }
    }
    return map
}
