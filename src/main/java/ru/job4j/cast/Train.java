package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train is moving on the rails...");
    }

    @Override
    public void info() {
        System.out.println("Train vehicle.");
    }
}
