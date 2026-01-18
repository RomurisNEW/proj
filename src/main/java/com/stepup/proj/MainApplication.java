package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Shapesable[] figuras = {
                new Circle(24, 12, 2),
                new Square(11, 24, 2),
                new Rectangle(12, 11, 3, 2),
                new Square(33, 42, 12),
                new Rectangle(44, 111, 21, 33),
                new Circle(10, 2, 6),
                new Circle(5, 1, 9)
        };

        for (Shapesable figura : figuras) {
            System.out.println(figura);
        }

        System.out.println(" ");
        System.out.println("Общая площадь всех фигур: " + String.format("%.3f",  sumAllAreas(figuras)));

    }
    public static double sumAllAreas(Shapesable[] figuras){
        double sum = 0;
        for (Shapesable figura : figuras){
            sum+= figura.getArea();
        }
        return sum;
    }
}

interface Shapesable {
    double getArea();
}
