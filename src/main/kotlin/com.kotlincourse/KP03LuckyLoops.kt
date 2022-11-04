package com.programming.kotlin

import java.util.Arrays
import java.util.stream.IntStream
import java.util.stream.LongStream


fun main() {
    // we can iterate changing the value of i
    for (i in 1..30) {
        println(i)
    }

    // also we can iterate some lists
    var languages = listOf("Java","Kotlin","Python", "Jmeter")
    for (lang in languages){
        println(lang)
    }

    // we also can iterate with an index
    for ((index,lang) in languages.withIndex()){
        println("index: $index->$lang")
    }

    // while loops
    // this is pretty similar that in Java
    var counter = 9
    while (counter>0){
        println(counter)
        counter--
    }
    
    // for for a String
    for(c in "cesarpa"){
        println(c)
    }


    // using break and continue statements
    for (lang in languages){
        if (lang == "Java"){
            // as soon as the break is called it is gonna exit
            break
        }
        println(lang)
    }

    // continue : imagine that we just wanna continue with languages with no J
    for (lang in languages){
        if(!lang.contains("J")){
            // basically this will continue just when this condition happen
            continue
        }
        println(lang)
    }

    // naming loops
    externalLoop@for (i in 1..10){
        for(j in 1..10){
            if(i-j ==5){
                break@externalLoop
            }
            // notice that we are printing the numbers 7- 8- 9 -10
            // but also we can  name a loop and stop it in order to just show the 1..5 numbers
            // then when condition applies it will stop
            println("$i-$j")
        }
    }


    // loop in functional programming
    var sum = 0L;
    for (a in  100..100000L){
        sum += a
    }
    //numbers.stream().reduce{x,y-> x+y}
    println(  LongStream.range(100,100000).reduce(Long::plus))

    // exercise favorite books then print which contains e
    val books = arrayOf("booka", "booke", "bookc", "booke2")
    books.filter { b -> b.contains("e") }.forEach(System.out::println)
}

// interface example
class KP03LuckyLoops : Tooleable {
    override fun doSomething(): Int {
        // example of filter
        var newList = listOf("Java", "kotlin").asIterable().filter { l -> l == "Java" }
        println(newList)
        TODO("Not yet implemented")
    }
}

interface Tooleable {
    fun doSomething(): Int
}