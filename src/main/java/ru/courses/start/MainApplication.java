package ru.courses.start;

public class MainApplication extends Exception {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fraction fr1 = new Fraction(3, 5);
        Fraction fr2 = fr1.clone();
        System.out.println(fr1 + " и " + fr2);
        System.out.println(fr1 == fr2);
        System.out.println(fr1.equals(fr2));
    }
}

