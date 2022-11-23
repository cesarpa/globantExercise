package com.kotlincourse

import java.util.*

fun main() {
    val number = Random().nextInt(100)
    var input: String?
    var guess = -1

    while (guess != number) {
        println("guess a number between 1 and 100:")
        input = readLine()
        if (input != null) {
            guess = input.toInt()
            println(guess)
            when {
                guess > number -> println("this number is too high")
                guess < number -> println("this number is too low")
                else -> println("you won")
            }

        }

    }
}