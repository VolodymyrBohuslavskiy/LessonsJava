package Tasks.composition.composition.Kompaniya;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor@Data
public class Kompaniya {
    private String nameOfKompania;
    List<Departament> departament;

}
