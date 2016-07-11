package com.Heresy.data;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.corefunctionality.data.CommonDataParser;

/**
 * Created by Dmitry on 08.07.2016.
 */
public class HeresyDataParser extends CommonDataParser {
    public static final HeresyDataParser INSTANCE = new HeresyDataParser();

    /**
     * Converts data from XML to a suitable string format
     * @param path - path to file
     * @return
     */
    public HashMap convertData(String path) {
        try {
            return super.convertDataFromXml(path, "entity", "name", "description");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
