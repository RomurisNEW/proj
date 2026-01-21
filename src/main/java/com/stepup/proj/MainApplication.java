package com.stepup.proj;

import ru.courses.birds.Parrot;
import ru.courses.birds.Sparrow;
import ru.courses.birds.Cuckoo;

public class MainApplication {
    public static void main(String[] args) {
        Singable[] birds = {
                new Sparrow(),
                new Cuckoo(),
                new Parrot("Пение попугая веселое")
        };
        for (Singable bird : birds){
            bird.sing();
        }
    }
}

