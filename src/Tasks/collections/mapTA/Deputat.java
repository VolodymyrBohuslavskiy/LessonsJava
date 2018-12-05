package Tasks.collections.mapTA;

import lombok.Data;

/*Клас депутат(наслідується від людини):
        поля:
        прізвище,ім'я,вік,хабарник?,розмі хабаря
        методи:*/
@Data

public class Deputat extends Human {
    private String surname, name;
    private int age;
    private boolean bribe_taker = false;
    private int sizeOfBride;

    public Deputat(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public Deputat(String surname, String name, int age, int sizeOfBride) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.bribe_taker = true;
        this.sizeOfBride = sizeOfBride;
    }

    public static int TakeDribe(Deputat a, int sum) {
        if (!a.isBribe_taker()) return 0;
        if (sum>50)return 0;
        else return sum;
    }

}
