package com.example.interviewcodingquestion.programs.arrays

/**
 * Move even in left side & odd in right side in array
 *   Input :-  10,30,45,7,2,20,8,3
 * Output :- 10,30,2,20,8,45,7,3
 */


fun main() {
    val arr = intArrayOf(10, 30, 45, 7, 2, 20, 8, 3)
    moveEvenToStart(arr)
    println("${arr.joinToString(",")}")
}

fun moveEvenToStart(arr: IntArray) {
    // Base condition
    if (arr.size <= 1) {
        return
    }
    var left = 0
    var right = 0

    while (left < arr.size && right < arr.size) {

        if(arr[right] % 2 == 0){
            val temp = arr[right]
            arr[right] = arr[left]
            arr[left] = temp

            left++
            right++
        } else{
            right++
        }
    }
}
