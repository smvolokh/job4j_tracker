package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Train train = new Train();
        Airplane airplane = new Airplane();
        Vehicle[] vehicles = {bus, train, airplane};
        for (Vehicle vehicle : vehicles) {
            vehicle.info();
            vehicle.move();
        }
    }
}
