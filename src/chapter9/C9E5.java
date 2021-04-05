package chapter9;

import helper.CustomActions;

public class C9E5 {

    public static void main(String[] args) {

        int value;
        int sum = 0;

        for (int i = 1; i < 100; i++) {
            value = CustomActions.getRandomValue(1, 100);
            if (i % 3 == 0) {
                CustomActions.printBoldNumInLine(value);
                sum += value;
            } else {
                CustomActions.printNormalNumInLine(value);
            }
        }

        CustomActions.printNormalStringInLine("\nSum of every third value: " + sum);
    }
}
