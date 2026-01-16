package com.stepup.proj;

public class Line implements Measurable {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength(){
        double dlX = end.x - start.x;
        double dlY = end.y - start.y;
        return Math.sqrt(dlX*dlX + dlY*dlY);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
