package com.stepup.proj;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        for(int grade : grades){
            addGrade(grade);
        }
    }

    public void addGrade(int grade) {
        if (grade < 2 || grade > 5){
            throw new IllegalArgumentException("Оценка должна быть в диапазаоне от 2 до 5");
        }
        grades.add(grade);
    }

    public List<Integer> getGrades(){
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return name +
                ": " + grades;
    }
}