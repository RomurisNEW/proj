package ru.courses.geometry;

import java.util.Arrays;
import java.util.Objects;

public class PolyLine {
    private Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0;
        double len1;
        double len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i + 1].getX() - points[i].getX();
            len2 = points[i + 1].getY() - points[i].getY();
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Objects.deepEquals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    @Override
    public String toString() {
        return "Ломанная в координатах: " + Arrays.toString(points);
    }
}
