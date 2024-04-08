package com.example.interviewcodingquestion.programs.arrays

/**
 * How to Find all Pairs in Array of Integers Whose sum is Equal to a Given Number
 *
 */

fun main(){
    val arr = intArrayOf(1, 2, 3, 4, 5,7)
    val targetSum = 7
    //findPairs(arr, targetSum)
    //findCombinations(arr, targetSum)
    findPairsUsingSet(arr,targetSum)

}

/**
 * Using Two Nested Loops:
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

fun findPairs(arr:IntArray, target:Int){
    for(i in 0 until arr.size){
        for(j in i+1 until arr.size){
            if(arr[i] + arr[j] == target){
                println("(${arr[i]}, ${arr[j]})")
            }
        }
    }
}

/**
 * Using HashSet:
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

fun findPairsUsingSet(array :IntArray , target:Int){
    val set = HashSet<Int>()
    for(num in array){
        var complement = target - num
        if(set.contains(complement)){
            println("($num, $complement)")
        }
        set.add(num)
    }
}

/**
 * Using Brute Force with Nested Loops:
 * Time Complexity: O(n^4)
 * Space Complexity: O(1)
 */
fun findCombinations(arr: IntArray, targetSum: Int) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            for (k in j + 1 until arr.size) {
                for (l in k + 1 until arr.size) {
                    if (arr[i] + arr[j] + arr[k] + arr[l] == targetSum) {
                        println("(${arr[i]}, ${arr[j]}, ${arr[k]}, ${arr[l]})")
                    }
                }
                if (arr[i] + arr[j] + arr[k] == targetSum) {
                    println("(${arr[i]}, ${arr[j]}, ${arr[k]})")
                }
            }
            if (arr[i] + arr[j] == targetSum) {
                println("(${arr[i]}, ${arr[j]})")
            }
        }
        if (arr[i] == targetSum) {
            println("(${arr[i]})")
        }
    }
}

