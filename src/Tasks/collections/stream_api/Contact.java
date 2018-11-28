package Tasks.collections.stream_api;

//Створити класс Контакт
//        -id+
//        -name+
//        -company (Enum -> Intel, Microsoft, Apple)+
//        -surname+
//        -email+
//        -phone+
//        -department (Enum -> tech, support , factory)

import lombok.AllArgsConstructor;
import lombok.Data;

//        Створити DAO -прошарок з CRUD операціями, які будуть записувати
//        контакти до БД (в данному випадку у LinkedList)
//        -Створити 10 конатків (2 з яких будуть однаковими)
//        -занести їх в базу.
//        -знайти всі унікальні контакти
//        -знайти всі унікальні контакти з певного департаменту.
//        -знайти всі унікальні контакти з певного департаменту
//        посортувавши їх по імейлу .
//
//        -знайти всі унікальні контакти згрупувавши їх по компанії !!!!
@AllArgsConstructor
@Data

class Contact {
    private int id;
    private String name;
    private Company company;
    private String surname,email,phone;
    private Departament departament;
}

enum Company{
    Intel, Microsoft, Apple
}
enum Departament{
    tech, support , factory
}