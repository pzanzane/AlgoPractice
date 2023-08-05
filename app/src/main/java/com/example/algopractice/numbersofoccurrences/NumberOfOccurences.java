package com.example.algopractice.numbersofoccurrences;

import java.util.ArrayList;
import java.util.List;

public class NumberOfOccurences {

    public static void main(String z[]) {
        printNumberOfOccurences("pankaj");
    }

    static void printNumberOfOccurences(String strValue) {
        List<Integer> list = new ArrayList<>();
        for (int indexChar = 0; indexChar < strValue.length(); indexChar ++) {
            list.add((int)strValue.charAt(indexChar));
        }


        for (int indexChar = 0; indexChar < list.size(); indexChar ++) {

            int asscii = list.get(indexChar);
            int occurence = 1;

            for (int indexIn = indexChar + 1; indexIn < list.size(); indexIn ++) {

                if ( asscii == list.get(indexIn)) {
                    ++ occurence;
                    list.remove(indexIn);
                }
            }

            System.out.println("Char: " + ((char)asscii) + " occured: " + occurence);
        }
    }
}
