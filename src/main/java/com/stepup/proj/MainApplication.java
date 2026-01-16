package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7 );
        Point p3 = new Point(4, 12);
        Point p4 = new Point(16, 16);
        Point p5 = new Point(20, 2 );
        Line line1 = new Line(p1, p2);
        System.out.print(line1);
        System.out.println(" - длина 1-ой линии = " + String.format("%.2f", m(line1)));

        Point[] points = {p1, p2, p3, p4, p5};
        PolyLine pLine = new PolyLine(points);
        ClosedPolyLine closedLine = new ClosedPolyLine(points);

        System.out.println("Длина открытой ломанной = " + String.format("%.2f", m(pLine)));
        System.out.println("Длина закрытой ломанной = " + String.format("%.2f", m(closedLine)));

    }

    public static double m(Measurable m) {
        return m.getLength();
    }
}

interface Measurable {
    double getLength();
}
