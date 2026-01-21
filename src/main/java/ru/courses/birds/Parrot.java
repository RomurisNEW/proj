package ru.courses.birds;

import java.util.Random;

public class Parrot extends Bird{
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
