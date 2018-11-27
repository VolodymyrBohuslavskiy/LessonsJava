package Tasks.collections.stream_api;

//Створити класс Компьютер з полями
//        - модель+
//        - рік випуску+
//        - об'єм пам'яті+
//        - ціна+

//        - Жорсткий диск (Класс з полями)+
//        - Модель жорсткого диску+
//        - Тип (ссд або хдд)+
//        - об'єм жорсткого диску+
//        - Країна виробник (Енуми. Китай, Корея, Індія, США)+

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//        - Процессор(Класс)+
//        -кількість ядер+
//        -частота+
//        -виробник (Енуми ті самі країни)+
//
//        Створити список з 20 об'єктів.
//
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Computer {
    private String model;
    private int year, RAM, Cost;
    private ROM rom;
    private Procesor procesor;

}
@Data
@AllArgsConstructor
class ROM {
    private String rom_model;
    private ROMtype roMtype;
    private int romMas;
    private CountryOfManufacture ROMmanufacture;
}
@Data
@AllArgsConstructor
class Procesor {
    private int Cores;
    private double frequency;
    private CountryOfManufacture ProcManufacture;
}

enum ROMtype {
    SSD, HDD
}

enum CountryOfManufacture {
    CHINA, KOREA, INDIA, USA
}
