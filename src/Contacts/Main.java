package Contacts;


import Books.Book;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        Пишемо програму для реїстрації юзерів і їх телефон. ном.
//        (Тобто телефонну книгу)
//        Данні які потрібно записувати:
//        - ім'я
//                - прізвище
//                - тип контакту(напр. дом. ном. тел. або роб.)
//                - ном. телефона(може бути декілька)
//        Створити меню:
//        - створити нового юзера
//        - список юзерів
//                - видалити юзера
//                - змінити телефон
//                - вивести всю тел. книгу


        Map<ContactName, ContactNumber> Book = new HashMap<>();
        Book.put(new ContactName("John"), new ContactNumber("1", "112"));
        Book.put(new ContactName("Gregor"), new ContactNumber("2", "113"));
        Book.put(new ContactName("Ralph"), new ContactNumber("4", "115"));
        Book.put(new ContactName("Gregor"), new ContactNumber("3", "114"));
        Book.put(new ContactName("Ralph"), new ContactNumber("5", "116"));

        System.out.println(Book.entrySet());
        //   Book.remove(new ContactName("Ralph"));
//
//        ContactNumber u = Book.get(new ContactName("Gregor"));
//        if (u.getType()=="1") {
//            u.setNumber("123");
//        }








    }


    private static ContactName AddName(String name) {
        return new ContactName(name);
    }

    private static ContactNumber AddNumber(String type, String number) {
        return new ContactNumber(type, number);
    }


    private static Map<ContactName, ContactNumber> AddContact(Map<ContactName, ContactNumber> Book, String name, String numberType, String number) {
        return (Map<ContactName, ContactNumber>) Book.put(AddName(name), AddNumber(numberType, number));
    }

    private static void ContactList(Map<ContactName, ContactNumber> Book) {
        for (ContactName contactName : Book.keySet()) {
            System.out.println(contactName.getName());
        }
    }


}
