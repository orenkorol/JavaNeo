package chapter8;

import helper.CustomActions;

public class C8E18 {

    public static void main(String[] args) {

        int inputValue1 = CustomActions.getRandomValue(1, 250);
        int inputValue2 = CustomActions.getRandomValue(2, 11);
        int divisionResult = 0;
        int divisionRemainder = 0;
        int valueToDivide = inputValue1;
        int divider = inputValue2;

        CustomActions.printValue(inputValue1, inputValue2);

        while (valueToDivide >= divider) {
            valueToDivide = valueToDivide - divider;
            divisionResult++;
        }

        if (valueToDivide > 0) {
            divisionRemainder = valueToDivide;
        }

        System.out.println("Result of division by subtract: " + divisionResult + " Remainder: " + divisionRemainder);

    }
}
