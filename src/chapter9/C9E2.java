package chapter9;

import helper.CustomActions;

public class C9E2 {

    public static void main(String[] args) {

        int value1 = CustomActions.getRandomValue(1, 100);
        int value2 = CustomActions.getRandomValue(1, 100);

        CustomActions.printValue(value1, value2);

        if (value1 > value2) {
            System.out.println("Value 1 greater than value 2");
        } else {
            System.out.printf("%d", value1);
            for (int i = value1 + 1; i <= value2; i++) {
                System.out.printf(" ,%d", i);
            }
        }

    }
}
