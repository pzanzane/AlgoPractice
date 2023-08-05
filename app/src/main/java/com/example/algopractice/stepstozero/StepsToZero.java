package com.example.algopractice.stepstozero;

public class StepsToZero {

    public static void main(String z[]) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfStepsRighShift(14));

    }

    public static int numberOfStepsRighShift(int num) {

        if (num == 0) {
            return 0;
        }

        int steps = 0;
        while (num > 0) {
            num = num >> 1;
            steps ++;
        }
        return steps;
    }

    public static int numberOfSteps(int num) {

        if (num == 0) {
            return 0;
        }

        int steps = 0;
        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps ++;
        }
        return steps;
    }
}
