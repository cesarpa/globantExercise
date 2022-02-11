package com.cesarpa.firstMissing

import org.testng.Assert.*
import org.testng.annotations.Test

class FirstElementTest{

    @Test
    fun testMissingElement(){
        var firstMissingElement=FirstMissingElement()
        var result=firstMissingElement.missingFirstNumber(listOf(1,2,4,6))
        kotlin.test.assertTrue(result == 3)
    }

}