package com.example.interviewcodingquestion.hashmap

/**
 *
 */
fun main(args: Array<String>)
{
    val alphabetMap = hashMapOf("A" to "Apple", "B" to "Ball",
        "C" to "Cat")

    for((alphabet,word) in alphabetMap)
    {
        println("$alphabet for $word")
    }

    /**
     * HashMap getOrDefault function
     * We can use getOrDefault method to get value for given key, and to return a default value,
     * if the key is not present. In the following example, we used the getOrDefault function to get
     *  the value of the D, which does not exist.
     */
    println("Four = " + alphabetMap.getOrDefault("D", "Doll"))


    val planets =  HashMap<String, String>()

    planets["Earth"] = "Blue marble. Has Water. Brimming with life!"; // both are same
    planets.put("Mars", "Red Planet. Barren. Has no life.");
    planets.put("Pluto", "It is not a Planet. It is actually a space station for Aliens.")
    var sizeOfHashMap = planets.size
    println("Size of HashMap is $sizeOfHashMap")
    planets.clear()
    sizeOfHashMap = planets.size
    println("Size of HashMap is $sizeOfHashMap")

    /**
     *  IMP  - Note
     *  for ((key, value) in hashMap) {
     *     println("Key: $key, Value: $value")
     * }
     *
     * // Iterating over keys
     * for (key in hashMap.keys) {
     *     println("Key: $key")
     * }
     *
     * // Iterating over values
     * for (value in hashMap.values) {
     *     println("Value: $value")
     * }
     */
}