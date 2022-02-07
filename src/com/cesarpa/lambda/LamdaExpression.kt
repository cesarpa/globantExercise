package com.cesarpa.lambda

import java.util.*

class LambdaExpression {

    fun removeUpperString(items: List<String>): List<String> {
        return items.filter { i: String -> i.lowercase() == i }

    }
}

