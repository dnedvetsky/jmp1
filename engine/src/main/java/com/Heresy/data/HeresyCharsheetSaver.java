package com.Heresy.data;

import java.util.HashMap;

import com.Heresy.charsheet.CharsheetHeresy;
import com.corefunctionality.data.CommonCharsheetSaver;
import com.corefunctionality.data.CommonDataParser;

import xmlhandler.XmlManager;

/**
 * Created by Dmitry on 10.07.2016.
 */
public class HeresyCharsheetSaver extends CommonCharsheetSaver {

    private XmlManager xmlManager = new XmlManager();
    private CommonDataParser commonDataParser = new CommonDataParser();

    /**
     * Saves charasheet into xml format - with attributes list and description
     * @param charsheetHeresy - a character sheet for to parse for data
     */
    public void saveHeresyCharsheet(CharsheetHeresy charsheetHeresy) {
        HashMap<String, Integer> charsheetAttributes = new HashMap<String, Integer>();
        charsheetAttributes = super.parseCharsheetAttributes(charsheetHeresy);
        commonDataParser.convertDataToXml(charsheetAttributes, "entity", "name", "value");
        commonDataParser.convertDataToXml(parseCharacterTalents(charsheetHeresy), "entity", "name", "description");
    }

    /**
     * Parses character talents when heresy charsheet provided
     * @param charsheetHeresy - a character sheet for to parse for data
     * @return
     */
    private HashMap<String, String> parseCharacterTalents(CharsheetHeresy charsheetHeresy) {
        return charsheetHeresy.getTalents();
    }
}
