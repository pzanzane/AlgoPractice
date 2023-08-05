package com.example.algopractice.romantoint

import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
internal class RomanToIntTest {

    @Test
    fun romanToInt_ascendingorder_returnSum() {

        val romanInt = RomanToInt()
        val sum = romanInt.romanToInt("LVIII")

        Truth.assertThat(sum).isEqualTo(58)
    }

    @Test
    fun romanToInt_nonascendingorder_returnSum() {

        val romanInt = RomanToInt()
        val sum = romanInt.romanToInt("MCMXCIV")

        Truth.assertThat(sum).isEqualTo(1994)
    }
}