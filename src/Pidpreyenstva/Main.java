package Pidpreyenstva;

//        Замовник хоче отримати програму для реєстрації підприємствa.+

//        В кожному підприємстві є департаменти.+

//        В кожний департамент входить певна кількість працівників.+

//        Підприємство може добавляти департаменти, добавляти і звільняти працівників.+

//        Також може виводити статистику працівників які >=6 по шкалі кваліфікації,
//        а також <=5.+

//        Поля працівника:+
//        ім'я;+
//        рівень кваліфікації (від 1 до 10,де 1 не кваліфікований працівник, а 10 - кваліфікований );+

//        При створені працівника поле кваліфікації повинно заповнюватись рендомним значенням!!+


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static ArrayList<Pratsivnuk> pratsivnuks = new ArrayList<>();
    private static ArrayList<Departament> departaments = new ArrayList<>();
    private static Set<Pidpruyemstvo> pidpruyemstva = new HashSet<>();


    public static void main(String[] args) {
        ADDPidpruyemstvo("Revo");
        ADDepartament("Asia", "Revo");

        AddPratsivnuk("W", "Asia", "Revo");
        AddPratsivnuk("Z", "Asia", "Revo");
        AddPratsivnuk("A", "Asia", "Revo");
        AddPratsivnuk("C", "Asia", "Revo");
        AddPratsivnuk("R", "Asia", "Revo");
        AddPratsivnuk("Q", "Asia", "Revo");
        AddPratsivnuk("G", "Asia", "Revo");
        AddPratsivnuk("Y", "Asia", "Revo");

//        if (pidpruyemstva.contains(new Pidpruyemstvo("Revo")) && departaments.contains(new Departament("Asia"))) {
//            pratsivnuks.forEach(pratsivnuk -> System.out.println(pratsivnuk.getName() + " " + pratsivnuk.getEXP()));
//        }

        System.out.println("Good:");
        Statistic(true, "Asia", "Revo");
        System.out.println("Bad:");
        Statistic(false, "Asia", "Revo");


    }

    private static Set<Pidpruyemstvo> ADDPidpruyemstvo(String pidpruyemstvo) {
        pidpruyemstva.add(new Pidpruyemstvo(pidpruyemstvo));
        return pidpruyemstva;
    }

    private static ArrayList<Departament> ADDepartament(String departament, String pidpruyemstvo) {

        if (pidpruyemstva.contains(new Pidpruyemstvo(pidpruyemstvo))) {
            departaments.add(new Departament(departament));
        }
        return departaments;
    }

    private static ArrayList<Pratsivnuk> AddPratsivnuk(String name, String departament, String pidpruyemstvo) {
        if (pidpruyemstva.contains(new Pidpruyemstvo(pidpruyemstvo)) && departaments.contains(new Departament(departament))) {
            if (!pratsivnuks.contains(new Pratsivnuk(name, new Pidpruyemstvo(pidpruyemstvo), new Departament(departament)))) {
                pratsivnuks.add(new Pratsivnuk(name, new Pidpruyemstvo(pidpruyemstvo), new Departament(departament)));
            }
        }
        return pratsivnuks;
    }

    private static void Statistic(boolean good, String departament, String pidpruyemstvo) {
        ArrayList<Pratsivnuk> pra = new ArrayList<>();
        if (good) {
            for (Pratsivnuk pratsivnuk : pratsivnuks) {
                if (pratsivnuk.getPidpruyemstvo().equals(new Pidpruyemstvo(pidpruyemstvo))
                        && pratsivnuk.getDepartament().equals(new Departament(departament))
                        && pratsivnuk.getEXP() >= 6) {
                    pra.add(pratsivnuk);
                }
            }
        } else for (Pratsivnuk pratsivnuk : pratsivnuks) {
            if (pratsivnuk.getPidpruyemstvo().equals(new Pidpruyemstvo(pidpruyemstvo))
                    && pratsivnuk.getDepartament().equals(new Departament(departament))
                    && pratsivnuk.getEXP() <= 5) {
                pra.add(pratsivnuk);

            }
        }
        pra.forEach(pratsivnuk -> System.out.println(pratsivnuk.getEXP() + " " + pratsivnuk.getName()));
    }

}
