package chapter8;

import helper.CustomActions;

public class C8E12 {

    public static void main(String[] args) {

        int digitsSum = 0;
        int sumDigit;
        int minRand = 1;
        int maxRand = 50000;
        int inputValue = CustomActions.getRandomValue(minRand, maxRand);
        CustomActions.printValue(inputValue);

        while (inputValue > 0) {
            sumDigit = inputValue % 10;
            inputValue /= 10;
            digitsSum = digitsSum + sumDigit;
        }

        System.out.println("Sum of digits: " + digitsSum);
    }
}
