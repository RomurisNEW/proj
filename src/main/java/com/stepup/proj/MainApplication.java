package com.stepup.proj;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        Student student = new Student("Роман Гришин", List.of(4,5,2,3));
        Student student1 = new Student("Петр Петрович", List.of(5,5,5,4));
        System.out.println(student);
        System.out.println(student1);

        student.addGrade(4);
        student.addGrade(2);
        System.out.println(student);

        student.addGrade(5);
        System.out.println(student.getGrades());

        student.addGrade(6);
        System.out.println(student);
    }
}
