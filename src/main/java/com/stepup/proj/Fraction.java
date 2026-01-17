package com.stepup.proj;

public class Fraction extends Number{
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0 || denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    @Override
    public String toString() {
        return numerator +
                "/" + denominator;
    }
    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double) numerator/denominator;
    }
}