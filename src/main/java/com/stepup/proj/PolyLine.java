package com.stepup.proj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolyLine {
    Point[] points;

    public PolyLine(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия: " + Arrays.toString(points);
    }

    public Line[] getLines(){
        Line[] lines = new Line[points.length-1];
        for (int i = 0; i < points.length-1; i++){
            lines[i] = new Line(points[i], points[i+1]);
        }
        return lines;
    }

    public double getLength(){
        double sumLine = 0;
        for (Line line : getLines()){
            sumLine += line.getLength();
        }
        return sumLine;
    }
}

