package com.example.algopractice.twosums

class TwoSums {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int, Int>()
        val array = IntArray(2)
        nums.forEachIndexed { index, item ->

            val secondItem =  target - item;
            if (map.containsKey(secondItem)) {
                array[0] =  map[secondItem]!!
                array[1] = index
                return@twoSum array
            }
            map[item] = index
        }
        return array
    }
}