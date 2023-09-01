package com.example.algopractice.twosums

import com.google.common.truth.Truth
import org.junit.Assert.*

import org.junit.Test

class TwoSumsTest {

    @Test
    fun twoSum_array1() {

        // Assign
        val twoSums = TwoSums()
        val array = intArrayOf(2,7,11,5)
        val expected = intArrayOf(0,1)

        // Act
        val result = twoSums.twoSum(array, 9)

        // Assert
        Truth.assertThat(result).isEqualTo(expected)
    }

    @Test
    fun twoSum_array2() {

        // Assign
        val twoSums = TwoSums()
        val array = intArrayOf(3,2,4)
        val expected = intArrayOf(1,2)

        // Act
        val result = twoSums.twoSum(array, 6)

        // Assert
        Truth.assertThat(result).isEqualTo(expected)
    }

    @Test
    fun twoSum_array3() {

        // Assign
        val twoSums = TwoSums()
        val array = intArrayOf(3,3)
        val expected = intArrayOf(0,1)

        // Act
        val result = twoSums.twoSum(array, 6)

        // Assert
        Truth.assertThat(result).isEqualTo(expected)
    }

    @Test
    fun twoSum_array4() {

        // Assign
        val twoSums = TwoSums()
        val array = intArrayOf(2,1,9,2,10,-9,0,5,-1)
        val expected = intArrayOf(5,8)

        // Act
        val result = twoSums.twoSum(array, -10)

        // Assert
        Truth.assertThat(result).isEqualTo(expected)
    }
}