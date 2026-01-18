package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Singable[] birds = {
                new Sparrow(),
                new Сuckoo(),
                new Parrot("Пение попугая веселое")
        };
        for (Singable bird : birds){
            bird.sing();
        }
    }
}

interface Singable {
    void sing();
}
