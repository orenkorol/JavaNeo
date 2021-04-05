package chapter8;

import helper.CustomActions;

public class C8E2 {

    public static void main(String[] args) {

        int minRand = 1;
        int maxRand = 100;
        int value1 = CustomActions.getRandomValue(minRand, maxRand);
        int value2 = CustomActions.getRandomValue(minRand, maxRand);

        CustomActions.printValue(value1, value2);

        if (value1 > value2) {
            int temp = value1;
            value1 = value2;
            value2 = temp;
        }

        System.out.printf("%d", value1);
        while (value1 < value2) {
            value1++;
            System.out.printf(", %d", value1);
        }
    }
}
