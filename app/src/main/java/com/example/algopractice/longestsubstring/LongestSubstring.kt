package com.example.algopractice.longestsubstring

/*

Given a string s, find the length of the longest
substring
without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */
class LongestSubstring {

    fun lengthOfLongestSubstring(s: String): Int {

        val length = s.length
        var firstPointer = 0
        var secondPointer = 0
        var longestSubString = ""

        while (secondPointer < length) {

            val sub = s.substring(IntRange(firstPointer, secondPointer))
            if (isUniqueCharacters(sub.toCharArray())) {
                if (longestSubString.length < sub.length) {
                    longestSubString = sub
                }
            } else {
                firstPointer = secondPointer
            }

            secondPointer++
        }

        return longestSubString.length
    }

    fun isUniqueCharacters(charArray: CharArray): Boolean {
        val set = hashSetOf<Char>()
        charArray.forEach { ch ->
            if (!set.add(ch)) {
                return false
            }
        }
        return true
    }
}