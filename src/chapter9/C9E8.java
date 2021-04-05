package chapter9;

import helper.CustomActions;

public class C9E8 {

    public static void main(String[] args) {

        int N = CustomActions.getRandomValue(1, 100);
        int sum = 0;

        CustomActions.printValue(N);

        for (int i = 4; i < N; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
                sum += i;
            } else if (i % 7 == 0) {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("Sum of divided by 4 and 7: " + sum);

    }
}
