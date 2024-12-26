package ru.job4j.polymorphism;

public class Bus implements Transport {
    private static final int FUEL_COST = 100;
    private int count;

    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void passengers(int count) {
        this.count = count;
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("Refuelling " + fuel + " fuel");
        return FUEL_COST * fuel;
    }
}
