package chapter10;

import helper.CustomActions;

public class C10E5 {

    public static void main(String[] args) {

        int min = 1;
        int max = 3000;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        int i = 0;
        int value;

        while (i < 1000) {
            value = CustomActions.getRandomValue(min, max);

            if (value < 1000) {
                sum1 += value;
            }
            if (value < 2000) {
                sum2 += value;
            } else {
                sum3 += value;
            }
            i++;
        }
        System.out.println("Sum1: " + sum1 + "\nSum2: " + sum2 + "\n" +
                "Sum3: " + sum3);
    }
}
