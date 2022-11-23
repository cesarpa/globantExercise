package com.kotlincourse

fun main() {
    // el ahorcado en ingles
    println("Please enter the word that is gonna be guessed")
    var word = readLine()
    var console:String? = word?.map { x -> "-" }?.reduce { acc, string -> acc + string }
    var count = 0
    while (console != word) {
        println("#Wrong guesses: $count")
        var char = readLine()!![0]
        if (word?.contains(char) == true) {
            word.forEachIndexed { index:Int,element ->
                console = console?.changeCharInString(element,char,index)
            }
        }else{
            count++
        }
        console?.forEach { x -> print(" $x") }
        println()
    }
    println("You win word guesssed $console and $count wrong guessed")

}

fun String.changeCharInString( element:Char, char: Char, index:Int): String? {
    if (char==element){
        var chars = this?.toCharArray()
        chars?.set(index, element)
       return chars?.let { String(it) }
    }
    return this
}