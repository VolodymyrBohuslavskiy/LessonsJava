package Tasks.collections.mapTA;

//Клас людина:+
//        поля:+
//        вага,зріст+
//        Клас депутат(наслідується від людини):+
//        поля:+
//        прізвище,ім'я,вік,хабарник?,розмі хабаря+
//        методи:
//        дати хабаря(зробити відповідні перевірки...
//        якщо депутат не хабарник то щоб він відмовився,
//        або ж якщо сума хабаря надто велика то щоб він вагався
//        чи брати чи ні)+


//        Клас фракція
//        поля:
//        список депутатів

import java.util.*;

//        методи:
//        додати депутата (вводимо з клави)
//        видалити депутата(теж з клави)
//        видалити всіх негідників які брали хабаря
//        вивести найбільшого хабарника
//        вивести всіх депутатів
//        видалити всіх депутатів
//        вивести загальну суму хабарів для фракції

//        клас Верховна рада
//        поля:
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
    static private Map<Fraction, Deputat> Parlament = new HashMap<>();
    static private Set<Fraction> fractionsractions = new HashSet<>();

    public static void main(String[] args) {


    }

    private static Deputat AddDep() {
        return null;
    }


}
