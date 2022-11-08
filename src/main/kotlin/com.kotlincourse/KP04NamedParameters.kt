package com.kotlincourse

class House (val height:Double, val color:String, val price:Int = 200000000){

    override fun toString(): String {
        return "House(height=$height, color='$color', price=$price)"
    }
}

fun main(){
    val house = House(height=66.0,  price= 170000000, color="white")
    val redHouse = House(color="red", height=57.0,  price= 330000000)
    val blueHouse = House(height = 35.0, color =  "blue")
    println(house)
    println(redHouse)
    println(blueHouse)
}