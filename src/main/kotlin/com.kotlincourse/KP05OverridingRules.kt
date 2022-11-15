package com.kotlincourse

import kotlin.jvm.internal.Intrinsics.Kotlin

abstract class Course(open val topic:String, open val price:Int){
    open fun learn(){
        println("parent learning $topic")
    }
}

interface Learnable {
    fun learn(){
        println("interface learn method")
    }
}


open class KotlinCourse:Course("kotlin", 20), Learnable{
    // also we can use the final method defining that is the final method that is gonna use
    // use the final keyword when we do not want to change the implementation from another child

    // interface: if we remove it is gonnae be an issue
    final override fun learn(){
        // here we can define what is gonna do for example is gonna execute the parent learning
        // then is gonna execute another logic
        super<Course>.learn()
        println("override learning $topic")
    }
}


// this is use because sometimes we want some parent class and we want to override a method from it
class SpecialKotlinCourse:KotlinCourse(){
    fun learn2() {
        println("special course learning $topic")
    }
}

fun main(){
    val course = SpecialKotlinCourse()
    course.learn()
}
