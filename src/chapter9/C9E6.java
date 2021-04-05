package chapter9;

import helper.CustomActions;

public class C9E6 {

    public static void main(String[] args) {

        int N = CustomActions.getRandomValue(5, 11);
        int sum = 0;

        CustomActions.printValue(N);

        for (int i = 0; i <= N; i++) {
            sum += Math.pow(2, i);
        }

        System.out.println("Sum for power of 2: " + sum);
    }
}
