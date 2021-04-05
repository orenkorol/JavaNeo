package chapter5;

import helper.CustomActions;

public class C5E2 {

    public static void main(String[] args) {

        int min = 1;
        int max = 99;
        int num1;
        int num2;

        num1 = CustomActions.getRandomValue(min, max);
        num2 = CustomActions.getRandomValue(min, max);
        CustomActions.printValue(num1, num2);

        if (num1 > num2) {
            System.out.println(num1 + " is MAX");
        } else {
            System.out.println(num2 + " is MAX");
        }
    }
}
