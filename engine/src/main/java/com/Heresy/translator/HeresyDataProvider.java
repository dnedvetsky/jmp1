package com.Heresy.translator;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class HeresyDataProvider {
    public static final HeresyDataProvider INSTANCE = new HeresyDataProvider();
    private HashMap<String, String> talents = new HashMap<String, String>();

    public HeresyDataProvider() {
        try {
            buildTalents();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void buildTalents() throws NoSuchMethodException, ParserConfigurationException, SAXException, IOException {
        talents.putAll(HeresyDataParser.INSTANCE.convertData("herecyXML.xml"));
    }

    public String getTalent(String name) {
        return talents.get(name);
    }

}
