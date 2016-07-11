package com.corefunctionality.randomizer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class RandomGenerator {
    public static RandomGenerator INSTANCE = new RandomGenerator();
    Random randnum = new Random();

    /**
     * Returns random value
     * @param i
     * @return
     */
    public int randomValue(int i) {
        return randnum.nextInt(i + 1);
    }

    /**
     * Returns set of random values
     * @param iterations - number of attempts
     * @param randomTop - cap number
     * @return
     */
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
