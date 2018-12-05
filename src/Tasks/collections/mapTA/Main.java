package Tasks.collections.mapTA;

//Клас людина:+
//        поля:+
//        вага,зріст+
//        Клас депутат(наслідується від людини):+
//        поля:+
//        прізвище,ім'я,вік,хабарник?,розмі хабаря+
//        методи:
//        дати хабаря(зробити відповідні перевірки.
//        якщо депутат не хабарник то щоб він відмовився,
//        або ж якщо сума хабаря надто велика то щоб він вагався
//        чи брати чи ні)+


//        Клас фракція
//        поля:+
//        список депутатів+

import java.util.*;

//        методи:
//        додати депутата (вводимо з клави)+
//        видалити депутата(теж з клави)+
//        видалити всіх негідників які брали хабаря+
//        вивести найбільшого хабарника+
//        вивести всіх депутатів+
//        видалити всіх депутатів+
//        вивести загальну суму хабарів для фракції

//        клас Верховна рада+
//        поля:+

//        мапа фракцій
//        методи:
//        додати\видалити фракцію
//        вивести всі фракції
//        вивести конкретну фракцію
//        додати\видалити депутата з фракції
//        вивести всіх хабарників фракції
//        вивести найбільшого хабарника у фрації
//        вивести найбільшого хабарника верховної ради
//        вивести фсіх депутатів фракції
//        вивести найбільшого хабарника фракції
//
//        в майні зробити через switch меню
//        1 - Верховна рада
//        2 - Фракція
//        3 - Депутат
//        відповідно при вводі з клави певної цифри ми попадаєио в інше меню
//        якщо ми нажали 1 то нам промалюється в консолі таке меню
//        1-додати фракцію
//        2-вивести всі фракції
//        3-вивести найбільшого хабарника
//        меню робимо на свій смак
public class Main {
    static private Map<Fraction, Deputat> parlament = new HashMap<>();
    static private Set<Fraction> fractionsractions = new HashSet<>();
    static private ArrayList<Deputat> deputats = new ArrayList<>();

    public static void main(String[] args) {

        addDep("Ohoho", new Deputat("Q", "G", 22));
        addDep("Ohoho", new Deputat("REe", "lees", 22, 200));
        addDep("Ohoho11", new Deputat("REevo", "leesoow", 23, 900));
        addDep("Ohohl", new Deputat("A", "A", 11));
//        deputats.forEach(deputat -> System.out.println(deputat.getName()));


        btideSummOfFraction("Ohoho11");


    }

    private static Map<Fraction, Deputat> addDep(String fraction, Deputat deputat) {
        deputats.add(deputat);
        ArrayList<Deputat> list = new ArrayList<>();
        final Fraction fraction1 = new Fraction(fraction, list);
        fractionsractions.add(fraction1);
        parlament.put(fraction1, deputat);
        return parlament;
    }

    private static Map<Fraction, Deputat> remoweDep(String name, String surname) {
        deputats.removeIf(deputat -> deputat.getName().equals(name) && deputat.getSurname().equals(surname));
        parlament.values().removeIf(deputat -> deputat.getName().equals(name) && deputat.getSurname().equals(surname));
        return parlament;
    }

    private static ArrayList<Deputat> removeBribe_takers() {
        deputats.removeIf(Deputat::isBribe_taker);
        parlament.values().removeIf(Deputat::isBribe_taker);
        return deputats;
    }

    private static void mostBribe_takers() {
        ArrayList<Deputat> bribeTakers = new ArrayList<>();
        deputats.stream().filter(Deputat::isBribe_taker)
                .sorted(Comparator.comparingInt(Deputat::getSizeOfBride))
                .forEach(deputat -> bribeTakers.add(deputat));
        System.out.println(bribeTakers.get(bribeTakers.size() - 1));
    }

    private static void showAll() {
        deputats.forEach(deputat -> System.out.println(deputat.getName() + " " + deputat.getSurname()));
    }

    private static Map<Fraction, Deputat> remoweAllDep() {
        deputats.clear();
        return parlament;
    }

    private static void btideSummOfFraction(String fraction) {
        ArrayList<Deputat> list = new ArrayList<>();
        for (Deputat deputat : deputats) {
            if (/*deputat.isBribe_taker() && */ fractionsractions.contains(fraction)){
                System.out.println(deputat);
            }
        }


//        System.out.println(list.size());

//            int sum = deputats.stream().mapToInt(Deputat::getSizeOfBride).sum();
    }

}


