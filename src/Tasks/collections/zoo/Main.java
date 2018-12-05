package Tasks.collections.zoo;
//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;+
//        В мейн методі створити меню, яке буде реалізовувати наступні функції:
//        1) додати учасника в клуб;+
//        2) додати тваринку до учасника клубу.+
//        3) видалити тваринку з власника.+
//        4) видалити учасника клубу.+
//        5) видалити конкретну тваринку з усіх власників.+
//        6) вивести на екран зооклуб.+


import java.util.*;

public class Main {
    private static ArrayList<Person> people = new ArrayList<>();
    private static ArrayList<Pet> pets = new ArrayList<>();

    private static ArrayList<zooClub> zooClubs = new ArrayList<>();

    public static void main(String[] args) {
        addInUserInClud("r");

        addInUserInClud("V");
        addPetToPerson("r", "Bobik");
        addPetToPerson("r", "Sharik");
        addPetToPerson("r", "Vasyka");
        addPetToPerson("V", "Vasyka");
        addPetToPerson("V", "OlololV");
        addPetToPerson("V", "GorihV");

        delPetOfOwner("Bobik", "r");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        ShowAllZoo();


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        delPetOwner("r");
        ShowAllZoo();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        delThisPet("Vasyka");
        ShowAllZoo();

    }

    private static ArrayList<Person> addInUserInClud(String name) {
        people.add(new Person(name));
        return people;
    }

    private static ArrayList<zooClub> addPetToPerson(String name, String patname) {
        if (people.contains(new Person(name))) {
            pets.add(new Pet(patname, name));
            List<Pet> pets1 = new LinkedList<>();
            Map<Person, List<Pet>> club = new HashMap<>();
            club.put(new Person(name), pets1);
            zooClubs.add(new zooClub(club));
        }
        return zooClubs;
    }

    private static ArrayList<Pet> delPetOfOwner(String patname, String ownernane) {
        pets.
                removeIf(pet -> Objects.equals(pet.getOwner(), ownernane)
                        && Objects.equals(pet.getPetName(), patname));

        return pets;
    }

    private static ArrayList<Person> delPetOwner(String ownernane) {
        people.removeIf(person -> Objects.equals(person.getName(), ownernane));
        pets.removeIf(pet -> pet.getOwner().equals(ownernane));
        return people;
    }

    private static ArrayList<Pet> delThisPet(String patname) {
        pets.removeIf(pet -> pet.getPetName().equals(patname));
        return pets;
    }

    private static void ShowAllZoo() {
        pets.forEach(pet -> System.out.println(pet.getOwner() + " " + pet.getPetName()));
    }

}
