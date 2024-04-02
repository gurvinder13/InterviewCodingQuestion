package com.example.interviewcodingquestion.programs.arrays

/**
 *  How To Move Zeroes To Start Of An Array - without extra space
 *  Time complexity -  O(n), where n is the size of the input array.
 *  Space complexity O(1), constant space.
 */

fun main() {
    val arr = intArrayOf(1, 0, 1, 0, 1, 1)
    moveZeroToStart(arr)
    println("Updated result is:- ${arr.joinToString()}")
}

fun moveZeroToStart(arr: IntArray) {
    // Base condition
    if (arr.size <= 1) {
        return
    }
    var nz = 0 // Non-zero pointer
    var z = 0 // Zero pointer

    while (nz < arr.size && z < arr.size) {   // Ensure both pointers are within array bounds
        if (arr[nz] == 0) {
             // Swap non-zero element with zero element
            val temp = arr[nz]
            arr[nz] = arr[z]
            arr[z] = temp
            nz++
            z++
        } else {
            // Increment non-zero pointer only
            nz++
        }
    }
}