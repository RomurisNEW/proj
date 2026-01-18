package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Shapesable[] figuras = {
                new Circle(24, 12, 2),
                new Square(11, 24, 2),
                new Rectangle(12, 11, 3, 2)
        };

        for (Shapesable figura : figuras) {
            System.out.println(figura);
        }
    }
}

interface Shapesable {
    double getArea();
}
