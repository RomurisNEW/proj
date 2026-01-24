package ru.courses.start;

import ru.courses.geometry.*;

public class MainApplication extends Exception {
    public static void main(String[] args){
        PolyLine poly1 = new PolyLine(
                new Point(1, 2),
                new Point(3, 5),
                new Point(6, 8),
                new Point(10, 12)
        );

        PolyLine poly2 = new PolyLine(
                new Point(1, 2),
                new Point(3, 5),
                new Point(6, 8),
                new Point(10, 12)
        );

        System.out.println(poly1 + " и " + poly2);
        System.out.println(poly1 == poly2);
        System.out.println(poly1.equals(poly2));

        double dlinaPoly1 = poly1.length();
        double dlinaPoly2 = poly2.length();
        System.out.println("Длина первой ломанной: " + String.format("%.3f", dlinaPoly1) + ". Длина второй" +
                " ломанной: " + String.format("%.3f", dlinaPoly2));
        System.out.println(dlinaPoly1 == dlinaPoly2);
    }
}

