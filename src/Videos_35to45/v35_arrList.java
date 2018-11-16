package Videos_35to45;

// List ->   ArrList;(мають індекси)                                                  LinkedList;(Мають інформацію про сусідів)         невпорядковані Лісти
// Set  ->   TreSet;                    HashSet;(найшвидший)                          LinkHashSet;(зберігає у порядку додавання)        тільки унікальні значення(Поацює з чеш-кодами обєктів)
// Map  ->   HashMap;                   LinkedHashMap;(зберігає порядок, швидкий)     TreeMap;(Сортує по значеннях)                     ключ - значення(Асоціативні масиви (МАПи) аналогічно JSON)

import java.util.ArrayList;
import java.util.List;
public class v35_arrList {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");

strings.toArray();
        for (String s : strings) {
            System.out.print(s+" ");
        }
    }
}
