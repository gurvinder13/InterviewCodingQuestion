package com.example.interviewcodingquestion.programs.arrays

/**
 * Sort an array in wave form
 *  he time complexity of the function is O(N)
 *  SC - O(1)
 */

fun main() {
   val array = intArrayOf(1,2,3,4)
    println(waveArray2(array).joinToString(","))
}

fun waveArray(array: IntArray): IntArray {
    for (i in 0 until array.size - 1 step 2) {
        val temp = array[i]
        array[i] = array[i + 1]
        array[i + 1] = temp
    }

    return array
}

fun waveArray2(arr: IntArray): IntArray {
    for (i in 0 until arr.size - 1 step 2) {
        // Check if the current index is even or odd
        if (i % 2 == 0) {
            // For even indices, swap with the next element
            if (arr[i] < arr[i + 1]) {
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
            }
        } else {
            // For odd indices, swap with the previous element
            if (arr[i] > arr[i + 1]) {
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
            }
        }
    }
    return arr
}
