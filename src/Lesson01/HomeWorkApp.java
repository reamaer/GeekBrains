package Lesson01;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("******************** Task 2 ********************");
        System.out.println();

        printThreeWords();

        System.out.println();
        System.out.println("******************** Task 3 ********************");
        System.out.println();

        checkSumSign();

        System.out.println();
        System.out.println("******************** Task 4 ********************");
        System.out.println();

        printColor();

        System.out.println();
        System.out.println("******************** Task 5 ********************");
        System.out.println();

        compareNumbers();
    }

    /* Task 2 */

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /* Task 3*/

    public static void checkSumSign() {
        int  a = 22;
        int b = -60;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Task 4

    public static String printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        } else  {
            System.out.println("Зелёный");
        }
        return null;
    }

    // Task 5

    public static void compareNumbers() {
        int a = -140;
        int b = -100;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println ("a < b");
        }
    }
}

