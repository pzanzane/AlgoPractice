package com.example.algopractice.missingsmallestpositive

class MissingSmallestPossibleInteger {

    fun solutions(A: IntArray): Int {

        var pointer = 0
        A.sort()

        if (A[A.size - 1] <= 0) {
            return 1
        }
        val traverse = IntArray(A[A.size - 1] + 1)
        while (pointer < A.size) {

            val integer = A[pointer]
            if (integer <= 0) {
                pointer ++
            }

            traverse[integer] = 1
            pointer ++
        }

        var traversePointer = 1
        while (traversePointer < traverse.size) {

            if (traverse[traversePointer] == 0) {
                return traversePointer
            }
            traversePointer ++
        }
        return traversePointer
    }
}