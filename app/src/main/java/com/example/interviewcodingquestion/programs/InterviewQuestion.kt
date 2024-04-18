package com.example.interviewcodingquestion.programs

/**
 *  Find 2nd largest num in array with 3 case
 */

fun main() {
    val arr = intArrayOf(10,10,5)  // output - 5
    val arr1 = intArrayOf(10,10,10) // -1 means dont exit
    val arr2 = intArrayOf(2, 10, 12, 25) // 12


    val d= getData(arr2)
    println(d)
}

/**
 *  O(n^2) to the time complexity and
 *  O(1) to the space complexity.
 */
fun getData(arr:IntArray):Int{
    var result = sortUsingBubbleSort(arr)
    println("sort array using single loop ${arr.joinToString(" ,")}")
    val max = arr[0]
    for(num in arr){
        if(num < max){
            return num
        }
    }
    return -1
}

fun sortUsingBubbleSort(array: IntArray) {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] < array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
/**
 *  Using sort
 *  TC - O(n log n)
 *  SC - O(n) // since a new array (sortedArr) is created to store the sorted elements.
 */

fun findSecondLargest(arr: IntArray): Int {
    val sortedArr = arr.sortedDescending()
    val max = sortedArr[0]
    for (num in sortedArr) {
        if (num < max) {
            return num
        }
    }
    return -1
}
