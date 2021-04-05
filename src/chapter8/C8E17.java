package chapter8;

import helper.CustomActions;

public class C8E17 {

    public static void main(String[] args) {

        int inputValue1 = CustomActions.getRandomValue(1, 250);
        int inputValue2 = CustomActions.getRandomValue(2, 11);
        int multiplyTimes;
        int valueToMultiply;
        int multiplyResult;

        CustomActions.printValue(inputValue1, inputValue2);


        if (inputValue1 > inputValue2) {
            multiplyTimes = inputValue2;
            valueToMultiply = inputValue1;
        } else {
            multiplyTimes = inputValue1;
            valueToMultiply = inputValue2;
        }

        multiplyResult = valueToMultiply;

        while (multiplyTimes > 1) {
            multiplyResult = multiplyResult * valueToMultiply;
            multiplyTimes--;
        }
        System.out.printf("Result of Power by multiplier: %,8d%n", multiplyResult);
    }
}
