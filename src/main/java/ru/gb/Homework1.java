package ru.gb;

public class Homework1 {
    public static void main(String[] args) {
     printThreeWords();
     checkSunSign();
     printColor();
     compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");

    }
    public static void checkSunSign() {
        int a = 13, b = 5;
        int c = a + b;
        final String s = (c >= 0 ? "положительная" : "отрицательная");
        System.out.println("Сумма "+ s);

    }
    public static void printColor() {
        int value = 5;
        if (value <=0)  {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 8;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
