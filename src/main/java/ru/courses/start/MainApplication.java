package ru.courses.start;

import ru.courses.geometry.*;

public class MainApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println("------------------------------");

        Point p3 = p1.clone();
        System.out.println(p3);
        System.out.println(p2 == p3);
        System.out.println(p2.equals(p3));


    }
}

