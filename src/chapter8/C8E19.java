package chapter8;

import helper.CustomActions;

public class C8E19 {

    public static void main(String[] args) {

        int inputValue1 = CustomActions.getRandomValue(1, 11);
        int factorialResult = 1;
        int factorialRuns = inputValue1;

        CustomActions.printValue(inputValue1);

        while (factorialRuns > 0) {
            factorialResult = factorialResult * factorialRuns;
            factorialRuns--;
        }

        System.out.printf("Result of factorial by multiplier: %,8d%n", factorialResult);

    }
}
