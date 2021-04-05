package chapter8;

import helper.CustomActions;

public class C8E20 {

    public static void main(String[] args) {

        int valueForRoot = CustomActions.getRandomValue(10, 1000);
        int rootValue = 1;
        int minCloseDistance;
        int maxCloseDistance;
        double rootSquareResult;

        System.out.println("Value for root calculation: " + valueForRoot);

        while (rootValue * rootValue < valueForRoot) {
            rootValue = rootValue + 1;
        }

        minCloseDistance = Math.abs((rootValue - 1) * (rootValue - 1) - valueForRoot);
        maxCloseDistance = Math.abs(rootValue * rootValue - valueForRoot);

        if (minCloseDistance > maxCloseDistance) {
            rootValue--;
        }

        //Xn+1 = (Xn + m/Xn)/2 - used formula
        rootSquareResult = (((double) rootValue + ((double) valueForRoot / (double) rootValue)) / 2);

        System.out.printf("Result of Square root: %.3f\n", rootSquareResult);
    }
}
