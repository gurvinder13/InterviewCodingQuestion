package com.example.interviewcodingquestion.programs.arrays.leetcode

import com.example.interviewcodingquestion.programs.getData

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */

fun main (){
    var arr1 = intArrayOf(1,3,5,6)
    val target = 7
    val rs = searchInsertPosition(arr1, target)
     println(rs)
}

fun searchInsertPosition(array: IntArray, target: Int):Int{
    var left = 0
    var right = array.size - 1
    while (left <= right){
        val mid = (left+ right) / 2
        when {
            array[mid] < target -> left = mid + 1
            array[mid] > target -> right = mid - 1
            array[mid] == target -> return  mid
        }
    }
    return  left
}

