package com.kotlincourse

import java.util.Calendar
import java.util.Date

// this paradigm we want to give properties to the objects
// also those objects have properties
// its focus on how we can create abstraction of the real world objects

// the classes: are like the blue prints from which we can create/instantiate specific objects
// the properties: are the characteristics of the objects color name brand
// methods: this defines the functionality of our classes accelerate() break()
// interfaces: this define a contract that a class can decide to adhere or use, driveable
class KP04ObjectOrientedProgramming {

}
// this seems like a class in Kotlin
class Person{
    var name: String = "cesar"
    var age: Int = 29
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

    // now lets see the methods
    fun speak(){
        println("Hi guys my name is $name")
    }

    fun greet(word:String){
        println("I'll say: $word")
    }

    // now we can return also data from the functions
    fun getYearOfBirth():Int = Calendar.getInstance().get(Calendar.YEAR)-age

}

fun main(){
    // Let's create an object from the class person
    val person = Person()
    println(person.name)
    println(person.age)

    // lets change the properties
    person.name = "andres"
    person.age = 30

    println(person)

    person.speak()
    person.greet("que mas parcero")
    println("the year of birth is "+person.getYearOfBirth())

}