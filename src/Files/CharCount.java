package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CharCount {
    public static void main(String[] args) throws IOException {

        Map<Character, Integer> map = сountOfSymvols("D:\\1111.txt");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
    // Метод приймає шлях до файлу, повертає Мапу < символ, кількість > отримуємо кількість унікальних символів )
    public static Map<Character, Integer> сountOfSymvols(String parth) throws IOException {
        FileInputStream stream = new FileInputStream(new File(parth));
        byte[] bytes = new byte[stream.available()];
        stream.read(bytes);

        Map<Character, Integer> targetArray = new TreeMap<>();
        for (char c : new String(bytes).toCharArray()) {
            if (!targetArray.containsKey(c)) {
                targetArray.put(c, 1);
            } else {
                int i = targetArray.get(c);
                targetArray.put(c, ++i);
            }
        }
        return targetArray;
    }
}
