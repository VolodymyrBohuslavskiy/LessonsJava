package Tasks.collections.ArrayList;


import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Engine jz = new Engine("JZ", 3.0, 350);
        Engine ls = new Engine("LS", 7.0, 750);
        Engine sms15 = new Engine("SMS15", 1.5, 86);

        Whill vossen = new Whill("Vossen", 20);
        Whill oz = new Whill("OZ", 18);
        Whill stok = new Whill(" ", 13);
        Whill stokKIA = new Whill(" ", 15);
        Whill stokZAZ = new Whill(" ", 14);
        Whill stokFORD = new Whill(" ", 16);

        Auto a1 = new Auto("lanos", "Gray", "AC 2312 CX", 2009, sms15, stokZAZ);
        Auto a2 = new Auto("Luaz", "green", "OL 5555 ON", 1985, ls, stok);
        Auto a3 = new Auto("Kalina", "red", "AS 8754 NR", 2006, jz, oz);
        Auto a4 = new Auto("Priora", "Gold", "OL 01010 OL", 1999, jz, vossen);
        Auto a5 = new Auto("Sierra", "Blue", "OH NONO NO", 1986, ls, stokFORD);
        Auto a6 = new Auto("Rio", "Black", "RI 0000 WF", 2014, sms15, stokKIA);
        Auto a7 = new Auto();

        ArrayList<Auto> autolist = new ArrayList<>();
        autolist.add(a1);
        autolist.add(a2);
        autolist.add(a3);
        autolist.add(a4);
        autolist.add(a5);
        autolist.add(a6);

//        Створити колекцію авто яка буде посортивана за роком випуску
//        Пройтись по коллекції, всі автівки які меньше 2000 року
//        змінити радіус колеса на одн меньше від поточного
//        всі автівки які старіше 2000 року пепефарбувати в зелений


        Comparator<Auto> ByYear = new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getYear() - o2.getYear();
            }
        };

        Comparator<Auto> ReByYear = new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o2.getYear() - o1.getYear();
            }
        };


        for (Auto auto : autolist) {
            System.out.println(auto.getModel() + " " + auto.getWhi().getSize() + " " + auto.getYear() + " " + auto.getColor());
        }

        System.out.println();


        autolist.sort(ByYear);

        for (Auto auto : autolist) {
            if (auto.getYear() > 2000) {
                auto.getWhi().setSize(auto.getWhi().getSize() - 1);
            }

        }


        for (Auto auto : autolist) {
            if ((auto.getYear()) <= 2000) {
                auto.setColor("NEW GREEN");
            }
        }
        for (Auto auto : autolist) {
            System.out.println(auto.getModel() + " " + auto.getWhi().getSize() + " " + auto.getYear() + " " + auto.getColor());
        }

//        Створити колекцію автівок
//        Пройтись по коллекції, всі автівки які меньше 2000 року скопіювати в окоему коллекцію, яка буде посортована
//        по року автівок в зростанні
//        Всі автівки , старіше 2000 року скопіювати в коллекцію ,яка буде посортована по року та спаданню
//


        ArrayList<Auto> oldautolist = new ArrayList<>();
        ArrayList<Auto> newautolist = new ArrayList<>();


        for (Auto auto : autolist) {
            if (auto.getYear() < 2000) {
                oldautolist.add(auto);
            }
        }

        for (Auto auto : autolist) {
            if (auto.getYear() > 2000) {
                newautolist.add(auto);
            }
        }

        oldautolist.sort(ReByYear);
        newautolist.sort(ByYear);

        System.out.println();
        for (Auto oldauto : oldautolist) {
            System.out.println(oldauto.getModel() + " " + oldauto.getYear());
        }
        System.out.println();
        for (Auto oldauto : newautolist) {
            System.out.println(oldauto.getModel() + " " + oldauto.getYear());
        }
//        "Склеїти " ці дві коллекції  в одну
        System.out.println();
       oldautolist.addAll(newautolist);

        for (Auto auto : oldautolist) {
            System.out.println(auto.getModel() +" "+ auto.getYear()+" "+auto.getColor());
        }

    }

}
