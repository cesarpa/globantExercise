package com.kotlincourse

abstract class Campeon(val name:String, val linea:String) {
    open fun ulti(){
        println("esta en la 3er slot")
    }
    fun describir(){
        println("el campeon es $name y es $linea")
    }
}

interface Ulteable {
    fun ulti(){
        println("esta en gris")
    }
}

open class Karma:Campeon("Foira", "top"), Ulteable{
    final override fun ulti(){
        super<Ulteable>.ulti()
        println("no tiene ulti real")
    }
}

class Karma2: Karma() {

}

fun main(){
    val c = Karma2()
    c.ulti()
}