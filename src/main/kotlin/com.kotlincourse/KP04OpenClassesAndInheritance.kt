package com.kotlincourse

import java.util.*

// we can inherit all the properties from a class and methods
// this allows us to avoid duplicated code

open class Person2(open val name:String, open var age:Int) {
    var birthYear = Calendar.getInstance().get(Calendar.YEAR) - age
    fun speak(){
        println("Hi guys my name is $name")
    }
    fun greet(word:String){
        println("I'll say: $word")
    }
    // now we can return also data from the functions
    fun getYearOfBirth():Int = Calendar.getInstance().get(Calendar.YEAR)-age

    override fun toString()= "Person(name='$name', age=$age)"
}

// lets create the class Student
// we have to put open in order to inherit the properties/methods
class Student (override val name:String,override var age:Int, val studentId:Int) : Person2(name,age){
    // also we can add some attributes like the StudentId
    fun isIntelligent() = true
}

class Employee (override val name:String, override var age:Int):Person2 (name,age) {
    fun receivePayment(){
        println("Receive Payment")
    }
}

fun main(){
    // Also you can create an Studen or employee
    // then use the methods
    val student = Student("carlos",2, 3748934)
    println(student)
    student.speak()
    student.greet("Student")
    // here we can use the methods from a student
    student.isIntelligent()

    val employee = Employee("garcia",3)
    println(employee)
    employee.speak()
    employee.greet("Employee")
    employee.receivePayment()
}