package com.example.algopractice.findduplicate;

import java.util.HashSet;

public class FindDuplicateNumber {

    public int solution(int []array) {

        if (array == null) {
            return 0;
        }

        if (array.length == 0) {
            return 0;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        int index = 0;
        for (int item: array) {

            if (!hashSet.add(item)) {
                return index + 1;
            }
            index++;
        }

        return 0;
    }
}
