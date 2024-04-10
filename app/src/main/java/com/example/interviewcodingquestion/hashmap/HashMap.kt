package com.example.interviewcodingquestion.hashmap

/**
 * Hashmap :- Key Value Pair Data Structure
 *
 *  HashMap is a collection that stores key-value pairs.
 * It allows us to store elements based on unique keys and provides fast retrieval of values based on their keys.
 *
 * HashMap is a collection class  that provides a key-value pair data structure.
 * It implements the Map interface and allows storing and retrieving elements based on unique keys.
 *
 * HashMaps use hashing algorithms internally to efficiently locate and access elements,
 *    making them an ideal choice for scenarios requiring fast key-based lookup.
 *
 *
 *  Key Characteristics Of HashMap
 * Mutable: You can add, remove, or modify entries after the HashMap is created.
 * Unordered: The entries in a HashMap are not ordered. You cannot expect them to be in any specific order when iterating.
 * Allows Null: HashMap allows one null key and multiple null values.
 *
 *
 *
 * public int size(): Returns the number of key-value mappings in this map.
 * If the map contains more than Integer.MAX_VALUE elements return Integer.MAX_VALUE.
 *
 * public Set<K> keySet(): Returns a Set view of the keys contained in this map.
 * The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
 *
 * public Set<Map.Entry<K,V>> entrySet(): This method returns a Set view of the HashMap mappings.
 * This set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
 */

/**
 *  HashMap is a class in the java.utils package that implements the Map interface.
 *  It is used to store the key-value pair.
 *
 * Some of the features of HashMap are:
 *
 * The keys should be unique.
 * HashMap allows only one null key.
 * The values can be null or duplicate.
 * The keys are stored in random order.
 */

fun main() {
    val myMap = mapOf<Int, String>(1 to "A", 3 to "B", 5 to "C") // Immutable in nature

    // print all pair
    for (element in myMap) {
        println(element)
    }
    for (key in myMap.keys) {
        println("Element at Key : $key =  ${myMap[key]}")
    }

    for (value in myMap.values) {
        println("value of :- $value")
    }
    // Iterating over HashMap

    // iterating over hashMap
    for ((key, value) in myMap)
    {
        println("$key : $value")
    }

    // Iterating over HashMap (using forEach)

    // using forEach
    myMap.forEach{
            (key, value) ->
        println("$key : $value")
    }

    // Play with HashMap properties

    val size = myMap.size
    val isEmpty = myMap.isEmpty()
    val containsKey = myMap.containsKey(3)
    val containsValue = myMap.containsValue("C")
    println(size)
    println(isEmpty)
    println(containsKey)
    println(containsValue)

    val fruitsColorMap: HashMap<String, String> = hashMapOf(
        "Apple" to "Red",
        "Banana" to "Yellow",
        "Grape" to "Purple"
    )

// Accessing a value using its key
    val appleColor = fruitsColorMap["Apple"]
    println(appleColor)

    val hMap = HashMap<String, String>()
    hMap.put("12", "Ram")
    hMap.put("3", "Rohan")
    hMap.put("5", "Shyam")
    println(hMap)
}