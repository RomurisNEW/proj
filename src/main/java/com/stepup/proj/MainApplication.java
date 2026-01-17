package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        double res1 = sumAll(2, new Fraction(3,5), 2.3);
        double res2 = sumAll(3.6, new Fraction(49,12), 3, new Fraction(3,2));
        double res3 = sumAll(new Fraction(1,3), 1);

        System.out.println(String.format("%.3f",res1));
        System.out.println(String.format("%.3f",res2));
        System.out.println(String.format("%.3f",res3));
    }

    public static double sumAll(Number... numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}