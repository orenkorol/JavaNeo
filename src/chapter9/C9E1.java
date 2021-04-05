package chapter9;

public class C9E1 {

    public static void main(String[] args) {

        int b = 32;
        int c = -b;

        for (int a = b; a > 1; a += c) {
            c = c / 2;
            b -= 8;
            System.out.println("b" + b);
        }

        System.out.println("value of b: " + b);
    }
}
