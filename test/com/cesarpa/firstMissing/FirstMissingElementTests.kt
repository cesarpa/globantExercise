package com.cesarpa.firstMissing

import org.testng.annotations.Test
import kotlin.test.assertTrue

class FirstMissingElementTests {

    @Test
    fun testFindMissingElement() {
        val firstMissingElement = FirstMissingElement()
        var list = listOf<Int>(1, 2, 3, 5, 6)
        var mussingNumber = firstMissingElement.missingFirstNumber(list)

        assertTrue(mussingNumber== 4)
    }
}