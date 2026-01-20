package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Student st1 = new Student("Роман", new RuleChetAndInterval());
        st1.addGrade(2);
        st1.addGrade(3);
        st1.addGrade(100_000);
        st1.addGrade(99_999);
        st1.addGrade(99_998);
        System.out.println(st1);

        Student st2 = new Student("Иван", new RuleChetAndInterval());
        st2.addGrade(0);
        st2.addGrade(100_000_000);
        st2.addGrade(100_001);
        st2.addGrade(100_002);
        st2.addGrade(6);
        System.out.println(st2);
    }
}

interface Rule{
    boolean check(int x);
}

