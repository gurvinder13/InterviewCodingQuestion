package com.example.interviewcodingquestion.programs.commons

/**
 * Program To Print First N Natural Numbers
 */

fun main (){
    printN(5)
}

/**
 * Recursive
 *
 * The time complexity of the printN function is O(N)
 *  The space complexity of the printN function is O(N)
 */
private fun printN(n :Int){
    if (n < 1){
        return
    }
    printN(n -1)
    println(n)
}

/**
 * TC - O(n)
 * SC - O(1)
 */
fun printFirstNNaturalNumbers(N: Int) {
    println("First $N natural numbers:")
    for (i in 1..N) {
        print("$i ")
    }
}
