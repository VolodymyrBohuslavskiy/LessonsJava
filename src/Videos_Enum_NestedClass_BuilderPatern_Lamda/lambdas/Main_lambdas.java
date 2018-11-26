package Videos_Enum_NestedClass_BuilderPatern_Lamda.lambdas;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;

public class Main_lambdas {
    public static void main(String[] args) {


        ArrayList<User> users = new ArrayList<>();
        users.add(new User(7, "LA"));
        users.add(new User(4, "OP"));
        users.add(new User(5, "OJ"));
        users.add(new User(6, "OK"));
        users.add(new User(3, "OY"));
        users.add(new User(1, "OL"));
        users.add(new User(2, "OU"));


// Те ж саме !

//users.forEach(user -> {
//    System.out.println(user);
//});
//        users.forEach(System.out::println);

        users.replaceAll(user -> {
            if (user.getId() % 2 == 0) {
                user.setId(2);
            }
            return user;
        });

        users.removeIf(user -> user.getId() % 2 == 0);

  // Наступне це однакові вирази
        //users.sort(Comparator.comparingInt(User::getId));
        users.sort((o1, o2) -> o2.getId() - o1.getId());


        users.forEach(System.out::println);


        Test test = new Test() {
            @Override
            public void testMethod() {
            }
        };

//1
        Test test1 = () -> {
        };

//2
        Test1 test11 = (int i) -> {
        };
        Test1 test12 = i -> {
        };
//3
        Test2 test2 = i -> {
            return i + 20;
        };
        Test2 test21 = i -> i + 20;


    }
}

// Інтерфейс якиймає один метод називається функціональний інтерфейс @FunctionalInterface !
@FunctionalInterface
interface Test {
    void testMethod();
}

@FunctionalInterface
interface Test1 {
    void testMethod(int i);
}

@FunctionalInterface
interface Test2 {
    int testMethod(int i);
}

@AllArgsConstructor
@Data
@Builder
class User {
    private int id;
    private String name;
}
