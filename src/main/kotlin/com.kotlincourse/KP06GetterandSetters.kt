package com.kotlincourse

import kotlin.system.exitProcess

open class Animal {
    var age: Int = 0
        get() = field
        set(value) {
            if (value >0) {
                field = value
            }
        }
    // protected can be accessed from only this module package com.kotlincourse
    protected var name = "Cesar"
    private var breed:String =""
    fun isOld():Boolean{
        return  age > 12
    }
    // also internal can be accessed by anyone even if is not using the same pacakge
    internal val isDangerous = false
}

class Vertebrate : Animal(){
    fun introduceYourself(){
        println(this.age)
        // println(this.breed) cannot be accessed because is private
        // but the protected attribute name can be showed
        println(this.name)
        println(this.isDangerous)
    }
}

fun main(){
    val animal = Animal()
    animal.age = 54
    animal.age = -5
    // animal.breed // as you can se cannot be accessed because of private
    println(animal.age)
}