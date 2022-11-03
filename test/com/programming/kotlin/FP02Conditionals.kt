package com.programming.kotlin

import kotlin.random.Random

fun main() {

    // if statements
    val age = 29
    if (age < 30) {
        println("this is fine xd")
    } else if (age < 50) {
        println("also we are fine too")
    } else {
        println("fine no problem")
    }


    // When statements
    val type = 2
    when (type) {
        1 -> println("type 1")
        2 -> {
            println("type 2")
            println("this is the last type")
        }
        else -> println("no specific type")

    }

    // Conditional Expressions
    val adult = if (age>18) {
        println("you are adult")
        1
    }else{
        2
    }
    println(adult)

    // When Expression
    val category = "f"
    var sport = when(category){
        "f" -> "Futbol"
        "n" -> "NBA"
        else -> "NA"
    }


    // When advance
    val variable = 36
    when(variable){
        5 -> println("it's 5")
        3*12 -> println("x is 3*12")
        "cesarpa".length -> println("x is the length of the word 'cesarpa")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("x is between 11 and 20")
        in 21..30 -> println("x is between 21 and 30")
        !in 1..10 -> println("x is Not between 1 and 10")
        is Int -> "is int   "
    }
    val x = 5
    var y = if(x<3){
        "!"
    }else{
        "a"
    }


    // code challenge
    val random:Int = Random.nextInt(50) +1

    when(variable){
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("x is between 11 and 20")
        in 21..30 -> println("x is between 21 and 30")
        in 31..40 -> println("x is between 31 and 40")
        in 40.. Int.MAX_VALUE -> println("above 40")
    }

}