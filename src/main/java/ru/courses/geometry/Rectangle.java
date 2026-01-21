package ru.courses.geometry;

public class Rectangle {
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
        return "Прямоугольник в точке {" + x + ";" + y + "} со сторонами " + dlinX + " и "
                + dlinY + ". Площадь прямоугольника = "
                + getArea();
    }
}
