package chapter5;

import helper.CustomActions;

public class C5E1 {

    public static void main(String[] args) {

        int min = 1;
        int max = 99;
        int num1;
        int num2;

        num1 = CustomActions.getRandomValue(min, max);
        num2 = CustomActions.getRandomValue(min, max);
        CustomActions.printValue(num1, num2);

        if (num2 > num1) {
            System.out.println("Growing...");
        }

    }
}
