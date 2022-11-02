package com.cesarpa.firstMissing

class FirstElement {

    fun firstElementMissing(list: List<Int>): Int {
        for (i in list.indices) {

            var expectedSum = (i + 1) * (i + 2) / 2
            if (expectedSum != list[i]) {
                return expectedSum
            }
        }
        return -1
    }
}