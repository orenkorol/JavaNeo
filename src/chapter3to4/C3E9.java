package chapter3to4;

import helper.CustomActions;

public class C3E9 {

    public static void main(String[] args) {

        int min = 10;
        int max = 99;
        int num;

        num = CustomActions.getRandomValue(min, max);
        CustomActions.printValue(num);

        System.out.println("Digit switch: " + (num % 10) + "" + ((num / 10) % 10));

    }
}
