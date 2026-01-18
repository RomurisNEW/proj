package com.stepup.proj;

import java.util.Random;

public abstract class Bird implements Singable {
    public void sing() {
        System.out.println("Птица издает пение");
    }
}

class Sparrow extends Bird{
    public void sing(){
        System.out.println("чырык");
    }
}

class Сuckoo extends Bird{
    public void sing(){
        Random random = new Random();
        int count = random.nextInt(10) + 1;

        for(int i = 0; i < count; i++){
            System.out.print("ку-ку ");
        }
        System.out.println("");
    }
}

class Parrot extends Bird{
    private final String songText;

    public Parrot(String songText) {
        this.songText = songText;
    }

    public void sing(){
        Random random = new Random();
        int count = random.nextInt(songText.length()) + 1;
        System.out.println(songText.substring(0,count));
    }
}
