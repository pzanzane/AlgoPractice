package com.example.algopractice.longestcommonprefix

import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
internal class LongestCommonPrefixTest {

    @Test
    fun longestCommonPrefix_positive_returnPrefix() {
        // Assign
        val strs = arrayOf("flower","flow","flight")
        val expected = "fl"

        // Act
        val longestPrefix = LongestCommonPrefix()
        val prefix = longestPrefix.longestCommonPrefix(strs)

        // Assert
        Truth.assertThat(prefix).isEqualTo(expected)


    }

    @Test
    fun longestCommonPrefix_negative_returnEmpty() {
        // Assign
        val strs = arrayOf("dog","cat","flight")
        val expected = ""

        // Act
        val longestPrefix = LongestCommonPrefix()
        val prefix = longestPrefix.longestCommonPrefix(strs)

        // Assert
        Truth.assertThat(prefix).isEqualTo(expected)
    }

    @Test
    fun longestCommonPrefix_Empty_returnEmpty() {
        // Assign
        val strs = arrayOf<String>()
        val expected = ""

        // Act
        val longestPrefix = LongestCommonPrefix()
        val prefix = longestPrefix.longestCommonPrefix(strs)

        // Assert
        Truth.assertThat(prefix).isEqualTo(expected)
    }

    @Test
    fun longestCommonPrefix_EmptyString_returnEmpty() {
        // Assign
        val strs = arrayOf("")
        val expected = ""

        // Act
        val longestPrefix = LongestCommonPrefix()
        val prefix = longestPrefix.longestCommonPrefix(strs)

        // Assert
        Truth.assertThat(prefix).isEqualTo(expected)
    }

    @Test
    fun longestCommonPrefix_differentStringLength_shouldReturnPrefix() {
        // Assign
        val strs = arrayOf("flower","flow", "flo","floor","flogogogogo")
        val expected = "flo"

        // Act
        val longestPrefix = LongestCommonPrefix()
        val prefix = longestPrefix.longestCommonPrefix(strs)

        // Assert
        Truth.assertThat(prefix).isEqualTo(expected)
    }

    @Test
    fun longestCommonPrefix_singleItemArray_shouldReturnPrefix() {
        // Assign
        val strs = arrayOf("a")
        val expected = "a"

        // Act
        val longestPrefix = LongestCommonPrefix()
        val prefix = longestPrefix.longestCommonPrefix(strs)

        // Assert
        Truth.assertThat(prefix).isEqualTo(expected)
    }

    @Test
    fun longestCommonPrefix_oneEmptyErray_shouldReturnPrefix() {
        // Assign
        val strs = arrayOf("","a")
        val expected = ""

        // Act
        val longestPrefix = LongestCommonPrefix()
        val prefix = longestPrefix.longestCommonPrefix(strs)

        // Assert
        Truth.assertThat(prefix).isEqualTo(expected)
    }

    @Test
    fun longestCommonPrefix_sameArray_shouldReturnPrefix() {
        // Assign
        val strs = arrayOf("flower","flower","flower","flower")
        val expected = "flower"

        // Act
        val longestPrefix = LongestCommonPrefix()
        val prefix = longestPrefix.longestCommonPrefix(strs)

        // Assert
        Truth.assertThat(prefix).isEqualTo(expected)
    }
}