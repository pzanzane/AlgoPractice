package com.example.algopractice.twosums;

import java.util.HashMap;

public class TwoSumsjava {

    public int[] twoSum(int[] nums, int target) {

        // [-2,-5,-1,4,6] target = -1
        // [2,7,11,5] target = 9

        int index = 0;
        HashMap<Integer, Integer> map = new HashMap();
        int result[] = new int[2];

        for(int number: nums) {
            int difference = target - number;
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = index;
                return result;
            }
            map.put(number, index);
            index ++;
        }
        return new int[] {-1,-1};
    }
}
