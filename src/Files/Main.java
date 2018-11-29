package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// методи для читання і запису файлів
public class Main {
    public static void main(String[] args) throws IOException {




        WriteThisFile("C:\\Users\\Володя\\Desktop\\file.txt",false,"/8");
        ReadThisFile("C:\\Users\\Володя\\Desktop\\file.txt");





    }

    public static void WriteThisFile(String pathname, boolean append, String WriteThis) throws IOException {
        File f = new File(pathname);
        if (!f.exists()) f.createNewFile();
        FileOutputStream outputStream = new FileOutputStream(f, append);
        outputStream.write(WriteThis.getBytes());
        outputStream.close();
    }

    public static void ReadThisFile(String pathname) throws IOException {
        File file = new File(pathname);
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        String s = new String(bytes);
        System.out.println(s);
    }


}
