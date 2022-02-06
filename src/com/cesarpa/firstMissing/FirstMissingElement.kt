package com.cesarpa.firstMissing

class FirstMissingElement {

    fun missingFirstNumber(list: List<Int>): Int {
        //formula n(n+1)]/2
        var sum = 0
        for (i in list.indices) {
            val position = i+1
            sum += list[i]
            var formulaNaturalNumbers = position * (position + 1) / 2
            if (sum != formulaNaturalNumbers) {
                return position
            }
        }
        return 0
    }

}