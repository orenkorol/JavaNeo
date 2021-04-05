package chapter8;

import helper.CustomActions;

public class C8E5 {

    public static void main(String[] args) {

        int inputValue = 0;
        int totalSum = 0;
        int totalNumbers = 0;
        int maxRunTimes = CustomActions.getRandomValue(5, 30);

        while (inputValue != -99) {
            inputValue = CustomActions.getRandomValue(-99, 100);
            if (inputValue > 0) {
                totalNumbers++;
                totalSum = totalSum + inputValue;
                if(maxRunTimes == totalNumbers){
                    inputValue = -99;
                }
            }
        }

        System.out.println("Total numbers in sum: " + totalNumbers);
        System.out.println("Sum: " + totalSum);
    }
}
