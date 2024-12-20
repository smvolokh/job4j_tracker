package ru.job4j.oop;

public class Max {

    public double max(double a, double b) {
        return a > b ? a : b;
    }

    public double max(double a, double b, double c) {
        return max(max(a, b), max(b, c));
    }

    public double max(double a, double b, double c, double d) {
        return max(max(a, b, c), max(b, c, d), max(a, c, d));
    }
}
