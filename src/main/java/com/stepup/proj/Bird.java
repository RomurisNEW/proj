package com.stepup.proj;

import java.util.Random;

public abstract class Bird implements Singable {
}

class Sparrow extends Bird {
    public void sing() {
        System.out.println("чырык");
    }
}

class Cuckoo extends Bird {
    private final Random random = new Random();

    public void sing() {
        int count = random.nextInt(10) + 1;

        for (int i = 0; i < count; i++) {
            System.out.print("ку-ку ");
        }
        System.out.println("");
    }
}

class Parrot extends Bird {
    private final String songText;
    private final Random random = new Random();

    public Parrot(String songText) {
        this.songText = songText;
    }

    public void sing() {
        int count = random.nextInt(songText.length()) + 1;
        System.out.println(songText.substring(0, count));
    }
}
