package Tasks.collections.list_Plus_class_ADAPTER;

//Існують наступні об'єкти.
//        Створити класи під них.+
//        Створити метод , який об'єднує об'єкти з однаковими id в єдиний об'єкт
//        і повертає вам цей список об'єктів.+
//        Класс під загальний об'єкт рписати самостійно. Він повинен містити тільки необхідні поля+

//        список 1
//        new Person(1,"vaysa",32);
//        new Person(2,"petya",31);
//        new Person(3,"kolya",30);
//        new Person(4,"anya",29);
//        new Person(5,"masha",28);
//        new Person(6,"andriy",30);
//        new Person(7,"maxim",31);
//        new Person(8,"vadym",32);
//        new Person(9,"taras",33);
//
//        список 2
//        new Auth(5,"login5","password5");
//        new Auth(2,"login2","password2");
//        new Auth(1,"login1","password1");
//        new Auth(7,"login7","password7");
//        new Auth(3,"login3","password3");
//        new Auth(4,"login4","password4");
//        new Auth(8,"login8","password8");
//        new Auth(6,"login6","password6");
//        new Auth(9,"login9","password9");

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

//        список 3 - це результат робботи методу який+
public class Main {
private static ArrayList<Person> Per =new ArrayList<>();
private static ArrayList<Auth> Acc =new ArrayList<>();
private static ArrayList<Acount> ALL =new ArrayList<>();


    public static void main(String[] args) {
        Per.add(new Person(1, "vaysa", 32));
        Per.add(new Person(2, "petya", 31));
        Per.add(new Person(3, "kolya", 30));
        Per.add(new Person(4, "anya", 29));
        Per.add(new Person(5, "masha", 28));
        Per.add(new Person(6, "andriy", 30));
        Per.add(new Person(7, "maxim", 31));
        Per.add(new Person(8, "vadym", 32));
        Per.add(new Person(9, "taras", 33));


        Acc.add(new Auth(5,"login5","password5"));
        Acc.add(new Auth(2,"login2","password2"));
        Acc.add(new Auth(1,"login1","password1"));
        Acc.add(new Auth(7,"login7","password7"));
        Acc.add(new Auth(3,"login3","password3"));
        Acc.add(new Auth(4,"login4","password4"));
        Acc.add(new Auth(8,"login8","password8"));
        Acc.add(new Auth(6,"login6","password6"));
        Acc.add(new Auth(9,"login9","password9"));



Frend();

ALL.forEach(acount -> System.out.println(acount.getName()+" "+acount.getAge()+" "+acount.getLogin()+" "+acount.getPasword()));

    }
private static ArrayList<Acount> Frend(){
    Per.sort(Comparator.comparingInt(Person::getId));
    Acc.sort(Comparator.comparingInt(Auth::getId));

    Iterator<Person> personIterator = Per.iterator();
    Iterator<Auth> authIterator = Acc.iterator();

    while (personIterator.hasNext() && authIterator.hasNext()){

        //Для кожного класу треба створити змінні ітератора authIterator.next() та personIterator.next()
        final Auth next = authIterator.next();
        final Person next1 = personIterator.next();

        //Після чого зєднуємо обєкти через білдер
        ALL.add(Acount.builder()
        .name(next1.getName())
        .age(next1.getAge())
        .login(next.getLogin())
        .pasword(next.getPasssword())
        .build());
    }
    return ALL;}



}
