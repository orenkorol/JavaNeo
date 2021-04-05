package chapter8;

import helper.CustomActions;

public class C8E1 {

    public static void main(String[] args) {

        int minRand = 1;
        int maxRand = 100;
        int i = 1;
        int top = CustomActions.getRandomValue(minRand, maxRand);

        CustomActions.printValue(top);

        System.out.printf("%d", i);
        while (i < top) {
            i++;
            System.out.printf(", %d", i);
        }
    }
}
