package xmlhandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringJoiner;

/**
 * Created by Dmitry on 08.07.2016.
 */
public class XmlFileReader {
    /**
     * Opens provided XML file
     * @param filePath - path to xml file
     * @return
     */
    public File openXmlFIle(String filePath) {
        return new File(filePath);
    }

    /**
     * Parses XML file contents and returns string to work with
     * @param filePath - path to xmlFile
     * @return
     */
    public String getXmlFileContents(String filePath) {
        BufferedReader reader = null;
        StringJoiner joiner = new StringJoiner("");
        try {
            String sCurrentLine;
            reader = new BufferedReader(new FileReader(filePath));
            while ((sCurrentLine = reader.readLine()) != null) {
                joiner.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return joiner.toString();
    }

}
