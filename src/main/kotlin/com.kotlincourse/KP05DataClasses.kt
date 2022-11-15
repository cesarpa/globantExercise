package com.kotlincourse


// classes that just contains data to write them or read them, they just hold data
class Book1(val title:String, val author:String, val publicationYear:Int, var price:Double)

data class DataBook(val title:String, val author:String, val publicationYear:Int, var price:Double){

}

fun main(){
    val book = Book1("title1","author1",1990,15.4)
    val dataBook = DataBook("title1","author1",1990,15.4)
    val dataBook2 = DataBook("title1","author1",1990,15.4)
    // also we can copy the objects in a easy way
    // and we can pick one property then change for a different value putting it inside the copy method
    val dataBook3 = dataBook2.copy(price = 20.0)
    println(dataBook3)

    println(book) // com.kotlincourse.Book1@17f6480 it prints the package whe it is then a memory address
    println(dataBook) // DataBook(title=title1, author=author1, publicationYear=1990, price=15.4) bu the other hand this data class prints the class and the attributes

    // also data classes allow us to compare 2 objects
    println(dataBook.equals(dataBook2)) // prints true because has the same properties but this not happen with normal classes
    // this happen because data classes overrides the equals method in an useful way

    // another interesting thing is that we can decompose, that is awesome
    val (title,author,year,price) = dataBook
    println(title)
    println(author)

    // another thing is that we can create a set or a hash map that contains  objects of the data classes
    val set = hashSetOf(dataBook,dataBook2,dataBook3)
    // as you know this is a list but the hash cannot contain repeated values
    // for this case we have databook and databook2 repeated lets print
    println(set)
    // [DataBook(title=title1, author=author1, publicationYear=1990, price=20.0), DataBook(title=title1, author=author1, publicationYear=1990, price=15.4)]

}

interface Lendable{
    fun borrow()
}

abstract class InventoryItem( val title:String, val genre:String, val publicationYear: Int, val borrowed:Boolean):Lendable{

}

class BookE(val author: String,   title: String,
              genre:String,  publicationYear: Int):InventoryItem(title,genre,publicationYear,false){
    override fun borrow() {
        println("Borrow the Book with author$author")
    }
    fun read() {
        println("Reading a book by $author...")
    }
}

class DVDE(val length: Int, title: String,
             genre:String, publicationYear: Int):InventoryItem(title,genre,publicationYear,false){
    override fun borrow() {
        println("Borrow the DVD with length $length")
    }

    fun watch() {
        println("Watching $title...")
    }
}