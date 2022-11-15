package com.kotlincourse

enum class Color{
    RED,GREEN,BLUE
}


fun main(){
    val c = Car(Color.GREEN)
    println(c.color)
}
