package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Before
import org.junit.Test

class BusinessRuleClassTest {
    private lateinit var businessRule: BusinessRuleClass

    @Before
    fun setUp() {
        businessRule = BusinessRuleClass()
    }

    @Test
    fun `should execute the plus operation successfully`() {
        val result = businessRule.addOperation(1, 3)
        assertEquals(4, result)
    }

    @Test
    fun `should execute the sub operation successfully`() {
        val result = businessRule.subOperation(8, 2)
        assertEquals(6, result)
    }

    @Test
    fun `should execute the no negative sub operation successfully`() {
        val result = businessRule.noNegativeSubOperation(9, 1)
        assertEquals(8, result)
    }

    @Test
    fun `should throw exception the no negative sub operation`() {
        assertThrows(IllegalStateException::class.java) {
            businessRule.noNegativeSubOperation(4, 7)
        }
    }
}