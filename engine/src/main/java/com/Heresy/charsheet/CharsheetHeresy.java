package com.Heresy.charsheet;

import com.Heresy.translator.HeresyDataProvider;
import com.coreFuncionality.data.CommonCharsheet;

import java.util.HashMap;

/**
 * Created by Dmitry on 08.07.2016.
 */
public class CharsheetHeresy extends CommonCharsheet {
    private HashMap<String, String> localTalents = new HashMap<String, String>();

    public CharsheetHeresy(int str, int wis, int dex, int con) {
        super(str, wis, dex, con);
    }

    public CharsheetHeresy() {
        super(0, 0, 0, 0);
    }

    public HashMap<String, Integer> getAttributes() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Con", getCon());
        map.put("Str", getStr());
        map.put("Dex", getDex());
        map.put("Wis", getWis());
        return map;
    }

    public HashMap<String, String> getTalents() {
        return localTalents;
    }

    public void addTalent(String name) {
        localTalents.put(name, HeresyDataProvider.INSTANCE.getTalent(name));
    }
}
