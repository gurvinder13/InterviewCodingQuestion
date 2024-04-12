package com.example.interviewcodingquestion.programs.arrays

/**
 *  Given an array, and an element num the task is to find if num is present in the given array or not.
 *   If present print the index of the element or print -1.
 */

fun main (){
  val array = intArrayOf(1,2,3,4,5)
    val num = 3;
    println(searchNum(array,num))
}

/**
 * Linear Search
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
private fun searchNum(array: IntArray, num:Int):Int{
    for (i in array.indices){
        if (array[i] == num) {
            return i;
        }
    }
    return -1
}
