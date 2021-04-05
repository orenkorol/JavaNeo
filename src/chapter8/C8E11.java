package chapter8;

import helper.CustomActions;

public class C8E11 {

    public static void main(String[] args) {

        int totalDigits = 0;
        int minRand = 1;
        int maxRand = 50000;
        int inputValue = CustomActions.getRandomValue(minRand, maxRand);
        CustomActions.printValue(inputValue);

        while (inputValue > 0) {
            inputValue /= 10;
            totalDigits++;
        }

        System.out.println("Total digits: " + totalDigits);

    }
}
