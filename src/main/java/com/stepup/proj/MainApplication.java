package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        Singable[] birds = {
                new Sparrow(),
                new Cuckoo(),
                new Parrot("Пение попугая веселое"),
                new Sparrow(),
                new Sparrow(),
                new Parrot("Ещё какое-то пение"),
                new Cuckoo(),
                new Parrot("Новый текст - новые возможности"),
                new Cuckoo(),
                new Cuckoo()
        };

        songBird(birds);
    }

    public static void songBird(Singable[] birds){
        for (Singable bird : birds){
            bird.sing();
        }
    }
}

interface Singable {
    void sing();
}
