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
// here we create the constructor also we can use the variables passed

class Person(val name:String, var age:Int){
    var birthYear =  Calendar.getInstance().get(Calendar.YEAR)-age

    // other place when we can modify the attributes from a class is in the init section
    init {
        println("The object was created")
        // also when we mention this is goint to refer the object that we are currently talnking about
        // then this is ommited by kotlin and you already can use the attributes directly created on the constructor firm
        //this.name = name
        //this.age = age
    }



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
    // here we can pass the attributes in the constructor
    val person = Person("Cesar2", 29)
    println(person.name)
    println(person.age)

    // lets change the properties
    person.age = 30

    println(person)

    person.speak()
    person.greet("que mas parcero")
    println("the year of birth is "+person.getYearOfBirth())

}