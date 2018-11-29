package string_regex_http;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        String s1 = "OLOLOLOLOL";
        String s2 = "OLOLOLOLOL";
        String s3 = new String("OLOLOLOLOL");
        System.out.println(s1 == s2 && s1.equals(s3));

        System.out.println(s3.toLowerCase());

        System.out.println(s3.startsWith("O"));
        System.out.println(s2.endsWith("L"));
        System.out.println(s1.contains("OLOL"));

        System.out.println(s2.indexOf("L"));
        System.out.println(s2.indexOf("L", 4));

        System.out.println(s1.lastIndexOf("L"));
        System.out.println(s1.lastIndexOf("L", 3));

        System.out.println(s1.charAt(3));

        System.out.println(s1.substring(2, 5));


        ArrayList<Human> humans = new ArrayList<>();

        String s = "1 Apu 33;3 Lee 32;2 Jay 66";
        String[] strings = s.split(";");
        for (String string : strings) {
            final String[] split = string.split(" ");
            humans.add(new Human(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2])));
        }

        humans.stream()
                .sorted(Comparator.comparingInt(Human::getAge))
                .forEach(human -> System.out.println(human.getName() + " " + human.getAge()));


        System.out.println(s.replace('e', '!'));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

//        [
//        {"name":"Olololn", "age":21},
//        {"name":"Nick", "age":4},
//        {"name":"Zack", "age":19},
//        {"name":"Zorro", "age":22},
//        {"name":"Lee", "age":69}
//]


/*// 1 Path
        URL url = new URL("http://localhost:3000/lolo");

// 2 Request to path
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

// 3 Path answer
        InputStream inputStream=urlConnection.getInputStream();
        byte[]bytes=new byte[inputStream.available()];
        inputStream.read(bytes);
        String string = new String(bytes);
        System.out.println(string);*/

// 1 Path
        URL url = new URL("http://localhost:3000/json");

// 2 Request to path
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

// 3 Path answer
        InputStream inputStream=urlConnection.getInputStream();
        byte[]bytes=new byte[inputStream.available()];
        inputStream.read(bytes);
        String string = new String(bytes);
//        System.out.println(string);


        JSONArray objects =new JSONArray(string);
        for (Object object : objects) {
            final JSONObject object1 = (JSONObject) object;
            System.out.println(object1.get("name") +" "+ object1.get("age"));
        }



    }
}

@Data
@AllArgsConstructor
class Human {
    private int id;
    private String name;
    private int age;
}