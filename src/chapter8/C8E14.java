package chapter8;

import helper.CustomActions;

public class C8E14 {

    public static void main(String[] args) {

        int reverseValue = 0;
        int multiplier;
        boolean rightZero = false;
        int minRand = 1;
        int maxRand = 50000;
        int inputValue = CustomActions.getRandomValue(minRand, maxRand);
        int totalDigits = 0;
        int backValue = inputValue;
        CustomActions.printValue(inputValue);

        while (backValue > 0) {
            totalDigits++;
            backValue /= 10;
        }
        multiplier = (int) Math.pow(10, totalDigits - 1);


        while (inputValue > 0) {
            reverseValue = reverseValue + (inputValue % 10 * multiplier);
            if (reverseValue == 0) {
                rightZero = true;
            }
            multiplier /= 10;
            inputValue /= 10;
        }

        if (rightZero) {
            System.out.println("Reverse value: 0" + reverseValue);
        } else {
            System.out.println("Reverse value: " + reverseValue);
        }
    }
}
