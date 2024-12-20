package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public double divide(int y) {
        return (double) y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public double sumAllOperation(int y) {
        return divide(y) + multiply(y) + sum(y) + minus(y);
    }

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumAllOperation(5));
    }
}
