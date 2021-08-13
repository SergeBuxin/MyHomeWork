package Lesson1;

// Домашняя работа №1

public class HomeWorkApp {
    public static void main(String[] args) {
        printColour();
        printColour();
        compareNumber();

        // прописываем методы №2, №4, №5 в основном методе main

    }

    public static void printThreeWords() {
        System.out.println("Banana");
        System.out.println("Orange");
        System.out.println("Apple");
    }


    public static void checkSumSing() {
        int a = 1;
        int b = -2;
        // присваиваем переменную для а и b

        if (a + b >= 0) {
            System.out.println("Сумма положительная!");
        } else
            System.out.println("Сумма Отрицательная!");
    }


    public static void printColour() {
        int val = 101;
        if (val <= 0) {
            System.out.println("Красный");
        } else if (val > 0 && val <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumber() {
        int a = 15;
        int b = 0;

        if (a >= b) {
            System.out.println("a >=b");
        } else {
            System.out.println("a < b");

        }
    }

}