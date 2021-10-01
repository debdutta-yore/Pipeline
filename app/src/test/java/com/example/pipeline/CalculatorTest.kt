package com.example.pipeline


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CalculatorTest {

    @Test
    fun sum() {
        val first = 100
        val second = 200
        val result = Calculator.sum(first, second)
        assertThat(result).isEqualTo(300)
    }
}