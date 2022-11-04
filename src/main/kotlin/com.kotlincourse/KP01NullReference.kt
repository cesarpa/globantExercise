package com.programming.kotlin

fun main(){
    // null is an special value that you can  assign to a variable
    // var str:String = null -> its not possible
    // var int:Int = null -> not possible

    // then in order to support Java language we can put a Question Mark
    var str:String? = null

    str?.length

    var i:Int? = str?.length

    // The !! operator
    /*
    The third option is for NPE-lovers: the not-null assertion operator (!!)
     converts any value to a non-null type and throws an exception if the value is null.
     You can write b!!, and this will return a non-null value of b (for example, a String in our example) or throw an NPE if b is null:
     */
    str!!.length // this secures that the String will not be null if that the case  it will put a null exception

    //Collections of a nullable type

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()

}

