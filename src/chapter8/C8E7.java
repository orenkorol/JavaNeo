package chapter8;

import helper.CustomActions;

public class C8E7 {

    public static void main(String[] args) {

        int inputValue = 1;
        int totalNumbers = 0;
        int maxValue;
        int minValue;
        int maxRunTimes = CustomActions.getRandomValue(20, 30);

        inputValue = CustomActions.getRandomValue(-1, 100);
        minValue = maxValue = inputValue;

        while (inputValue > 0) {
            if (inputValue > 0) {
                totalNumbers++;

                if (inputValue > maxValue) {
                    maxValue = inputValue;
                }
                if (inputValue < minValue) {
                    minValue = inputValue;
                }
            }
            inputValue = CustomActions.getRandomValue(-1, 100);

            if (totalNumbers > maxRunTimes) {
                inputValue = 0;
            }
        }


        System.out.println("Total input numbers " + totalNumbers);
        if (totalNumbers > 0) {
            System.out.println("Max Value = " + maxValue);
            System.out.println("Min Value = " + minValue);
        }
    }
}
