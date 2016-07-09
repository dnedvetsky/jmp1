package com.data.Randomizer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class RandomUtils {
    public ArrayList<Integer> removeLowestValue(ArrayList<Integer> characteristics)
    {
        int minIndex = characteristics.lastIndexOf(Collections.min(characteristics));
        characteristics.remove(minIndex);
        return characteristics;
    }

    public ArrayList<Integer> removeHighestValue(ArrayList<Integer> characteristics)
    {
        int maxIndex = characteristics.lastIndexOf(Collections.max(characteristics));
        return characteristics;
    }
}
