package ru.courses.geometry;

import java.util.Objects;

public class Line implements Cloneable{
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = new Point(start.getX(), start.getY());
        this.end = new Point(end.getX(), end.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line line = (Line)super.clone();
        line.start = new Point(start.getX(), start.getY());
        line.end = new Point(end.getX(), end.getY());
        return line;
    }

    @Override
    public String toString() {
        return "Линия от " + start +
                " до " + end;
    }
}
