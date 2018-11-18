package Tasks.composition.composition.Persona_and_Tvarunka;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tvarunka implements Gaf{
    private String alias;
    private int age;

    @Override
    public void GAF() {
        System.out.println("Gaf");
    }
}
