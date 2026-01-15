package com.stepup.proj;

import java.util.Arrays;

public class PolyLine {
    Point[] points;

    public PolyLine(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия: "
                + Arrays.toString(points);
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i + 1].x;
            len2 = points[i].y - points[i + 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }
}

class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point[] points) {
        super(points);
    }

    public double length() {
        double sumNew = super.length(), lenNew1, lenNew2;
        if (points.length > 1) {
            lenNew1 = points[points.length - 1].x - points[0].x;
            lenNew2 = points[points.length - 1].y - points[0].y;
            sumNew += Math.sqrt(lenNew1 * lenNew1 + lenNew2 * lenNew2);
        }
        return sumNew;
    }

    @Override
    public String toString() {
        return "Замкнутая линия: "
                + Arrays.toString(points);
    }
}




