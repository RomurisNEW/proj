package ru.courses.start;

import java.util.Objects;

class Fraction implements Cloneable {
    private int num;
    private int denum;

    public Fraction(int num, int denum) {
        if(denum == 0){
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return num == fraction.num && denum == fraction.denum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, denum);
    }

    @Override
    protected Fraction clone() throws CloneNotSupportedException {
        return (Fraction) super.clone();
    }
}