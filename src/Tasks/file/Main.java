package Tasks.file;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

//1 Дістати з файлу usersForParsing.txt всіх користувачів+

//        2 Зробити все необхідно, щоб :
//        - відсортувати користувачів за id
//        - відсортувати користувачів за імейлом
//        - відфільтрувати користувачів , залишивши тільки тих хто має гугловський аккаунт.

//        3. Зробити ці всі дії
//        ФАЙЛ НЕ ЗМІНЮВАТИ!

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\Project on git\\IdeaProjects\\LessonsJava\\File\\usersForParsing.txt");

        ArrayList<User> userList=new ArrayList<>();

        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] bytes = new byte[fileInputStream.available()];

        fileInputStream.read(bytes);
        fileInputStream.close();

        String s = new String(bytes);

        String[] split = s.split(";");

// Запитати чому остаінй масив має розмір в 1 елемент !!!!!!!!!!!!!!!
//        for (String s1 : split) {
//            String[] split1=s1.split(" ");
////            userList.add(new User(split1[0],split1[1],split1[2],split1[3],split1[4],split1[5]));
//            System.out.println(split1.length);
//        }

        for (String s1 : split) {
            String[] split1=s1.split(" ");
            if (split1.length!=1)userList.add(
                    new User(Integer.valueOf(split1[0]),
                            split1[1],
                            split1[2],
                            split1[3],
                            split1[4],
                            Boolean.parseBoolean(split1[5])));
        }

        System.out.println("- відсортувати користувачів за id");
userList.stream()
        .sorted(Comparator.comparingInt(User::getId))
        .forEach(user -> System.out.println(user.getId()+
                " "+user.getName()+
                " "+user.getSurname()+
                " "+user.getEmail()+
                " "+user.getPassword()));

        System.out.println("\n- відсортувати користувачів за імейлом");

        userList.stream()
                .sorted(Comparator.comparing(User::getEmail))
                .forEach(user -> System.out.println(user.getId()+
                        " "+user.getName()+
                        " "+user.getSurname()+
                        " "+user.getEmail()+
                        " "+user.getPassword()));


        System.out.println("\n- відфільтрувати користувачів , залишивши тільки тих хто має гугловський аккаунт.");

userList.stream().filter(user -> user.getEmail().contains("@gmail.com")).forEach(user -> System.out.println(user.getId()+
                " "+user.getName()+
                " "+user.getSurname()+
                " "+user.getEmail()+
                " "+user.getPassword()));


    }
}
@Data
@AllArgsConstructor
class User{
    private int id;
    private String name,surname,password,email;
    private boolean statuse;

}