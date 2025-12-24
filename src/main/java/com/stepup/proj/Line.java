package com.stepup.proj;

public class Line {
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1,y1);
        this.endPoint = new Point(x2,y2);
    }

    @Override
    public String toString() {
        return "от " + startPoint +
                " до " + endPoint;
    }

    public double getLength() {
        double dlinaX = endPoint.x - startPoint.x;
        double dlinaY = endPoint.y - startPoint.y;
        return Math.sqrt(dlinaX * dlinaX + dlinaY * dlinaY);
    }
}
