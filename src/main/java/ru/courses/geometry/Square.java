package ru.courses.geometry;

public class Square {
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
        return "Квадрат в точке {" + x + ";" + y + "} со стороной " + sideSquare + ". Площадь квадрата = "
                + getArea();
    }
}
