package chapter6;

import helper.CustomActions;

public class C6E3 {

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

        if (val1 > val2) {
            if (val1 > val3) {
                System.out.println("Max is val1");
            } else {
                System.out.println("Max is val3");
            }
        } else {
            if (val2 > val3) {
                System.out.println("Max is val2");
            } else {
                System.out.println("Max is val3");
            }
        }

        //other way
//        System.out.println("Max method " + Math.max(val1, Math.max(val2, val3)));

    }

}
