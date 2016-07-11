package com.coreFunctionality.randomizer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class RandomUtils
{
	/**
	 * Removes lowest value from list of attributes
	 *
	 * @param characteristics - list of characteristics for removal
	 * @return
	 */
	public ArrayList<Integer> removeLowestValue(ArrayList<Integer> characteristics)
	{
		int minIndex = characteristics.lastIndexOf(Collections.min(characteristics));
		characteristics.remove(minIndex);
		return characteristics;
	}
}
