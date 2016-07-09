package chargenUtils;

import com.Heresy.charsheet.CharsheetHeresy;
import com.data.Randomizer.RandomGenerator;
import com.data.Randomizer.RandomUtils;

import java.util.ArrayList;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class HeresyChargen {
    private RandomUtils utils = new RandomUtils();

    public CharsheetHeresy generateCharacter() {

        CharsheetHeresy charsheet = new CharsheetHeresy(
                generateStatistic(), generateStatistic(), generateStatistic(), generateStatistic());
        //TODO: Additional randomization goes here
        return charsheet;
    }

    private int generateStatistic() {
        RandomGenerator rgen = RandomGenerator.INSTANCE;
        return multiplyGeneratedValues(utils.removeLowestValue(rgen.multipleRandom(3, 20)));
    }

    private int multiplyGeneratedValues(ArrayList<Integer> values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}
