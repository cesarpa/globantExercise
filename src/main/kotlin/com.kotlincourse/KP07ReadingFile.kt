package com.kotlincourse

import java.io.File

fun main(){
    File("src/main/inputFile.txt").forEachLine {
        println(it)
    }
}