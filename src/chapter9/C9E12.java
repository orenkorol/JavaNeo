package chapter9;

import helper.CustomActions;

public class C9E12 {

    public static void main(String[] args) {

        int sum = 0;
        int value;

        for (int i = 0; i < 100; i++) {
            value = CustomActions.getRandomValue(1, 100);

            if (value % 2 == 0) {
                sum += value;
                CustomActions.printBoldNumInLine(value);
            } else {
                CustomActions.printNormalNumInLine(value);
            }
        }

        CustomActions.printNormalStringInLine("\nTotal sum of even values: " + sum);
    }
}
