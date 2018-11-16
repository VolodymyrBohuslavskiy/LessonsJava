package Videos_35to45;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.TreeSet;

@AllArgsConstructor
@Data
class Usero implements Comparable<Usero> {
    private int id;
    private String name;

    @Override
    //o1-this; o2-o;
    public int compareTo(Usero o) {
        return this.getId() - o.getId();
    }
}

public class v39_SET {
    public static void main(String[] args) {
        TreeSet<Usero> useros = new TreeSet<>();
        useros.add(new Usero(1, "a"));
        useros.add(new Usero(3, "c"));
        useros.add(new Usero(2, "b"));
        useros.add(new Usero(4, "d"));
        useros.add(new Usero(6, "f"));
        useros.add(new Usero(5, "e"));
        useros.add(new Usero(9, "k"));

        for (Usero usero : useros) {
            System.out.println(usero.getName() + usero.getId());
        }


    }


}
