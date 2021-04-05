package chapter9;

import helper.CustomActions;

public class C9E9 {

    public static void main(String[] args) {

//        int x1 = CustomActions.getRandomValue(1, 20);
//        int x2 = CustomActions.getRandomValue(20, 50);
//        int k = CustomActions.getRandomValue(2,7);
        int x1 = 5;
        int x2 = 13;
        int k = 2;

        System.out.println("x1: " + x1 + " x2: " + x2 + " k: " + k);

        for (int i = x1; i <= x2; i += k) {
            System.out.printf("Y=%d**2 + %d = %d\n", i, k, (i * i + 5));
        }
    }
}
