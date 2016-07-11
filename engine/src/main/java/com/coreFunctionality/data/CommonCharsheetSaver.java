package com.coreFunctionality.data;

import xmlhandler.XmlManager;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Dmitry on 10.07.2016.
 */
public class CommonCharsheetSaver {
    private XmlManager xmlManager = new XmlManager();

    /**
     * Parses character attributes - since this is common for any charsheet types
     * @param charsheet
     * @return
     */
    public HashMap<String, Integer> parseCharsheetAttributes(CommonCharsheet charsheet)
    {
        //TODO: Parsing charsheet goes here - get all fields like WIS, CON (attributes)
        return null;
    }

    /**
     * Should save charsheet by name. TODO: specify name via param - not hardcode it
     * @param data
     */
    public void saveCharsheet(String data)
    {
        try {
            xmlManager.generateXmlFile("newCharsheet.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
