package HW1.SaveLoad;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LoadFrom {
    private static File file = new File("Chat_history.txt");
    private static FileInputStream fis;
    public static String loadFromFile() {
        String result = "";
        try {
            fis = new FileInputStream(file);
            byte[] buffer = new byte[(int) file.length()];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                result += new String(buffer, 0, bytesRead);
            }
            fis.close();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
