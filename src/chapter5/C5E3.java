package chapter5;

import helper.CustomActions;

public class C5E3 {

    public static void main(String[] args) {

        int min = 1;
        int max = 99;
        int num1;

        num1 = CustomActions.getRandomValue(min, max);
        CustomActions.printValue(num1);

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is Even");
        } else {
            System.out.println(num1 + " is Odd");
        }

    }
}
