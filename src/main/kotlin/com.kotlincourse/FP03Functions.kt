package com.kotlincourse

import java.util.Date


// for example here we take a parameters that are multiple strings this strings pass wherever the program
// is run from the command line
fun main(){
    // lets call our function
    helloWorld()
    printWithSpaces("Kotlin")
    // lets call getCurrentDate
    println(getCurrentDate())
    println(getMaximumNumber(2,5))

    val numbers = listOf<Int>(2,5,6,7)
    println(reversedIntList(numbers))
    println(reversedIntListTraditional(numbers))
    println(reversedIntListTraditional2(numbers))
    println(numbers.reversed())
}
// let's create  a function for printing with no params
fun helloWorld(){
    println("cesar pa")
}

// now we can pass parameters to pass
fun printWithSpaces(str: String){
    str.forEach { c -> print("$c ") }
    println()
}

// in other scenarios we usually want to return a value for example to get the current Date
fun getCurrentDate():Date = Date()

// lets return a maximum value from 2 numbers
fun getMaximumNumber(a:Int,b:Int):Int {
    return if (a > b) a else b
}

// let's reversed a List
fun reversedIntList(numbers:List<Int>):List<Number>{
    return numbers.mapIndexed {
            index, element ->
        numbers.get(numbers.size-1-index)  }
}

// let's work in the traditional way
fun reversedIntListTraditional(numbers:List<Int>):List<Number>{
    var newList =  ArrayList<Int>()
    for (i in 1..numbers.size){
        newList.add(numbers.get(numbers.size-i))
    }
    return  newList
}

// and another for to use it is
// lets work in the traditional way
fun reversedIntListTraditional2(numbers:List<Int>):List<Number>{
    var newList =  ArrayList<Int>()
    for (i in numbers.size-1 downTo 0 ){
        newList.add(numbers[i])
    }
    return  newList
}