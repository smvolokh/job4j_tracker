package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Airplane is moving in the air...");
    }

    @Override
    public void info() {
        System.out.println("Airplane vehicle.");
    }
}
