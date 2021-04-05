package chapter9;

import helper.CustomActions;

public class C9E7 {

    public static void main(String[] args) {

        int N = CustomActions.getRandomValue(1, 100);

        CustomActions.printValue(N);

        for (int i = 1; i < N; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        for (int i = 1; i < N; i++) {
            System.out.printf("%d ", i * 2);
        }
    }
}
