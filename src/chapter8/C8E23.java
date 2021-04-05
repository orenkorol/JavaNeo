package chapter8;

import helper.CustomActions;

public class C8E23 {

    public static void main(String[] args) {

        int value1 = CustomActions.getRandomValue(10, 500);
        int divider = 1;

        CustomActions.printValue(value1);
        System.out.printf("Possible dividers: %d", divider);

        while (value1 >= divider) {
            divider++;
            if (value1 % divider == 0) {
                System.out.printf(", %d", divider);
            }
        }

    }
}
