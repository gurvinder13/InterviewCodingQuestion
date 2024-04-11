package com.example.interviewcodingquestion.hashset

/**
 * HashSet :-  HashSet implements the Set interface. There can be no duplicates in a HashSet.
 *  There is no guarantee for the order of the elements in a HashSet
 *
 *  The Set is a Kotlin data structure that stores a collection of unique elements, meaning there are no duplicate elements.
 *
 *  HashSet is a generic unordered collection of elements and it does not contain duplicate elements.
 *  It implements the set interface. hashSetOf() is a function that returns a mutable hashSet,
 *   which can be both read and written. The HashSet class store all the elements using the hashing mechanism.
 */

fun main(args: Array<String>)
{
    var planets =  HashSet<String>();

    planets.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter"));

    for(planet in planets)
    {
        println(planet);
    }

}
/**
 *  Set: Is the base interface for Set data structures in Kotlin. It defines the basic structure of
 *  an immutable Set, which contains a collection of unique elements without a specific order.
 *   To create a set in Kotlin, you can use the function setOf().
 *  val fruits = setOf("apple", "banana", "orange")
 *
 * MutableSet: The MutableSet interface extends the Set interface and adds modification operations,
 *  allowing for adding, removing, and updating elements in the set. To create a set in Kotlin, you can use the function mutableSetOf().
 * val fruits = mutableSetOf("apple", "banana", "orange")
 *
 * Constant-Time Operations: HashSet offers constant-time performance (0(1))
 * for basic operations such as add, remove, contains, and size.
 * This means that these operations have a consistent and efficient performance regardless of the size of the set.
 */