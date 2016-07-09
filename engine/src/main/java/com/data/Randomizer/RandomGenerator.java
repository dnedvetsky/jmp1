package com.data.Randomizer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class RandomGenerator {
    public static RandomGenerator INSTANCE = new RandomGenerator();
    Random randnum = new Random();

    public int randomValue(int i) {
        return randnum.nextInt(i + 1);
    }

    public ArrayList<Integer> multipleRandom(int iterations, int randomTop) {
        int i = 0;
        iterations = iterations > 0 ? iterations : 0;
        ArrayList<Integer> randomValues = new ArrayList<Integer>();
        while (i++ < iterations) {
            randomValues.add(randomValue(randomTop));
        }
        return randomValues;
    }
}
