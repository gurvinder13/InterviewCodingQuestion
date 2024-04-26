package com.example.interviewcodingquestion.programs.arrays

/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 *
 *  time complexity is O(n^2)
 *   the space complexity is O(1)
 */

fun main(){
   val array = intArrayOf(1,2,3)
    val result = subArraySum(array, 3)
    println(result)
}

fun subArraySum(array: IntArray , k:Int):Int{
    var count = 0
    for (i in array.indices){
        var sum = 0
        for (j in i until array.size){
            sum += array[j]
            if (sum == k){
                count++
            }

        }

    }
    return count
}

fun countSubarraysBruteForce(nums: IntArray, k: Int): Int {
    var count = 0
    for (i in nums.indices) {
        var sum = 0
        for (j in i until nums.size) {
            sum += nums[j]
            if (sum == k) {
                count++
            }
        }
    }
    return count
}