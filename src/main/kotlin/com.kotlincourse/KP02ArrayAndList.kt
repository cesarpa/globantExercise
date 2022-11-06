package com.programming.kotlin

class FP02ArrayAndList {}

fun main(){
    // what arrays are
    // you can use arrays when you know the numbers of elements that you are gonna iterate/use
    val array = arrayOf("Colombia", "Mexico", "Uruguay")
    // add is not allowed array has a fixed length

    // What lists are
    val fruits = listOf<String>("apples", "oranges", "bananas")
    // we cannot use the method add it fails it is a inmutable list fruits.add

    // if do you want mutable list in order to change the elements  you can use instead  arrayList
    val arrayList = arrayListOf<String>("Cesar", "Andres", "Anyela", "Alex")
    arrayList.add("Sandra")


    // general arrays
    val mixed = arrayOf("Cesar",10,true)

    // but also you can create an array fron an specific type
    val numbers = intArrayOf(2,4,5)

    mixed[2]=34

    mixed.asIterable().forEach{it -> println(it) }

    // also you can sum arrays
    val newArray = arrayList + mixed
    newArray.asIterable().forEach { x -> println(x) }

    // also you can evaluate the size of an array
    val isEmpty = newArray.isEmpty()

    // and of course validate an element in the array
    if(arrayList.contains("Anyela")){
        println("yes")
    }


    // LIST IN KOTLIN

    val sportsV1 = arrayListOf("soccer", "nba", "mlb")
    val sportsV2 = arrayListOf("golf")

    val allSports:ArrayList<String> = (sportsV1 + sportsV2) as ArrayList<String>
    allSports.asIterable().map { s -> s.uppercase() }.forEach(System.out::println)
    /*
    SOCCER
    NBA
    MLB
    GOLF
     */

    // also you can add or remove items
    allSports.remove("nba")
    println(allSports)
    // [soccer, mlb, golf]

    //and also you can create a sublist
    val subList = allSports.subList(0,2)
    println(subList)

    subList.size




}