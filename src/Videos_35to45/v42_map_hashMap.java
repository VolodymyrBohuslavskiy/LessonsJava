package Videos_35to45;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@AllArgsConstructor
@Data
class Friend {
    private String name;
    private int age;
}

class v42_map_hashMap {
    public static void main(String[] args) {

        Map<String, Friend> frendHashMap = new HashMap<>();
        frendHashMap.put("a", new Friend("Ololon", 9));
        frendHashMap.put("c", new Friend("Anan", 6));
        frendHashMap.put("b", new Friend("Nonon", 67));
        frendHashMap.put("d", new Friend("Yoyoyo", 32));

        System.out.println(frendHashMap.get("c").getName());
        System.out.println(frendHashMap.keySet());//Всі ключі
        System.out.println(frendHashMap.values());//Всі значення

        frendHashMap.replace("d", new Friend("Oppa", 8));
        System.out.println(frendHashMap.get("d").getName());

    }
}

class v43_map_treemap {
    public static void main(String[] args) {

        TreeMap<Integer, Friend> friendTreeMap = new TreeMap<>();
        friendTreeMap.put(1, new Friend("lee", 62));
        friendTreeMap.put(3, new Friend("Jay", 32));
        friendTreeMap.put(3, new Friend("Jay", 35));
        friendTreeMap.put(2, new Friend("Fin", 58));

        System.out.println(friendTreeMap.entrySet());//Повертає ключ значення

        System.out.println(friendTreeMap.floorEntry(3));//Повертає останнє ведення по ключу


    }

}

