package com.patterns

// In Kotlin, we need to use the object keyword to use Singleton class.
object Singleton {
    init {
        println("Singleton Class invoked")
    }
    var variableName = "I am var"
    fun printVarName() = println(variableName)
}


fun main(){
    Singleton.printVarName()
    Singleton.variableName = "cesar"

    var a  = A()
}

class A {

    init {
        println("Class init method. Singleton variableName property : ${Singleton.variableName}")
        Singleton.printVarName()
    }
}