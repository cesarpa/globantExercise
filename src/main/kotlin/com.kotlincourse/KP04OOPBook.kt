package com.kotlincourse

class Book(private val title:String, private val author:String, private val publicationYear:Int, var borrowed:Boolean=false) {
    fun borrow(){
        this.borrowed = !borrowed
    }

    override fun toString(): String {
        return "Book(title='$title',author='$author', publicationYear=$publicationYear)"
    }
}

fun main(){
    val book = Book("title1", "atuhor1", 1999)
    book.borrow()
    println(book)
}