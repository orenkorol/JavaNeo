package chapter9;

import helper.CustomActions;

public class C9E4 {

    public static void main(String[] args) {

        int N = CustomActions.getRandomValue(1, 100);
        int sum = 0;

        CustomActions.printValue(N);

        System.out.printf("Values to sum: ");
        for (int i = 3; i <= N; i += 3) {
            System.out.printf("%d, ", i);
            sum += i;
        }
        System.out.println("\nSum of divided values: " + sum);
    }
}
