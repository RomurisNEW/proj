package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {

        System.out.println(sumAll(2, new Fraction(3,5), 2.3));
        System.out.println(sumAll(3.6, new Fraction(49,12), 3, new Fraction(3, 2)));
        System.out.println(String.format("%.3f",sumAll(new Fraction(1,3), 1)));
    }

    public static double sumAll(Number... numbers){
        double sum = 0;
        for (Number number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }
}
