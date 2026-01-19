package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Pointable[] points = {
                new PointColor(new Point(6), "красного цвета"),
                new PointTime(new Point(1,4), "11:00"),
                new PointColor(new PointTime(new Point(12,4,5), "15:35"), "желтого цвета")
        };

        for(Pointable point : points){
            System.out.println(point);
        }
    }
}

interface Pointable {
}
