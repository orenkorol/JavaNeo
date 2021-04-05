package chapter8;

import helper.CustomActions;

public class C8E22 {

    public static void main(String[] args) {

        int inputValue1 = CustomActions.getRandomValue(2, 50000);
        int fibonacciPrev = 1;
        int fibonacciResult = 1;

        System.out.println("Entered value: " + inputValue1);
        System.out.printf("Fibonacci series till Closest bigger value: %d, %d", fibonacciPrev, fibonacciResult);

        while (fibonacciResult < inputValue1) {
            fibonacciResult = fibonacciPrev + fibonacciResult;
            fibonacciPrev = fibonacciResult - fibonacciPrev;
            System.out.printf(", %d", fibonacciResult);
        }

    }
}
