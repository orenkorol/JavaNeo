package chapter9;

import helper.CustomActions;

public class C9E3 {

    public static void main(String[] args) {

        int N = CustomActions.getRandomValue(5, 10);
        int factorial = 1;

        CustomActions.printValue(N);

        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial result: " + factorial);
    }
}
