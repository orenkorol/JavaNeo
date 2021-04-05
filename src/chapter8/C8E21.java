package chapter8;

import helper.CustomActions;

public class C8E21 {

    public static void main(String[] args) {

        int index = CustomActions.getRandomValue(1, 50);
        int fibonacciResult = 1;
        int fibonacciPrev = 1;

        for (int i = 0; i < index - 2; i++) {
            fibonacciResult = fibonacciPrev + fibonacciResult;
            fibonacciPrev = fibonacciResult - fibonacciPrev;
        }

        System.out.println("Fibonacci at index position: " + index + " is:" + fibonacciResult);
    }
}
