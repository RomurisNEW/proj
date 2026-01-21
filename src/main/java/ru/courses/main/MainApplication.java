package ru.courses.main;

import ru.courses.birds.*;

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

