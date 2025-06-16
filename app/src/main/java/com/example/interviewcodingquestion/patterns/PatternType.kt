package com.example.interviewcodingquestion.patterns

/**
 * This Kotlin file contains methods for printing various patterns.
 * It demonstrates classic pattern-printing logic, frequently used in coding interviews.
 */

fun main() {
    // Uncomment methods below to see individual pattern outputs
    // print4By4Square()
    // printLeftTriangle(5)
    // printLeftTriangle1(5)
    // printLeftTriangle2(5)
    // printPattern1(5)
    // printPattern2(5)
    // printPattern3(5)
    printPattern(5)
}

/**
 * Prints a 4x4 square of asterisks (*)
 *
 * Output:
 * ****
 * ****
 * ****
 * ****
 */
fun print4By4Square() {
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            print("*")
        }
        println()
    }
}

/**
 * Prints a left-aligned right-angled triangle using asterisks (*)
 *
 * Output for n = 5:
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
fun printLeftTriangle(n: Int) {
    for (i in 0 until n) {
        for (j in 0..i) {
            print("* ")
        }
        println()
    }
}

/**
 * Prints a left-aligned triangle with numbers increasing in each row
 *
 * Output for n = 5:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */
fun printLeftTriangle1(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}

/**
 * Prints a left-aligned triangle with same number repeated in each row
 *
 * Output for n = 5:
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */
fun printLeftTriangle2(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("$i ")
        }
        println()
    }
}

/**
 * Prints an inverted left-aligned triangle of asterisks
 *
 * Output for n = 5:
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 */
fun printPattern1(n: Int) {
    for (i in 0..n) {
        for (j in 0 until n - i) {
            print("* ")
        }
        println()
    }
}

/**
 * Prints an inverted triangle with decreasing number sequence in each row
 *
 * Output for n = 5:
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */
fun printPattern2(n: Int) {
    for (i in 0..n) {
        for (j in 1..n - i) {
            print("$j ")
        }
        println()
    }
}

/**
 * Prints a centered pyramid of asterisks
 *
 * Output for n = 5:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
fun printPattern3(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
            print(" ")
        }
        for (j in 0 until 2 * i + 1) {
            print("*")
        }
        for (j in 0 until n - i - 1) {
            print(" ") // Optional for symmetry
        }
        println()
    }
}

/**
 * Prints an inverted centered pyramid of asterisks
 *
 * Output for n = 5:
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
fun printPattern(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until i) {
            print(" ")
        }
        for (j in 0 until (2 * n) - (2 * i + 1)) {
            print("*")
        }
        for (j in 0 until i) {
            print(" ") // Optional for symmetry
        }
        println()
    }
}
