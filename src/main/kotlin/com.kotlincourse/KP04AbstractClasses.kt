package com.kotlincourse

import java.util.*


// with abstract classes we dont have to specify open anymore
// because abstract classes are implicitly and open
abstract class Person3(open val name:String, open var age:Int) {
    // some times we dont wanna
    var birthYear = Calendar.getInstance().get(Calendar.YEAR) - age

    // also here we can create abstract methods that can be used on other classes that implement this one
    abstract fun speak()

    fun greet(word:String){
        println("I'll say: $word")
    }
    fun getYearOfBirth():Int = Calendar.getInstance().get(Calendar.YEAR)-age

    override fun toString()= "Person(name='$name', age=$age)"
}

class Student2(override val name:String, override var age:Int):Person3(name,age){
    override fun speak(){
        println("Speak from student")
    }
}

class Employee2(override val name:String, override var age:Int):Person3(name,age){
    override fun speak(){
        println("Speak from Employee")
    }
}

fun main(){
    val stu = Student2("anyela",28)
    stu.speak()
    stu.greet("a")

    val stu2 = Employee2("cesar",29)
    stu.speak()
}

// Abstract vs Open keyword
// the open keyword allow us to create child classes
// by the other hand the abstract classes cannot be instantiate to any object
open class Normal
class SubClass : Normal()
abstract class AbstractClass(){
    abstract fun method()
}
//if we have an abstract method like this we actually require  to override them