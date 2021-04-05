package chapter8;

import helper.CustomActions;

public class C8E10 {

    public static void main(String[] args) {

        int minRand = 1;
        int maxRand = 50000;
        int inputValue = CustomActions.getRandomValue(minRand,maxRand);
        CustomActions.printValue(inputValue);

        while (inputValue>10){
            inputValue/=10;
        }

        System.out.println("Left most digit: " + inputValue);


    }
}
