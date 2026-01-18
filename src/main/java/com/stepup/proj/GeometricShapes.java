package com.stepup.proj;

class Circle implements Shapesable {
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

class Square implements Shapesable {
    private final int sideSquare;
    private final int x;
    private final int y;

    public Square(int x, int y, int sideSquare) {
        if (sideSquare <= 0) {
            throw new IllegalArgumentException("Сторона квадрата не может быть меньше или равна нулю");
        }
        this.x = x;
        this.y = y;
        this.sideSquare = sideSquare;
    }

    public double getArea() {
        return sideSquare * sideSquare;
    }

    @Override
    public String toString() {
        return "Квадрат в точке {" + x + ";" + y + "} со стороной" + sideSquare + ". Площадь квадрата = "
                + getArea();
    }
}

class Rectangle implements Shapesable {
    private final int dlinX;
    private final int dlinY;
    private final int x;
    private final int y;

    public Rectangle(int x, int y, int dlinY, int dlinX) {
        if (dlinX <= 0 || dlinY<=0) {
            throw new IllegalArgumentException("Сторона прямоугольника не может быть меньше или равна нулю");
        }
        this.x = x;
        this.y = y;
        this.dlinY = dlinY;
        this.dlinX = dlinX;
    }

    public double getArea() {
        return dlinX * dlinY;
    }

    @Override
    public String toString() {
        return "Прямоугольник в точке {" + x + ";" + y + "} со сторонами" + dlinX + " и "
                + dlinY + ". Площадь прямоугольника = "
                + getArea();
    }
}