package com.example.algopractice.longestsubstring

import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
internal class LongestSubstringTest {

    @Test
    fun isUniqueCharacters_repeatingChars_returnFalse() {

        // Assign
        val longestSub = LongestSubstring()

        // Act
        val result = longestSub.isUniqueCharacters("abca".toCharArray())

        // Assert
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun isUniqueCharacters_nonRepeatingChars_returnTrue() {

        // Assign
        val longestSub = LongestSubstring()

        // Act
        val result = longestSub.isUniqueCharacters("abc".toCharArray())

        // Assert
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun lengthOfLongestSubstring_forString_abcabcbb_return3() {

        // Assign
        val longestSub = LongestSubstring()

        // Act
        val result = longestSub.lengthOfLongestSubstring("abcabcbb")

        // Assert
        Truth.assertThat(result).isEqualTo(3)
    }

    @Test
    fun lengthOfLongestSubstring_forString_bbbbb_return1() {

        // Assign
        val longestSub = LongestSubstring()

        // Act
        val result = longestSub.lengthOfLongestSubstring("bbbbb")

        // Assert
        Truth.assertThat(result).isEqualTo(1)
    }

    @Test
    fun lengthOfLongestSubstring_forString_pwwkew_return3() {

        // Assign
        val longestSub = LongestSubstring()

        // Act
        val result = longestSub.lengthOfLongestSubstring("pwwkew")

        // Assert
        Truth.assertThat(result).isEqualTo(3)
    }
}