package com.kotlincourse

fun main(){
    val namesToAges= mapOf(Pair("Peter",24), Pair("Roger",42))
    val namesToAges2= mapOf(
        "Peter" to 23,
        "Roger" to 42)
    println(namesToAges == namesToAges2)
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToHabitants = mutableMapOf(
        "Germany" to 80_000_000,
        "USA" to 300_000_000
    )

    countryToHabitants.put("Australia", 23_000_000)
    // it does not change
    countryToHabitants.putIfAbsent("Australia", 320_000_000)
    // just change if we simply use put
    // countryToHabitants.put("Australia", 320_000_000)

    println(countryToHabitants.entries)

    println(countryToHabitants.contains("Australia"))
    println(countryToHabitants.containsKey("Australia"))
    println(countryToHabitants.containsValue(23_000_000))

    println(countryToHabitants.get("Australia"))
    // get the value of France if does not exist return 0
    println(countryToHabitants.getOrDefault("France",0))


    countryToHabitants.forEach { it -> println("${it.key} contains ${it.value} of habitants") }
}