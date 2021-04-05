package chapter8;

import helper.CustomActions;

public class C8E6 {

    public static void main(String[] args) {

        int inputValue = 1;
        int totalSum = 0;
        int totalNumbers = 0;
        int maxRunTimes = CustomActions.getRandomValue(5, 30);

        while (inputValue != 0) {
            inputValue = CustomActions.getRandomValue(0, 100);
            if (inputValue > 0) {
                totalNumbers++;
                totalSum = totalSum + inputValue;
                if (maxRunTimes == totalNumbers) {
                    inputValue = 0;
                }
            }
        }

        System.out.println("Total numbers in sum: " + totalNumbers);
        if (totalNumbers > 0) {
            System.out.println("Sum: " + totalSum);
            System.out.println("Average = " + (totalSum / totalNumbers));
        }
    }
}
