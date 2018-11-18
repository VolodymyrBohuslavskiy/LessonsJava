package Tasks.composition.composition.Persona_and_Tvarunka;

import lombok.Data;

@Data
public class Persona {
    private String name, surname;
    private int age;
    Tvarunka tvarunka;
    Poshta poshta;

    public Persona(String name, String surname, int age, Tvarunka tvarunka, Poshta poshta) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.tvarunka = tvarunka;
        this.poshta = poshta;
    }
}
