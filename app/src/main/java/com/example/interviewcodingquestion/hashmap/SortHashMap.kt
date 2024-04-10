package com.example.interviewcodingquestion.hashmap

import java.util.TreeMap

/**
 * Sort the HashMap
 */

fun main(){
    val originalMap = hashMapOf(
        1 to "A",
        5 to "E",
        2 to "B",
        4 to "D",
        3 to "C",
        // ... (add more key-value pairs as needed)
    )

    /**
     *  Time complexity: O(n log n)
     * Space complexity: O(n)
     */
    // Sort the HashMap by values in ascending order,
    val sortedMap = originalMap.toList().sortedBy { it.first }.toMap()

    // Print the sorted map
    sortedMap.forEach { (key, value) ->
        println("$key: $value")
    }

    // Sort the HashMap by keys in descending order
    val sortedMap1 = originalMap.toList().sortedByDescending { it.first }.toMap()

    // Print the sorted map
    sortedMap1.forEach { (key, value) ->
        println("$key: $value")
    }

    /**
     * Time Complexity: O(n * log n) where n is the number of entries in the original map.
     *    TreeMap internally uses Red-Black Tree for storing entries, and insertion of n elements into a Red-Black Tree takes O(n * log n) time.
     *
     * Space Complexity: O(n) where n is the number of entries in the original map. TreeMap creates a new data structure to store the sorted entries.
     */

    val sortedMp = TreeMap(originalMap)
    println(sortedMp)

    /**
     * Manual Sorting:
     * Time Complexity: O(n log n) (sorting operation)
     * Space Complexity: O(n) (additional space for the sorted list)
     */

    val sortedEntries = originalMap.entries.sortedBy { it.key }
    // Create a new map and add sorted entries to it
    val map = hashMapOf<Int, String>()
    for ((key, value) in sortedEntries) {
        map[key] = value
    }
    println("using manual $map")

    // Print the sorted map
    map.forEach { (key, value) ->
        println("Key: $key, Value: $value")
    }

}