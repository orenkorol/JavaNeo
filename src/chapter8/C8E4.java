package chapter8;

import helper.CustomActions;

public class C8E4 {

    public static void main(String[] args) {

        int minRand = 1;
        int maxRand = 100;
        int den = CustomActions.getRandomValue(1, 10);
        int max = CustomActions.getRandomValue(minRand, maxRand);
        int i = 0;

        System.out.println("Selected den: " + den + " Selected max: " + max);

        System.out.printf("%d", i);
        while (i < max) {
            i++;
            if (i % den == 0) {
                System.out.printf(", %d", i);
            }
        }
    }
}
