package com.cesarpa.lambda;

import org.testng.annotations.Test
import kotlin.test.assertEquals

class LambdaExpressionTests {

    @Test
    fun testRemoveUpperString(){
        val list = listOf("AD", "AWs", "awe")
        val lambdaExpression = LambdaExpression()

        assertEquals(listOf("awe"), lambdaExpression.removeUpperString(list))
    }
}
