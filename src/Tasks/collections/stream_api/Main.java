package Tasks.collections.stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Далі
//        1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010+
//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник Китай+
//        3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник не Китай+
//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб+
//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7+
//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною+

        final Procesor i7 = new Procesor(8, 3.4, CountryOfManufacture.USA);
        final Procesor i5 = new Procesor(4, 2.4, CountryOfManufacture.KOREA);
        final Procesor i3 = new Procesor(2, 2.2, CountryOfManufacture.CHINA);
        final Procesor QardCore = new Procesor(4, 2.4, CountryOfManufacture.INDIA);

        final ROM rom500 = new ROM("rom500", ROMtype.SSD, 500, CountryOfManufacture.INDIA);
        final ROM rom1000 = new ROM("rom1000", ROMtype.HDD, 1000, CountryOfManufacture.USA);
        final ROM rom2000 = new ROM("rom2000", ROMtype.SSD, 2000, CountryOfManufacture.KOREA);

        ArrayList<Computer> computers = new ArrayList<>();

        computers.add(new Computer("E11", 2009, 4, 1400, new ROM("rom1", ROMtype.HDD, 500, CountryOfManufacture.CHINA), new Procesor(4, 2.4, CountryOfManufacture.CHINA)));
        computers.add(new Computer("E12", 2015, 6, 1900, new ROM("rom2", ROMtype.SSD, 100, CountryOfManufacture.INDIA), new Procesor(2, 2.9, CountryOfManufacture.USA)));
        computers.add(new Computer("E13", 2010, 4, 1500, new ROM("rom1", ROMtype.HDD, 500, CountryOfManufacture.CHINA), new Procesor(4, 2.4, CountryOfManufacture.CHINA)));
        computers.add(new Computer("E14", 2015, 4, 1600, rom1000, i7));
        computers.add(new Computer("E15", 2010, 8, 1400, rom500, QardCore));
        computers.add(new Computer("E16", 2009, 4, 1900, rom2000, i5));
        computers.add(new Computer("E17", 2015, 10, 1400, rom500, i7));
        computers.add(new Computer("E18", 2010, 8, 1400, rom1000, i3));
        computers.add(new Computer("E19", 2009, 4, 1000, rom500, i7));
        computers.add(new Computer("E20", 2015, 6, 900, rom500, i5));
        computers.add(new Computer("E21", 2010, 4, 1000, rom1000, QardCore));
        computers.add(new Computer("E22", 2015, 10, 1200, rom2000, i7));
        computers.add(new Computer("E23", 2010, 2, 1800, rom500, i5));
        computers.add(new Computer("E24", 2009, 8, 1700, rom1000, i3));
        computers.add(new Computer("E25", 2015, 10, 2000, rom2000, i7));
        computers.add(new Computer("E26", 2009, 2, 1040, rom1000, QardCore));
        computers.add(new Computer("E27", 2010, 1, 1400, rom500, i5));
        computers.add(new Computer("E28", 2009, 10, 1100, rom2000, i7));
        computers.add(new Computer("E29", 2015, 4, 1110, rom1000, i3));
        computers.add(new Computer("E30", 2009, 2, 1410, rom500, QardCore));

        System.out.println("\n1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010");
        computers.stream().filter(computer -> computer.getYear() < 2010).forEach(System.out::println);

        System.out.println("\n2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник Китай");

        computers.stream()
                .filter(computer -> computer.getYear() > 2010)
                .filter(computer -> computer.getProcesor().getProcManufacture() == CountryOfManufacture.CHINA)
                .forEach(System.out::println);

        System.out.println("\n3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник не Китай");

        computers.stream()
                .filter(computer -> computer.getYear() > 2010)
                .filter(computer -> computer.getProcesor().getProcManufacture() != CountryOfManufacture.CHINA)
                .forEach(System.out::println);

        System.out.println("\n4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб");

        computers.stream().filter(computer -> computer.getRom().getRomMas() > 500)
                .forEach(System.out::println);

        System.out.println("\n5.Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7");

        computers.stream()
                .filter(computer -> computer.getRom().getRoMtype() == ROMtype.SSD)
                .filter(computer -> computer.getRom().getRomMas() > 500)
                .filter(computer -> computer.getProcesor() == i7)
                .forEach(System.out::println);

        System.out.println("\n6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною");

        computers.stream()
                .filter(computer -> computer.getRom().getRoMtype() == ROMtype.SSD)
                .filter(computer -> computer.getRom().getRomMas() > 500)
                .filter(computer -> computer.getProcesor() == i7)
                .sorted(Comparator.comparingInt(Computer::getCost))
                .forEach(System.out::println);

//        Створити DAO -прошарок з CRUD операціями, які будуть записувати+
//        контакти до БД (в данному випадку у LinkedList)+
//        -Створити 10 конатків (2 з яких будуть однаковими)+
//        -занести їх в базу.-
//        -знайти всі унікальні контакти+
//        -знайти всі унікальні контакти з певного департаменту.+
//        -знайти всі унікальні контакти з певного департаменту
//        посортувавши їх по імейлу .+
//        -знайти всі унікальні контакти згрупувавши їх по компанії +

        System.out.println("\nКонтакти:\n");

        LinkedList<Contact> contacts = new LinkedList<>();
        contacts.add(new Contact(1, "Rod", Company.Apple, "Zoo", "Zoo@.gmail.com", "102", Departament.factory));
        contacts.add(new Contact(7, "Silvester", Company.Intel, "Rero", "Rero@.gmail.com", "108", Departament.tech));
        contacts.add(new Contact(5, "One", Company.Apple, "Zeno", "Zeno@.gmail.com", "106", Departament.factory));
        contacts.add(new Contact(6, "Nick", Company.Microsoft, "Reno", "Reno@.gmail.com", "107", Departament.tech));
        contacts.add(new Contact(4, "Piter", Company.Intel, "Eoo", "Eoo@.gmail.com", "105", Departament.tech));
        contacts.add(new Contact(2, "Mike", Company.Intel, "Yoo", "YZoo@.gmail.com", "103", Departament.support));
        contacts.add(new Contact(3, "Jak", Company.Microsoft, "Too", "Too@.gmail.com", "104", Departament.factory));
        contacts.add(new Contact(9, "Homer", Company.Apple, "Neo", "AHeo@.gmail.com", "110", Departament.support));
        contacts.add(new Contact(8, "Apu", Company.Microsoft, "Pedro", "Pedro@.gmail.com", "109", Departament.factory));

        contacts.add(new Contact(1, "Rod", Company.Apple, "Zoo", "Zoo@.gmail.com", "102", Departament.factory));

        System.out.println("-знайти всі унікальні контакти");
        contacts.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n-знайти всі унікальні контакти з певного департаменту.");
        contacts.stream()
                .distinct()
                .filter(contact -> contact.getDepartament()
                        .equals(Departament.support)).forEach(System.out::println);

        System.out.println("\nзнайти всі унікальні контакти з певного департаменту посортувавши їх по імейлу ");
        contacts.stream()
                .distinct()
                .filter(contact -> contact.getDepartament()
                        .equals(Departament.support))
                .sorted(Comparator.comparingInt(o -> o.getEmail().hashCode()))
                .forEach(System.out::println);

        System.out.println("\n-знайти всі унікальні контакти згрупувавши їх по компанії !!!!");
        contacts.stream()
                .distinct()
                .filter(contact -> contact.getCompany()
                        .equals(Company.Apple))
                .sorted(Comparator.comparingInt(o -> o.getEmail().hashCode()))
                .forEach(System.out::println);


    }
}
