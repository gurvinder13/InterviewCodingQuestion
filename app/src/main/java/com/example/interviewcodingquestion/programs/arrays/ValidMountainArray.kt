package com.example.interviewcodingquestion.programs.arrays

/**
 *  Given an array of integers arr, return true if and only if it is a valid mountain array.
 *   TC - O(n)
 *   SC - O(1)
 */

fun main() {
   val  arr = intArrayOf(0,2,3,4,5,2,1,0)
    val rs = validMountainArray(arr)
    println(rs)
}

fun validMountainArray(arr: IntArray): Boolean {
    if (arr.size < 3) return false
    var left = 0
    var right = arr.size - 1
    while (left < right) {
        if (arr[left] < arr[left + 1]) {
            left++
        } else if (arr[right] < arr[right - 1]){
            right--
        }else{
            break
        }
    }
    return left != 0 && right != arr.size - 1 && left == right
}

fun isValid(arr: IntArray):Boolean{
    if (arr.size < 3) return false
    var left = 0
    var right = arr.size - 1

    // Move left pointer until the array is strictly increasing
    while (left < right && arr[left + 1] > arr[left]) {
        left++
    }

    // Move right pointer until the array is strictly decreasing
    while (right > 0 && arr[right - 1] > arr[right]) {
        right--
    }

    // Check if left and right pointers reached their correct positions
    return left != 0 && right != arr.size - 1 && left == right
}

