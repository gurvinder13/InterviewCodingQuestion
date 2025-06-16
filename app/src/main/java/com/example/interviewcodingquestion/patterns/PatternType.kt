package com.example.interviewcodingquestion.patterns

/**
 * This Kotlin file contains methods for printing various patterns.
 * It is structured to demonstrate different types of loop-based pattern problems
 * commonly asked in coding interviews.
 */

fun main() {
    // Calling the 4x4 square pattern printer
   // print4By4Square()
   // printLeftTriangle2(5)
    printPattern(4)

}

/**
 * Prints a 4x4 square made of asterisk (*) characters.
 *
 * Output:
 * ****
 * ****
 * ****
 * ****
 */
fun print4By4Square() {
    for (i in 0 until 4) {              // Outer loop for rows (0 to 3)
        for (j in 0 until 4) {          // Inner loop for columns (0 to 3)
            print("*")                 // Print asterisk on the same line
        }
        println()                      // Move to next line after one row is printed
    }
}
/**
 * Prints a left-aligned right-angled triangle using asterisks (*).
 *
 * Example for n = 4:
 * *
 * * *
 * * * *
 * * * * *
 */
fun printLeftTriangle(n:Int){
    for (i in 0 until n ){
        for (j in 0..i){
            print("* ")
        }
        println()
    }
}
fun printLeftTriangle1(n:Int){
    for (i in 1.. n ){
        for (j in 1..i){
            print("$j ")
        }
        println()
    }
}
fun printLeftTriangle2(n:Int){
    for (i in 1.. n ){
        for (j in 1..i){
            print("$i ")
        }
        println()
    }
}
fun printPattern(n:Int){
    for (i in 0.. n ){
        for (j in 0 until n-i){
            print("* ")
        }
        println()
    }
}
