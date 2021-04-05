package chapter8;

import helper.CustomActions;

public class C8E15 {

    public static void main(String[] args) {

        int reverseValue = 0;
        int multiplier;
        int minRand = 1;
        int maxRand = 50000;
        int inputValue = 123454321;// CustomActions.getRandomValue(minRand, maxRand);
        int totalDigits = 0;
        int backValue = inputValue;
        CustomActions.printValue(inputValue);

        while (inputValue > 0) {
            totalDigits++;
            inputValue /= 10;
        }
        multiplier = (int) Math.pow(10, totalDigits - 1);
        inputValue = backValue;
        while (inputValue > 0) {
            reverseValue = reverseValue + (inputValue % 10 * multiplier);
            multiplier /= 10;
            inputValue /= 10;
        }
        inputValue = backValue;

        if(reverseValue == inputValue){
            System.out.println("This number is Polindrom");
        }else{
            System.out.println("This number is Not a Polindrom");
        }
    }
}
