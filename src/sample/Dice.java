package sample;

import java.util.Random;

public class Dice {

    public int numberA, numberB;

    public void rollTheDice(int min, int max)
    {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        numberA = r.nextInt((max - min) + 1) + min;
        numberB = r.nextInt((max - min) + 1) + min;
    }

}

