package TellBook;
//Пишемо програму для реїстрації юзерів і їх телефон. ном.
//        (Тобто телефонну книгу)
//        Данні які потрібно записувати:
//        - ім'я
//        - прізвище
//        - тип контакту(напр. дом. ном. тел. або роб.)
//        - ном. телефона(може бути декілька)
//        Створити меню:
//        - створити нового юзера
//        - список юзерів
//        - видалити юзера
//        - змінити телефон
//        - вивести всю тел. книгу

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Scanner num = new Scanner(System.in);
    private static Scanner text = new Scanner(System.in);
    private static boolean wonExit = false;

    public static void main(String[] args) {


        HashSet<Tel> numbers = new HashSet<>();

        HashMap<Contact, Set<Tel>> telefoneBook = new HashMap<>();

        while (!wonExit) {
            Menu();
            int memuPunkt = num.nextInt();
            switch (memuPunkt) {
                case 1:
                    System.out.println("створити нового юзера:");
                    System.out.println("Імя:");
                    String name = text.nextLine();
                    System.out.println("Фамілія:");
                    String surname = text.nextLine();
                    System.out.println("Тип номера");
                    String type = text.nextLine();
                    System.out.println("Номер");
                    int qwe = num.nextInt();
                    ADDUSEER(telefoneBook, name, surname, AddTels(numbers, type, qwe));
                    Exiter();
                    break;

                case 2:
                    System.out.println("список юзерів");
                    ShowUserlist(telefoneBook);
                    Exiter();
                    break;

                case 3:
                    System.out.println("видалити юзера");
                    System.out.println("Імя:");
                    String name1 = text.nextLine();
                    System.out.println("Фамілія:");
                    String surname2 = text.nextLine();
                    DeleteUser(telefoneBook, name1, surname2);
                    System.out.println("Юзера видалено !");
                    Exiter();
                    break;

                case 4:
                    System.out.println("змінити телефон");
                    System.out.println("Імя:");
                    String name2 = text.nextLine();
                    System.out.println("Фамілія:");
                    String surname3 = text.nextLine();
                    System.out.println("Новий телефон:");
                    int b1 = num.nextInt();
                    System.out.println("Тип номера");
                    String type1 = text.nextLine();
                    ChangeNumber(numbers, telefoneBook, name2, surname3, type1, b1);
                    System.out.println("Номер користувача" + " " + name2 + " " + surname3 + " " + "змінено !");
                    Exiter();
                    break;

                case 5:
                    System.out.println("вивести всю тел. книгу");
                    System.out.println(telefoneBook);
                    Exiter();
                    break;

                case 6:
                    System.out.println("See you");
                    Main.wonExit = true;
                    break;
            }
        }
    }

    private static void Menu() {
        System.out.println("Оберіть пункт меню:\n" +
                "1-створити нового юзера:\n" +
                "2-список юзерів\n" +
                "3-видалити юзера\n" +
                "4-змінити телефон\n" +
                "5-вивести всю тел. книгу\n" +
                "6-Вийти");
    }

    private static boolean Exiter() {
        System.out.println("1-Продовжити, 2-Вийти з програми");
        int m = num.nextInt();
        if (m == 2) {
            System.out.println("Бувай !");
            return Main.wonExit = true;
        }
        if (m == 1) {
            return Main.wonExit = false;
        } else {
            System.out.println("Оберіть дію:");
            return Exiter();
        }
    }

    private static Set<Tel> AddTels(Set<Tel> n, String type, int num) {
        n.add(new Tel(type, num));
        return n;
    }

    private static HashMap<Contact, Set<Tel>> ADDUSEER(HashMap<Contact, Set<Tel>> id, String name, String surname, Set<Tel> num) {
        id.put(new Contact(name, surname), num);
        return id;
    }

    private static void ShowUserlist(HashMap a) {
        for (Object o : a.keySet()) {
            System.out.println(o);
        }
    }

    private static HashMap<Contact, Set<Tel>> DeleteUser(HashMap<Contact, Set<Tel>> a, String n, String s) {
        a.remove(new Contact(n, s));
        return a;
    }


    private static HashMap<Contact, Set<Tel>> ChangeNumber(Set<Tel> e, HashMap<Contact, Set<Tel>> a, String n, String s, String type, int telNew) {
        ADDUSEER(a, n, s, AddTels(e, type, telNew));
        return a;
    }



//Class
//    private static HashMap<Contact, Set<Tel>> AddUser(HashMap<Contact, Set<Tel>> a, String name, String
//            surname, Set<Tel> numbers) {
//        HashMap<Contact, Set<Tel>> telBook = new HashMap<>();
//        a.put(new Contact(name, surname), numbers);
//        return telBook;
//    }


//Copy
//    public static HashMap<Contact, Set<Tel>> AddUser(HashMap<Contact, Set<Tel>> a, String name, String surname) {
//
//        Set<Tel> numbers1 = new HashSet<>();
//        numbers1.add(new Tel("Мобільний", 975356802));
//        numbers1.add(new Tel("Домашній", 975356803));
//        numbers1.add(new Tel("Робочий", 975356804));
//
//        a.put(new Contact(name, surname), numbers1);
//        return a;
//    }


}
