package com.heresysystemfunctionality.charsheet;

import com.corefunctionality.data.CommonCharsheet;
import com.heresysystemfunctionality.data.HeresyDataProvider;

import java.util.HashMap;

/**
 * Created by Dmitry on 08.07.2016.
 */
public class CharsheetHeresy extends CommonCharsheet {
    private HashMap<String, String> localTalents = new HashMap<String, String>();

    /**
     * Constructs with specified values
     * @param str - attributes
     * @param wis - attributes
     * @param dex - attributes
     * @param con - attributes
     */
    public CharsheetHeresy(int str, int wis, int dex, int con) {
        super(str, wis, dex, con);
    }

    /**
     * Basic constructor for character
     */
    public CharsheetHeresy() {
        super(0, 0, 0, 0);
    }

    /**
     * Ued to get all attributes for selected character;
     * @return
     */
    public HashMap<String, Integer> getAttributes() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Con", getCon());
        map.put("Str", getStr());
        map.put("Dex", getDex());
        map.put("Wis", getWis());
        return map;
    }

    /**
     * Method is used to get all talents for character
     * @return
     */
    public HashMap<String, String> getTalents() {
        return localTalents;
    }

    /**
     * Method is used to add talent from list to a selected character
     * @param name - name to add a talent to charsheet
     */
    public void addTalent(String name) {
        localTalents.put(name, HeresyDataProvider.INSTANCE.getTalent(name));
    }
}
