package Tasks.composition.composition.Zayavka_enum;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Zayavka {
    private int number;
    private String data;
    private Type type;
    private Client client;
}
