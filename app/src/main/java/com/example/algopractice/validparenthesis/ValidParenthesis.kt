package com.example.algopractice.validparenthesis

import java.util.PriorityQueue
import java.util.Queue
import java.util.Stack

/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.



Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

 */
class ValidParenthesis {

    fun isValid(s: String): Boolean {

        val bracketOpen = '('
        val curlyOpen = '{'
        val squareOpen = '['

        val stack = Stack<Char>()
        var isValid = true

        s.forEach { ch ->

            if (!isValid) {
                return@forEach
            }

            when (ch) {
                '(', '{', '[' -> {
                    stack.add(ch)
                }
                ')' -> {
                    stack.pop()?.let {

                        if (it != bracketOpen) {
                            isValid = false
                        }
                    } ?: kotlin.run {
                        isValid = false
                    }

                }
                '}' -> {
                    stack.pop()?.let {

                        if (it != curlyOpen) {
                            isValid = false
                        }
                    } ?: kotlin.run {
                        isValid = false
                    }
                }
                ']' -> {

                    stack.pop()?.let {

                        if (it != squareOpen) {
                            isValid = false
                        }
                    } ?: kotlin.run {
                        isValid = false
                    }
                }
                else -> { }
            }
        }

        return isValid
    }
}