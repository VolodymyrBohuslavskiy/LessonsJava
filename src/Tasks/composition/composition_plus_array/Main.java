package Tasks.composition.composition_plus_array;

import java.util.ArrayList;
import java.util.Objects;

//Стоврити клас машина
//        додати всі необхідні поля (обрати на свій розсуд, але не меньше 3x. (об'єм, швидкість, колір))
//        інкапсулувати характеристики
//        створити конструктори та гетери+сетери
//        Створити масив машин, пробігтись по ньому та вивести всі авто з червоним коліром та об'ємом більше 2х літрів

//        Створити класс попелющка ім'я вік розмір ноги
//        створити кілька попелюшок, покласти їх в масив
//        Створити класс принц  з полем туфелька
//        створити 1 об'єкт принца в якого э туфелька
//        знайти яка попелюшок повинна бути з принцом
public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> autos=new ArrayList<>();
        autos.add(new Auto(2.0,180,"red"));
        autos.add(new Auto(1.6,170,"gold"));
        autos.add(new Auto(1.8,190,"blue"));
        autos.add(new Auto(1.9,210,"yellow"));
        autos.add(new Auto(3.7,240,"gray"));
        autos.add(new Auto(5.5,220,"red"));

        for (Auto auto : autos) {
            if (Objects.equals(auto.getColor(), "red") && auto.getMass()>2.0){
                System.out.println(auto);
            }
        }

        ArrayList<Popelushka>popelushkas=new ArrayList<>();
        popelushkas.add(new Popelushka("One",18,38));
        popelushkas.add(new Popelushka("Two",19,40));
        popelushkas.add(new Popelushka("Tree",18,39));
        popelushkas.add(new Popelushka("Four",22,38));
        popelushkas.add(new Popelushka("Five",23,41));
        popelushkas.add(new Popelushka("Six",19,39));

        Prinz prinz = new Prinz(new Popelushka("Four", 22, 38));

        for (Popelushka popelushka : popelushkas) {
            if (popelushka.equals(prinz.getTufelkaOwner())) System.out.println(popelushka);
        }


    }

}
