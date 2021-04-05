package chapter6;

import helper.CustomActions;

public class C6E5 {

    public static void main(String[] args) {

        int min = 100000;
        int max = 100000;
        final int step1 = 23000;
        final int step2 = 46000;
        final int step3 = 120000;
        final int step4 = 220000;
        final double taxRate1 = 0.1;
        final double taxRate2 = 0.2;
        final double taxRate3 = 0.3;
        final double taxRate4 = 0.4;
        final double taxRate5 = 0.5;
        double income;
        double rate;
        double tax = 0;

        income = CustomActions.getRandomValue(min, max);
        System.out.println("income: " + income);

        if (income <= step1) {
            rate = taxRate1;
        } else {
            if (income <= step2) {
                rate = taxRate2;
                tax = step1 * taxRate1;
                income = income - step1;
            } else {
                if (income <= step3) {
                    rate = taxRate3;
                    tax = step1 * taxRate1 + (step2 - step1) * taxRate2;
                    income = income - step2;
                } else {
                    if (income <= step4) {
                        rate = taxRate4;
                        tax = step1 * taxRate1 + (step2 - step1) * taxRate2 + (step3 - step2) * taxRate3;
                        income = income - step3;
                    } else {
                        rate = taxRate5;
                        tax = step1 * taxRate1 + (step2 - step1) * taxRate2 + (step3 - step2) * taxRate3 + (step4 - step3) * taxRate4;
                        income = income - step4;
                    }
                }
            }
        }

        tax = tax + (income * rate);
        System.out.printf("You must pay: %.3f for taxes, at %.0f%% tax rate", tax, rate * 100);
    }

}
