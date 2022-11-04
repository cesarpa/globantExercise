package com.programming.kotlin

fun main(args: Array<String>){
    println("Hi I'm Cesarpa")

    var variable = "Apple"
    variable = "Google"

    val name = "Cesar"
   // name ="" the variable cannot be reassigned

    val myBoolean = 4 > 3

    // also you can assing the type of the variable
    val iva:Double = 16.05

    // here are some other variables
    // here are more info https://beginnersbook.com/2017/12/kotlin-variables-data-types/#:~:text=There%20are%20two%20types%20of,mutable%20variable%20can%20be%20changed.

    // Byte -128 to 127.
    val byte:Byte = 127


    // Short -32768 to 32767.
    val short:Short = 32767

    // Int  -231 to 231-1
    val int:Int =  123456

    // Long  is -2´63 to 2¨63-1
    var long:Long = 123456789
    // also it can be represented with an L
    long = 123456789L

    // Double
    val double:Double = 101.99

    // Float it has the value with the F letter
    val float:Float = 101.99F


    // Boolean
    val boolean:Boolean = true

    // Char
    val char:Char = 'C'

    /*** also we can convert into different Types*/
    var converted = double.toInt()

    // Basic Data Types https://kotlinlang.org/docs/basic-types.html
    /*
        Numbers and their unsigned counterparts

        Booleans

        Characters

        Strings

        Arrays
     */

}
