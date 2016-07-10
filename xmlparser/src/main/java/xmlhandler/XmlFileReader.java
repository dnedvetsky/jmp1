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
     * @param path
     * @return
     */
    public File openXmlFIle(String path) {
        return new File(path);
    }

    /**
     * Parses XML file contents and returns string to work with
     * @param filePath
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
