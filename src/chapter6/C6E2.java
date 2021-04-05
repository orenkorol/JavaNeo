package chapter6;

import helper.CustomActions;

public class C6E2 {

    public static void main(String[] args) {

        int min = 1;
        int max = 9999;
        int val1;
        int val2;
        int val3;

        val1 = CustomActions.getRandomValue(min, max);
        val2 = CustomActions.getRandomValue(min, max);
        val3 = CustomActions.getRandomValue(min, max);
        System.out.println("val1: " + val1);
        System.out.println("val2: " + val2);
        System.out.println("val3: " + val3);

        if (val2 > val1) {
            if (val3 > val2) {
                System.out.println("Increasing...");
            }
        }

    }

}
