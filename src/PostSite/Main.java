package PostSite;

//Замовник хоче отримати сайт для розмішення постів. Пости розміщуються звичайними юзерами.
//        Пости поділяются на два типи:
//        ті хто шукає роботу
//        ті хто пропонує роботу

//        Поля постів:
//        Заголовок
//        опис
//        країна(роботи)
//        місто(роботи)
//        телефон
//        ім'я автора поста
//        один автор може розмітити багато різних типів постів.

//        Створити меню:
//        - створити пост+
//        - переглянути всі пости+
//        - переглянути пости по типах+
//        - видалити пост+
//        - знайти пост певного типу в певному місті+

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static boolean wonExit = false;
    private static Scanner num = new Scanner(System.in);
    private static Scanner text = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Post> posts = new ArrayList<>();

        AddPostS(posts, "Кіт", "Куплю кота", "Укр", "Львів", "Назар", "102");
        AddPostP(posts, "Пес", "Продам песика", "Укр", "Стрий", "Микола", "103");
        AddPostS(posts, "Хом'як", "Куплю хом'яка", "Укр", "Моршин", "Іван", "104");
        AddPostP(posts, "Шиншила", "Продам шиншилу", "Укр", "Дрогобич", "Тарас", "105");



        while (!wonExit) {
            Menu();
            int a = Main.num.nextInt();
            switch (a) {
                case 1:
                    System.out.println("1.Продам 2.Куплю");
                    int b = Main.num.nextInt();
                    System.out.println("Імя:");
                    String name = text.nextLine();
                    System.out.println("Телефон:");
                    String tel = text.nextLine();
                    System.out.println("Заголовок:");
                    String titel = text.nextLine();
                    System.out.println("Оголошення:");
                    String text1 = text.nextLine();
                    System.out.println("Країна:");
                    String country = text.nextLine();
                    System.out.println("Місто:");
                    String city = text.nextLine();
                    switch (b) {
                        case 1:
                            AddPostP(posts, titel, text1, country, city, name, tel);
                            System.out.println("Пост додано !");
                            break;
                        case 2:
                            AddPostS(posts, titel, text1, country, city, name, tel);
                            System.out.println("Пост додано !");
                            break;
                        default:
                            System.out.println("Нічого не обрано");
                    }
                    Exiter();
                    break;

                case 2:
                    System.out.println("\nВсі пости:");
                    ShowAll(posts);
                    break;

                case 3:
                    System.out.println("\nПости по типах:\n 1.Попит 2.Пропозиція");
                    int d = num.nextInt();
                    switch (d) {
                        case 1:
                            ShowAllByType(posts, "Попит");
                            break;
                        case 2:
                            ShowAllByType(posts, "Пропозиція");
                            break;
                        default:
                            System.out.println("Нічого не обрано");
                            Exiter();
                    }
                    Exiter();
                    break;

                case 4:
                    System.out.println("Видалити пост"/*+" "+"Введіть ім'я:"*/);
//                    String name1 = text.nextLine();
                    System.out.println("Введіть загловок посту:");
                    String title = text.nextLine();
                    DelPostByTitle(posts, title);
//                    DelPost(posts, name1, title);
                    System.out.println("Пост " + title + " видалено!");
                    Exiter();
                    break;

                case 5:
                    System.out.println("знайти пост певного типу в певному місті\n Введіть місто:");
                    String city1 = text.nextLine();

                    System.out.println("1.Попит 2.Пропозиція");
                    int d1 = num.nextInt();
                    switch (d1) {
                        case 1:
                            ShowByCity_Type(posts, city1, "Surch");
                            Exiter();
                            break;
                        case 2:
                            ShowByCity_Type(posts, city1, "Promote");
                            Exiter();
                            break;
                        default:
                            System.out.println("Нічого не обрано");
                            Exiter();
                    }
                    break;

                case 6:
                    System.out.println("Бувай !");
                    wonExit = true;
                    break;

                default:
                    System.out.println("Оберіть пункт меню:");

            }
        }

    }

    private static void Menu() {
        System.out.println("1.створити пост\n2.переглянути всі пости\n3.переглянути пости по типах\n4.видалити пост\n5.знайти пост певного типу в певному місті\n6.Вихід");
    }

    private static boolean Exiter() {
        System.out.println("1.Продовжити 2.Вийти");
        int ext = num.nextInt();
        switch (ext) {
            case 1:
                wonExit = false;
                break;
            case 2:
                System.out.println("Бувай !");
                wonExit = true;
                break;
            default:
                Exiter();
        }
        return wonExit;
    }

    private static ArrayList<Post> AddPostP(ArrayList<Post> posts, String titel, String text, String Country, String city, String name, String tel) {
        Promote p = new Promote(titel, text, new Location(Country, city), new Author(name, tel));
        if (!posts.contains(p)) {
            posts.add(p);
        }
        return posts;
    }

    private static ArrayList<Post> AddPostS(ArrayList<Post> posts, String titel, String text, String Country, String city, String name, String tel) {
        Surch p = new Surch(titel, text, new Location(Country, city), new Author(name, tel));
        if (!posts.contains(p)) {
            posts.add(p);
        }
        return posts;
    }

    private static void ShowAll(ArrayList<Post> posts) {
        for (Post post : posts) {
            System.out.println(post.getTitel() + " " + post.getText() + " " + post.getUser().getName() + " " + post.getUser().getTel() + " " + post.getLocation().getCity() + " " + post.getLocation().getCountry());
        }
    }

    private static void ShowAllByType(ArrayList<Post> posts, String type) {
        for (Post post : posts) {
            if (Objects.equals(post.getType(), "Surch") && Objects.equals(type, "Попит")) {
                System.out.println(post);
            }
            if (Objects.equals(post.getType(), "Promote") && Objects.equals(type, "Пропозиція")) {
                System.out.println(post);
            }
        }
    }

    private static ArrayList<Post> DelPostByTitle(ArrayList<Post> posts, String titel) {
        posts.removeIf(post -> Objects.equals(post.getTitel(), titel));
        return posts;
    }

    private static void ShowByCity_Type(ArrayList<Post> posts, String city, String type) {
        for (Post post : posts) {
            if (Objects.equals(post.getLocation().getCity(), city) && Objects.equals(post.getType(), type)){
                System.out.println(post);
            }
        }
    }

}




