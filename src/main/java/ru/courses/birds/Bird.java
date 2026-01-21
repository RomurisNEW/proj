package ru.courses.birds;

import ru.courses.main.Singable;

public abstract class Bird implements Singable {
    public void sing() {
        System.out.println("Птица издает пение");
    }
}

