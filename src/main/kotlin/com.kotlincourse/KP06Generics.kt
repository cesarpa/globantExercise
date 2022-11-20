package com.kotlincourse

// DRY dont repeat yourself
// you can create a generic parameter
// we can add a constructor parameter which allows you to add as many elements of the specified type as you want
class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()

    fun push(element: E){
       elements.add(element)
    }

    fun pop(){
        if(isEmpty()) {
            elements.removeAt(elements.size - 1)
        }
    }

    fun isEmpty() = elements.size ==0
}

fun <T> stackOf(vararg elements:T) : Stack<T>{
    return Stack(*elements)
}

fun main (){
    val myStack = Stack(2,5,6,7)
    myStack.pop()
    println(myStack)

    val secondStack = stackOf( "cesar", "andres", "anyela")
}

