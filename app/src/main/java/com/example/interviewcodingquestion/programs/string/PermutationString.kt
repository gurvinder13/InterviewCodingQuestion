package com.example.interviewcodingquestion.programs.string

/**
 *  permutation algorithm
 *  Permutations of given String
 *
 */

fun main() {
    val str = "abc"
    val arr = str.toCharArray()
    permutationString(arr, 0)

    /**
     * Output
     * abc
     * acb
     * bac
     * bca
     * cba
     * cab
     */
}

/**
 * time complexity is O(n!),
 * space complexity is O(n) - due to the recursive call stack, which can grow up to the depth of the recursion tree,
 * which is n in this case, as we generate permutations for each character of the string.
 *  Additionally, the space complexity includes the space used for storing the characters in the character array
 *
 */
fun permutationString(arr: CharArray, fi: Int) {
    if (fi == arr.size - 1) {
        println(arr.joinToString(""))
        return
    }
    for (i in fi until arr.size) {
        swap(arr, i, fi)
        permutationString(arr, fi + 1)
        swap(arr, i, fi)
    }

}

private fun swap(array: CharArray, i: Int, fi: Int) {
    val temp = array[i]
    array[i] = array[fi]
    array[fi] = temp
}