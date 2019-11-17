package com.example.junittesting


import org.hamcrest.CoreMatchers.`is`
import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {

    @Test
    fun add() {
        val calculator = Calculator<Int>()
        val result = calculator.add(6, 3)
        assertEquals(result, 9)
    }

    @Test
    fun subtract() {
        val calculator = Calculator<Int>()
        val result = calculator.subtract(6, 3)
        assertEquals(result, 3)
    }

}