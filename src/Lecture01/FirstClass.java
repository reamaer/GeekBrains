package Lecture01;

//one-line comment

/*
multi-line comment
 */

/** JavaDoc
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.05.2021
 */

public class FirstClass {


    public static void main (String[] args) {
//        System.out.println("Hello from Console!!!! I'm Java! This is cool");
//        System.out.println("This is first text");
//        System.out.println("This is double text");
//
//        //целочисленные
//        byte myByte = 127; //-128..+127 (1 byte)
//        short myShort = -32768; //-32768..+32767 (2 bytes)
//        int myInteger = 5345987; //-2.1млдр..+2.1млдр (4 bytes) //default
//        long myLong = 3000000000L; //-2^63..+2^63 (8 bytes)
//
//        System.out.println(myInteger);
//
//        //числа с точкой
//        float myFloat = 15.258f; //(4 bytes) <>.0000000
//        double myDouble = 159879.258564654; //(8 bytes) <>.00000000000000 //default
//
//        System.out.println(myDouble);
//
//        //символы
//        char myChar = 'h'; // (2 bytes)
//        System.out.println(myChar);
//
//        //булево
//        boolean myBoolean = true; //false (1 byte)
//        System.out.println(myBoolean);
//
//        //Math operations
//        //+,-,*,/,^, %
//
//        int a = 15;
//        int b = 25;
//        int c = a + b; //40
//
//        int x = 15;
//        int y = 3;
//        int z = x % y; // 15 % 4
//
//        System.out.println(z);
//
//        System.out.println(myShort + " " + myBoolean + " " + c + " " + myChar); // конкатенация строк
//        System.out.println("Hello, my value is: " + myFloat);

//        int a1 = 20;
//
//        if (a1 > 30) {
//            System.out.println("Yes, a1 > 30");
//        } else {
//            System.out.println("No, a1 < 30");
//        }
//
//        int b1 = 50;
//        if (b1 > 60) {
//            System.out.println("b1 > 30");
//        } else if (b1 > 40) {
//            System.out.println("b1 > 40");
//        } else {
//            System.out.println("Unknown???");
//        }
//
//        int c1 = 20;
//
//        if (c1 < 0) {
//            System.out.println("c1 < 0");
//        }
//
//        int y = 50;
////        int z = 150;
//        char z = '1';
//        boolean x = y > z; // y > 'r' -> 50 > ???
//
//        int abc = 49;
//        System.out.println("abc > " + (char)abc); //This is magic!!!
//
//        //ASCII (r > 456)
//        System.out.println("My char value is " + (int)z); //This is magic!!!
//        System.out.println("Result for Kirill " + x);
//
//        if (x) {
//            System.out.println("OK");
//        } else {
//            System.out.println("FAIL");
//        }

        int a = 150;
        int b = 200;
        int result;

        result = myMath(a, b); //result = a + b;
        a = a + 1;
        result = myMath(a, b);
        b = b + 1;
        result = myMath(a, b);
        a = a + 1;
        result = myMath(a, b);


        System.out.println("Result = " + result);
        doSomething("Hello for Method", 99990);

    }

    public static int myMath(int valueA, int valueB) { // возвращающие методы
        return valueA + valueB;
    }

    public static void doSomething(String valueStringMyFirstValueInMyMethod, int valueC) { //невозвращающие методы
        System.out.println("Hello from method doSomething");
        System.out.println("Hello from method doSomething x 2");
        int a = 160;
        int b = 56;
        int result = a + b + valueC;
        System.out.println("My value is " + valueStringMyFirstValueInMyMethod + " > " + result);
    }
}

/*
1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
_Orange
_ Banana
_ Apple

3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
если больше 100 (100 исключительно) - “Зеленый”;

5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите.
Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;

6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
 */
