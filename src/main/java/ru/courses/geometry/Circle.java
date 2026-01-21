package ru.courses.geometry;

public class Circle {
    private final int radius;
    private final int x;
    private final int y;

    public Circle(int x, int y, int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус круга не может быть меньше или равен нуля");
        }
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        double pi = 3.14;
        return pi * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг в точке {" + x + ";" + y + "} c радиусом " +
                radius + ". Площадь круга S = " + getArea();
    }
}
