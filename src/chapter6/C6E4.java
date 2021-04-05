package chapter6;

import helper.CustomActions;

public class C6E4 {

    public static void main(String[] args) {

        int min = 1;
        int max = 9999;
        int val1;
        int digits = 0;

        val1 = CustomActions.getRandomValue(min, max);
        CustomActions.printValue(val1);

        while (val1 % 10 > 0) {
            digits++;
            val1 = val1 / 10;
        }
        System.out.println("Number of digits: " + digits);
    }

}
