package chapter8;

import helper.CustomActions;

public class C8E24 {

    public static void main(String[] args) {

        int value1 = CustomActions.getRandomValue(10, 500);
        int value2 = CustomActions.getRandomValue(10, 500);
        int divider = 1;
        int maxCommonDivider = 1;

        CustomActions.printValue(value1, value2);

        while (Math.max(value1, value2) >= divider) {
            divider++;
            if (value1 % divider == 0 && value2 % divider == 0) {
                maxCommonDivider = divider;
            }
        }

        System.out.println("Max common divider is: " + maxCommonDivider);
    }
}
