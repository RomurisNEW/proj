package ru.courses.geometry;

import ru.courses.start.Pointable;

public class Point implements Pointable {
    private final int[] point;

    public Point(int... point) {
        if(point.length < 1 || point.length>3){
            throw new IllegalArgumentException("Нужно ввести от 1 до 3 значений. Без выхода за эту границу");
        }
        this.point = point;
    }

    @Override
    public String toString() {
        if (point.length == 1) {
            return "Точка в координате " + point[0];
        }
        if (point.length == 2) {
            return "Точка в координате {" + point[0] + ";" + point[1] + "}";
        }
        if (point.length == 3) {
            return "Точка в координате {" + point[0] + ";" + point[1] + ";" + point[2] + "}";
        }

        return "Точка не верного формата";
    }
}

class PointColor implements Pointable {
    private final Pointable pointable;
    private final String color;

    public PointColor(Pointable pointable, String color) {
        this.pointable = pointable;
        this.color = color;
    }

    @Override
    public String toString() {
        return pointable +
                ", " + color;
    }
}

class PointTime implements Pointable {
    private final Pointable pointable;
    private final String time;

    public PointTime(Pointable pointable, String time) {
        this.pointable = pointable;
        this.time = time;
    }

    @Override
    public String toString() {
        return pointable +
                ", в " + time;
    }
}