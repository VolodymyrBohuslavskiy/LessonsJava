package Tasks.composition.composition.Zayavka_enum;

import lombok.AllArgsConstructor;
import lombok.Data;

//Паспорт
//                                                   серію
//                                                    номер
//                                                     ким виданий
@Data
@AllArgsConstructor
public class ID {
    private String ser,number,whoGive;

}
