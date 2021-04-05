package chapter10;

import helper.CustomActions;

public class C10E3 {

    public static void main(String[] args) {

        //possible error range
//        int min = -6;
//        int max = 41;

        //valid range
        int min = -5;
        int max = 40;

        int value;
        int i = 0;
        boolean valid = true;

        while (i < 365) {
            value = CustomActions.getRandomValue(min, max);
            System.out.println(i + 1 + ") " + value);
            if (value > 40 || value < -5) {
                valid = false;
                break;
            }
            i++;
        }

        if (valid) {
            System.out.println("Valid data");
        } else {
            System.out.println("Error in data!");
        }
    }
}
