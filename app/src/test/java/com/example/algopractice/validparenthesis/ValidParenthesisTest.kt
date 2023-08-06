package com.example.algopractice.validparenthesis

import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
internal class ValidParenthesisTest {

    @Test
    fun isValid_inCorrectBrackets() {

        // Assign
        val validParenthesis = ValidParenthesis()
        val parenthesis = "(]"

        // Act
        val result = validParenthesis.isValid(parenthesis)

        // Assert
        Truth.assertThat(result).isEqualTo(false)

    }

    @Test
    fun isValid_correctBrackets() {

        // Assign
        val validParenthesis = ValidParenthesis()
        val parenthesis = "()[]{}"
        "([)]"

        // Act
        val result = validParenthesis.isValid(parenthesis)

        // Assert
        Truth.assertThat(result).isEqualTo(true)

    }

    @Test
    fun isValid_inCorrectClosingBrackets() {

        // Assign
        val validParenthesis = ValidParenthesis()
        val parenthesis = "([)]"

        // Act
        val result = validParenthesis.isValid(parenthesis)

        // Assert
        Truth.assertThat(result).isEqualTo(false)

    }
}