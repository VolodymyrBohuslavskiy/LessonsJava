package Tasks.composition.composition.Zayavka_enum;

import lombok.AllArgsConstructor;
import lombok.Data;

//Клієнат
//                            прізвище
//                            ім'я
//                            дату народження
//
@Data@AllArgsConstructor
public class Client {
    private String surname,name, born;
    ID id;


}
