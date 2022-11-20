package com.kotlincourse

enum class Color(val rgb:Int){
    RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed():Boolean{
        return this.rgb and 0xFF0000 != 0
    }
}
// we are gone define the RGB colors for each of these enums colors
// a number between 0 and 255


fun main(){
    val c = Car(Color.GREEN)
    println(c.color)
    // 0...9 -> 21745 decimal
    // 0...9 A B C D E F -> 0x10 hexadecimal
    println(0x10) // 16
    println(0x1F) // 31
    println(0xFF) // 255
    println(0xCAFEBABE) // 3405691582

    println(0x000000) // black
    println(0xFFFFFF) // white

    println(0x17)

    println(0xFF0000) // red
    println(0x00FF00) // green
    println(0x0000FF) // blue

    // Binary Numbers
    println(0b1010) //10
    println(0b00001010) //10
    println(0b11111111) //255

    println(0b11111111 == 0xFF) //10

    println(0b1101 and 0b0011)
    println(0xA3)

    println(Color.RED.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.GREEN.containsRed())

    // Bitwise operator
    println(0b1101 or 0b1000) // 1101 -> 13

    println(0b1101 xor 0b1000) // 0101 -> 5

}
