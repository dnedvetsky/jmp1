package com.coreFuncionality.Randomizer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class RandomUtils {
    /**
     * Removes lowest value from list of attributes
     * @param characteristics
     * @return
     */
    public ArrayList<Integer> removeLowestValue(ArrayList<Integer> characteristics)
    {
        int minIndex = characteristics.lastIndexOf(Collections.min(characteristics));
        characteristics.remove(minIndex);
        return characteristics;
    }

    /**
     * Removes highest value - not used in current implementation but supported by engine and should be added later
     * @param characteristics
     * @return
     */
    public ArrayList<Integer> removeHighestValue(ArrayList<Integer> characteristics)
    {
        int maxIndex = characteristics.lastIndexOf(Collections.max(characteristics));
        return characteristics;
    }
}
