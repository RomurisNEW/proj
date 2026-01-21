package ru.courses.birds;

import com.stepup.proj.Singable;

public abstract class Bird implements Singable {
    public void sing() {
        System.out.println("Птица издает пение");
    }
}

