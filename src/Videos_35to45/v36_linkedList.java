package Videos_35to45;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
@Data
class User {
    private int id;
    private String name;
}

public class v36_linkedList {
    public static void main(String[] args) {

        List<User> userList = new LinkedList<>();
        userList.add(new User(1, "First"));
        userList.add(new User(2, "Second"));
        userList.add(new User(3, "Third"));
        userList.add(new User(5, "Fifth"));
        userList.add(new User(6, "Sixth"));
        userList.add(new User(4, "Fourth"));

//               ITERATOR! userList.iterator()+ ( ctrl+alt+v ) !!!
        Iterator<User> iterator = userList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getId() % 2 == 0) {/*iterator.remove();*/
                System.out.println(iterator.next());
            }
        }
        System.out.println();

//                  COMPARATOR Разом з .sort()
        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getId() - o2.getId();
            }
        };

        userList.sort(userComparator);

        for (User user : userList) {
            System.out.println(user);
        }

    }
}
