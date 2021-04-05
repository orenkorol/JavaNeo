package chapter7;

import helper.CustomActions;

public class C7E1 {

    public static void main(String[] args) {

        int value1 = CustomActions.getRandomValue(1, 200);
        int value2 = CustomActions.getRandomValue(1, 200);
        int value3 = CustomActions.getRandomValue(1, 200);

        System.out.println("value1: " + value1 + " value2: " + value2 + " value3: " + value3);

        if (value1 > value2) {
            if (value2 > value3) {
                System.out.println(value3 + "," + value2 + "," + value1);
            } else if (value1 > value3) {
                System.out.println(value2 + "," + value3 + "," + value1);
            } else {
                System.out.println(value2 + "," + value1 + "," + value3);
            }
        } else {
            if (value1 > value3) {
                System.out.println(value3 + "," + value1 + "," + value2);
            } else if (value2 > value3) {
                System.out.println(value1 + "," + value3 + "," + value2);
            } else {
                System.out.println(value1 + "," + value2 + "," + value3);
            }
        }

    }
}
