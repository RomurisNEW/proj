package com.stepup.proj;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0 || denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction sum(Fraction znach) {
        int newNumerator = this.numerator * znach.denominator + this.denominator * znach.numerator;
        int newDenominator = this.denominator * znach.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(Fraction znach) {
        int newNumerator = this.numerator * znach.denominator - this.denominator * znach.numerator;
        int newDenominator = this.denominator * znach.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(int num) {
        int newNumerator = this.numerator - num * this.denominator;
        return new Fraction(newNumerator, this.denominator);
    }

    public Fraction sum(int num) {
        int newNumerator = this.numerator + num * this.denominator;
        return new Fraction(newNumerator, this.denominator);
    }

    @Override
    public String toString() {
        return numerator +
                "/" + denominator;
    }
}
