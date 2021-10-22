package com.example.myapplication

class BusinessRuleClass {
    fun addOperation(n1: Int, n2: Int): Int = n1 + n2
    fun subOperation(n1: Int, n2: Int): Int = n1 - n2
    fun noNegativeSubOperation(n1: Int, n2: Int): Int {
        val result = n1 - n2
        if (result < 0) throw IllegalStateException("Number cannot be negative")

        return result
    }
}
