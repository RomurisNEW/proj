package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        LengthString str = new LengthString("Предложение читаемое");
        System.out.println("Предложение из " + m(str) + " символов");


        Point p1 = new Point(2,3);
        Point p2 = new Point(4,2);
        Point p3 = new Point(6,6);

        Point[] points = {p1, p2, p3};
        PolyLine pLine = new PolyLine(points);
        ClosedPolyLine closPoLine = new ClosedPolyLine(points);
        System.out.println("Длина ломанной линии " + String.format("%.3f", m(pLine)));
        System.out.println("Длина закрытой ломанной линии " + String.format("%.3f", m(closPoLine)));
    }

    public static double m(Measurable m) {
        return m.getLength();
    }
}

interface Measurable {
    double getLength();
}
