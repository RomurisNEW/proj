package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Point[] points = {
                new Point(2, 2),
                new Point(4, 4),
                new Point(10, 72)
        };



        ClosedPolyLine closedPolyLineLine = new ClosedPolyLine(points);
        System.out.println(closedPolyLineLine);
        System.out.println("Длина замкнутой линии: " + String.format("%.3f", closedPolyLineLine.length()));

        PolyLine simpleLine = new PolyLine(points);
        System.out.println("Длина НЕ замкнутой линии: " + String.format("%.3f", simpleLine.length()));
    }
}
