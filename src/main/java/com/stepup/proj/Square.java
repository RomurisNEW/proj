package com.stepup.proj;

public class Square {
    private int x;
    private int y;
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        setX(x);
        setY(y);
        setSideLength(sideLength);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Сторона квадрата не может быть меньше или равна нулю");
        }
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат в точке {" + x +
                ";" + y +
                "} со стороной " + sideLength;
    }

    public void changePoint(int newX, int newY) {
        setX(newX);
        setY(newY);
    }

    public void changeSideLength(int newSideLength) {
        setSideLength(newSideLength);
    }
}
