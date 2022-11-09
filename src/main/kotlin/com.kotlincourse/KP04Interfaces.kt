package com.kotlincourse

// Interfaces defines a contract for classes
// we start using the interface keyword
// inside the interface we dont have to define any methods or properties as abstract
// because are implicit , all the methods/properties are abstract
interface Driveable {
    fun drive()
}

interface Buildable {
    // for the interfaces we can also have something like a value or time
    // interfaces cannot have any state
    val timeRequired: Int
    fun build()
    // default implementation
    fun build2() {
        println("Build2")
    }
}

// also we can implement multiple interfaces
// lets create a class that implement that interface
class Car(val color: String) : Driveable, Buildable {
    // here we are following the contract for the interface
    // implement each of the methods/properties
    override fun drive() {
        println("Car driving")
    }

    // here we have to add a property overriding our interface
    override val timeRequired: Int = 5

    override fun build() {
        println("Car building")
    }
}

// similar we can create a motorcycle class
class Motorcycle() : Driveable {
    override fun drive() {
        println("Drive")
    }
}

fun main() {
    val driveable: Driveable = Car("red")
    driveable.drive()
    // here driveable cannot build -> wrong driveable.build()
    val driveable2: Driveable = Motorcycle()
    driveable2.drive()

    val buildable: Buildable = Car("blue")
    // as you can notice you can use the default implementation in the interfaces Java8
    buildable.build2()
}