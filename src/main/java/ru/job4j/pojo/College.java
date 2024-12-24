package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup("24ABC");
        student.setEnrollmentDate(LocalDate.of(2024, 9, 1));
        System.out.println("Студент " + student.getFio() + " поступил в группу " + student.getGroup() + ". Дата поступления: " + student.getEnrollmentDate());
    }
}
