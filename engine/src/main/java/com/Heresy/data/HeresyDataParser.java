package com.Heresy.data;

import com.coreFuncionality.data.CommonDataParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Dmitry on 08.07.2016.
 */
public class HeresyDataParser extends CommonDataParser {
    public static final HeresyDataParser INSTANCE = new HeresyDataParser();

    /**
     * Converts data from XML to a suitable string format
     * @param path
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
