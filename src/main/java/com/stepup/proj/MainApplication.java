package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Fraction num1 = new Fraction(3,4);

        System.out.println("Дробь double: " + num1 + "=" + num1.doubleValue());
        System.out.println("Дробь float: " + num1 + "=" + num1.floatValue());
        System.out.println("Дробь int: " + num1 + "=" + num1.intValue());
        System.out.println("Дробь long: " + num1 + "=" + num1.longValue());

        System.out.println("");

        Fraction num2 = new Fraction(25,2);

        System.out.println("Дробь double: " + num2 + "=" + num2.doubleValue());
        System.out.println("Дробь float: " + num2 + "=" + num2.floatValue());
        System.out.println("Дробь int: " + num2 + "=" + num2.intValue());
        System.out.println("Дробь long: " + num2 + "=" + num2.longValue());
    }
}
