package com.example.interviewcodingquestion.programs.arrays

/**
 * Find the number that appears once, and the other numbers twice in array
 *
 */

fun main(){
 val array = intArrayOf(4,1,2,1,2)
 val array1 = intArrayOf(2,2,1)
    val result = findSingleNum(array)
    val result1 = findSingleNum(array1)
    val result2 = findSingleNumber(array1)
    println(result)
    println(result1)
    println(result2)
}

/**
 * Approach : Using HashMap
 * Time Complexity: O(n), where n is the number of elements in the array.
 * Space Complexity: O(n), where n is the number of elements in the array.
 */

fun findSingleNum(array: IntArray):Int{
    val map = mutableMapOf<Int,Int>()
    //val map = HashMap<Int, Int>()

    for (num in array){
        val count = map.getOrDefault(num, 0) + 1
        map[num] = count
    }
    for (key in map){
        if (key.value == 1){
            return key.key
        }
    }
    // Todo both are same
    /*for ((key, value) in map) {
        if (value == 1) {
            return key
        }
    }*/
    return -1
}
/**
 * Approach : Bitwise XOR
 *  Time Complexity: O(n), where n is the number of elements in the array.
 *   Space Complexity: O(1).
 */

fun findSingleNumber(nums: IntArray): Int {
    var result = 0
    for (num in nums) {
        result = result xor num
    }
    return result
}
