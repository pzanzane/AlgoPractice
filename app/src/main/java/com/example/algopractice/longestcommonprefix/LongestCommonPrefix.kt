package com.example.algopractice.longestcommonprefix

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/
class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        var strLength = 0
        strs.map {
            if (strLength < it.length) {
                strLength = it.length
            }
        }

        var startIndex = 1
        while (startIndex <= strLength) {

            if (!matchPrefix(startIndex, strs)) {
                break;
            }
            startIndex ++
        }

        if (startIndex == 1) {
            return ""
        }
        return strs[0].substring(0, --startIndex)
    }

    private fun matchPrefix(position: Int, array: Array<String>): Boolean {

        val startIndex = 0
        val endIndex = position

        var isMatched = true
        if (endIndex > array[0].length) {
            return false
        }

        val str = array[0].substring(startIndex, endIndex)
        array.forEach { item ->

            if (endIndex > item.length) {
                isMatched = false
                return@forEach
            }

            if (!item.substring(startIndex, endIndex).equals(str, ignoreCase = true)) {
                isMatched = false
                return@forEach
            }
        }
        return isMatched
    }
}