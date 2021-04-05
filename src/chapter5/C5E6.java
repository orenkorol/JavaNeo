package chapter5;

import helper.CustomActions;

public class C5E6 {

    public static void main(String[] args) {
        int min = 4000;
        int max = 6000;
        double salary;

        salary = CustomActions.getRandomValue(min, max);
        System.out.printf("Current salary: %.2f\n", salary);

        if (salary + salary * 0.1 > 6000) {
            salary = salary + salary * 0.05;
            System.out.println("Got 5% raise");
        } else {
            salary = salary + salary * 0.1;
            System.out.println("Got 10% raise");
        }

        System.out.printf("Salary after raise: %.2f", salary);
    }
}
