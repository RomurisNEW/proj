package ru.courses.start;

import ru.courses.geometry.*;

public class MainApplication extends Exception {
    public static void main(String[] args) throws CloneNotSupportedException {
        Line l1 = new Line(new Point(1,2), new Point(2,4));
        System.out.println("Линия 1: " + l1);

        Line l2 = l1.clone();
        System.out.println("Линия 2: " + l2);

        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));

    }
}

