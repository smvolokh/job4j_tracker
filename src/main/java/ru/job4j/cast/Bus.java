package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus is moving on the road...");
    }

    @Override
    public void info() {
        System.out.println("Bus vehicle.");
    }
}
