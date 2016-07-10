package xmlhandler;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dmitry on 08.07.2016.
 */
public class XmlManager {
    XmlFileReader xmlReader = new XmlFileReader();

    public void editXmlFile(String xmlPath, String xmlData) {
        xmlReader.openXmlFIle(xmlPath);
        //Edit goes here
    }

    public void removeXmlFile(String fileName) {
        new File(fileName).delete();
    }

    public void generateXmlFile(String filePath) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();
        file.createNewFile();
    }
}
