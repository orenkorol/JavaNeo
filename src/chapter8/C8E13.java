package chapter8;

import helper.CustomActions;

public class C8E13 {

    public static void main(String[] args) {

        int digit;
        int minRand = 1;
        int maxRand = 50000;
        int inputValue = CustomActions.getRandomValue(minRand, maxRand);
        int dig = CustomActions.getRandomValue(1, 9);
        int digAppeared = 0;
        CustomActions.printValue(inputValue);

        while (inputValue > 0) {
            digit = inputValue % 10;
            inputValue /= 10;
            if (dig == digit) {
                digAppeared++;

            }
        }

        System.out.println("Selected digit for check: " + dig);
        System.out.println("Total time selected digit appear in selected value: " + digAppeared);

    }
}
