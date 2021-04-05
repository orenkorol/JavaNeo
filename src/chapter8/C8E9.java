package chapter8;

import helper.CustomActions;

public class C8E9 {

    public static void main(String[] args) {

        int inputValue;
        int maxPosition;
        int maxValue;

        int maxRunTimes = 100;
        int i = 1;
        int minRand = 1;
        int maxRand = 500;

        inputValue = CustomActions.getRandomValue(minRand, maxRand);
        maxValue = inputValue;
        maxPosition = i;

        while (i <= maxRunTimes) {
            inputValue = CustomActions.getRandomValue(minRand, maxRand);
            i++;
            if (inputValue > maxValue) {
                maxValue = inputValue;
                maxPosition = i;
            }
        }

        System.out.println("Max number is: " + maxValue + " at position: " + maxPosition);
    }
}
