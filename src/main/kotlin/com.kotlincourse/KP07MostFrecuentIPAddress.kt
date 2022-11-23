package com.kotlincourse

import java.io.File

fun  main(){
    var map:MutableMap<String,Int> = mutableMapOf()
    File("src/main/60.ips.txt").forEachLine {
        val numerOfExistences = map.getOrDefault(it,0)
        map.put(it,numerOfExistences+1)
    }
    val max = map.maxByOrNull { it.value }
    println("${max?.key} number of times repeted ${max?.value}")

}