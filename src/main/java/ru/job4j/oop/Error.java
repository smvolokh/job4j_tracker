package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error is active: " + active);
        System.out.println("Error status: " + status);
        System.out.println("Error message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 500, "Internal Server Error");
        Error error3 = new Error(false, 401, "Not Authorized");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
