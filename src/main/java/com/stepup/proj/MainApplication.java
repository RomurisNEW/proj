package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Square sq = new Square(-12, 15, 25);
        System.out.println(sq);

        sq.changePoint(22, 30);
        System.out.println(sq);

        sq.changePoint(0, -30);
        sq.changeSideLength(500);
        System.out.println(sq);

        sq.changePoint(-15, 0);
        sq.changeSideLength(-200);
        System.out.println(sq);
    }
}
