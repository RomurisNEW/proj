package com.stepup.proj;

public class LengthString implements Measurable {
    private final String str;

    public LengthString(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Результат: " + str;
    }

    public double getLength(){
        return str.length();
    }
}
