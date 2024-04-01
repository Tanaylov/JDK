package HW1.SaveLoad;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SaveTo {
    private static File file = new File("Chat_history.txt");
    private static FileOutputStream fos;
    public static void saveToFile(String text) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try
        {
            fos = new FileOutputStream(file);
            byte[] buffer = text.getBytes();
            fos.write(buffer);
            fos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
