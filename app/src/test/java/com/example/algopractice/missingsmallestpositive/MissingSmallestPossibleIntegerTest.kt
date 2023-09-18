package com.example.algopractice.missingsmallestpositive

import com.google.common.truth.Truth
import org.junit.Assert.*

import org.junit.Test

class MissingSmallestPossibleIntegerTest {

    @Test
    fun solutions_1() {

        // Assign
        val miss = MissingSmallestPossibleInteger()
        val A = intArrayOf(1,2,1,4,3,5)

        // Act
        val solution = miss.solutions(A)

        // Assert
        Truth.assertThat(solution).isEqualTo(6)
    }

    @Test
    fun solutions_2() {

        // Assign
        val miss = MissingSmallestPossibleInteger()
        val A = intArrayOf(1,2,4)

        // Act
        val solution = miss.solutions(A)

        // Assert
        Truth.assertThat(solution).isEqualTo(3)
    }

    @Test
    fun solutions_3() {

        // Assign
        val miss = MissingSmallestPossibleInteger()
        val A = intArrayOf(3,4,5)

        // Act
        val solution = miss.solutions(A)

        // Assert
        Truth.assertThat(solution).isEqualTo(1)
    }

    @Test
    fun solutions_4() {

        // Assign
        val miss = MissingSmallestPossibleInteger()
        val A = intArrayOf(3)

        // Act
        val solution = miss.solutions(A)

        // Assert
        Truth.assertThat(solution).isEqualTo(1)
    }
}