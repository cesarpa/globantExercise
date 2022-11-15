package com.kotlincourse

// First of all a Singleton is a class which can only be instantiated 1 time
// meaning that you cannot be able to call  a constructor for that class because you can create an amount of objects

// object can only have 1 instance
object Cache {
    val name  = "cacheObject"

    fun retrieveDate():Int{
        return 0
    }
}