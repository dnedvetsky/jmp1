package com.heresysystemfunctionality.chargenutils;

import com.corefunctionality.randomizer.RandomGenerator;
import com.corefunctionality.randomizer.RandomUtils;
import com.heresysystemfunctionality.charsheet.CharsheetHeresy;

import java.util.ArrayList;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class HeresyChargen {
    private RandomUtils utils = new RandomUtils();

    /**
     * Use this method to get already pre-generated character for quick generation.
     * in TODO: add random talents addition and etc.
     * @return
     */
    public CharsheetHeresy generateCharacter() {
        CharsheetHeresy charsheet = new CharsheetHeresy(
                generateStatistic(), generateStatistic(), generateStatistic(), generateStatistic());
        //TODO: Additional randomization goes here
        return charsheet;
    }

    /**
     * Generate statistics for heresysystemfunctionality character; According to math - remove lowest value
     * @return
     */
    private int generateStatistic() {
        RandomGenerator rgen = RandomGenerator.INSTANCE;
        return multiplyGeneratedValues(utils.removeLowestValue(rgen.multipleRandom(3, 20)));
    }

    /**
     * Multiplies all values in list
     * @param values - all values in ArrayList integer
     * @return
     */
    private int multiplyGeneratedValues(ArrayList<Integer> values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}
