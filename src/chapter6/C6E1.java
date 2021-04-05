package chapter6;

import helper.CustomActions;

public class C6E1 {

    public static void main(String[] args) {

        int min = -99;
        int max = 99;
        int val;

        val = CustomActions.getRandomValue(min, max);
        CustomActions.printValue(val);

        if (val < 0) {
            System.out.println("Negative");
        } else {
            if (val == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Positive");
            }
        }
    }
}
