package com.stepup.proj;

import java.util.ArrayList;
import java.util.List;

public final class Student {
    private List<Integer> grades = new ArrayList<>();
    String name;
    private Rule rule;

    public Student(String name, Rule rule) {
        this.name = name;
        this.rule = rule;
    }

    public void addGrade(int x) {
        if (rule.check(x)) grades.add(x);
    }

    public String toString() {
        return "Студент " + name + " с оценками " + grades;
    }
}

class RuleChetAndInterval implements Rule{
    public boolean check(int x){
        return x % 2 == 0 && (x >= 1 && x <= 100_000);
    }
}