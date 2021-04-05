package chapter8;

import helper.CustomActions;

public class C8E25 {

    public static void main(String[] args) {

        int value1 = CustomActions.getRandomValue(10, 500);
        int value2 = CustomActions.getRandomValue(10, 500);
        int printCounter = 0;
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
            //just for nicer display
            printCounter++;
            if (printCounter > 35) {
                System.out.println();
                printCounter = 0;
            }
        }

    }
}
