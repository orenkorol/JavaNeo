package helper;

public class CustomActions {

    /**
     * This method will return a random value in entered range
     *
     * @param min Minimum possible value to return
     * @param max Maximum possible value to return
     * @return Random value
     */
    public static int getRandomValue(int min, int max) {
        int randomValue;
        randomValue = (int) (min + (Math.random() * (max - min + 1)));
        return randomValue;
    }


    public static void printValue(int value1, int value2) {
        System.out.println("Value 1: " + value1 + " Value 2: " + value2);
    }

    public static void printValue(int value) {
        System.out.println("Value: " + value);
    }

    /**
     * Print int value in bold font
     *
     * @param value integer
     */
    public static void printBoldNumInLine(int value) {
        System.out.print("\u001B[1m" + value + ", ");
    }

    /**
     * Print int value in normal font
     *
     * @param value integer
     */
    public static void printNormalNumInLine(int value) {
        System.out.print("\u001B[0m" + value + ", ");
    }

    /**
     * Print string in normal format
     *
     * @param s string
     */
    public static void printNormalStringInLine(String s) {
        System.out.print("\u001B[0m" + s);
    }
}
