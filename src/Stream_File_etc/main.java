package Stream_File_etc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human(6, "G", "g"));
        humans.add(new Human(7, "H", "h"));
        humans.add(new Human(5, "F", "f"));
        humans.add(new Human(10, "K", "k"));
        humans.add(new Human(0, "A", "a"));
        humans.add(new Human(8, "I", "i"));
        humans.add(new Human(3, "D", "d"));
        humans.add(new Human(4, "E", "e"));
        humans.add(new Human(1, "B", "b"));
        humans.add(new Human(9, "J", "j"));
        humans.add(new Human(2, "C", "c"));
        //++++++++++++++++++++++++++++++++++++++++++++++++++

        humans.add(new Human(2, "C", "c"));
        humans.add(new Human(1, "B", "b"));
        humans.add(new Human(2, "C", "c"));
        humans.add(new Human(2, "C", "c"));

        humans.stream()
                .distinct()// Тільки унікальні
                .sorted((o1, o2) -> o2.getId() - o1.getId())//Сорування + компаратор
                .filter(human -> !human.getName().startsWith("A"))//Фільтр, відфільтровує масив згідно наступгого методу .startsWith("A")-ті що починаються з"А", можна з "!"
                .peek(human -> human.setSurname("OMOMOMOMM"))//Замінити у всіх setSurname("OMOMOMOMM")
                .map(human -> {
                    human.setId(human.getId() + 100);
                    return human;
                })//всім ід +100, не забути ретyрн і {}
                .forEach(System.out::println);
        System.out.println("_______________________________");
        final Set<Human> collect = humans.stream().distinct().collect(Collectors.toSet());//Перетворити в масив чере зcollect(Collectors.toSet(), відсортований через .distinct() ліст
        collect.forEach(System.out::println);//Вивести ліст, у ньому є елементи що повторюються, бо це наступні дії з цим лістом










    }
}

@Data
@AllArgsConstructor
class Human {
    private int id;
    private String name, surname;

}