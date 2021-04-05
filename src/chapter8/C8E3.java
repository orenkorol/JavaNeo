package chapter8;

import helper.CustomActions;

public class C8E3 {

    public static void main(String[] args) {

        int minRand = 1;
        int maxRand = 100;
        int n = CustomActions.getRandomValue(minRand, maxRand);
        int i = 0;

        CustomActions.printValue(n);

        System.out.printf("%d", i);
        while (i < n - 1) {
            i += 2;
            if (i % 2 == 0) {
                System.out.printf(", %d", i);
            }
        }
    }
}
