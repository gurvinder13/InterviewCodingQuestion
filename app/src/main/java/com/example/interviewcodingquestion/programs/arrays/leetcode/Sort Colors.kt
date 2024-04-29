package com.example.interviewcodingquestion.programs.arrays.leetcode

/**
 *  Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 */

fun main (){
    val arr = intArrayOf(2,0,2,1,1,0)
    sortColors(arr)
    println(arr.joinToString(","))

}

/**
 * TC - O(n)
 * SC - O(1)
 */
fun sortColors(nums: IntArray): Unit {
    var left = 0
    var right = nums.size - 1
    var mid = 0

    while(mid <= right) {
        if(nums[mid] == 0){
            swap(nums,left, mid)
            left++
            mid++
        } else if(nums[mid] == 1){
            mid++
        } else if (nums[mid] == 2){
            swap(nums,mid,right)
            right--
        }
    }
}

private fun swap(nums: IntArray, i: Int, j: Int) {
    val temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
}