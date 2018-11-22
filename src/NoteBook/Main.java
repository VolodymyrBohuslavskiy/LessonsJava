package NoteBook;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//Створити програму для запису нотаток
//        поля нотаток:
//        - назва+
//        - текст+
//        - дата+
//        - місце+
//        - контакт+

//        - тип нотатки(подія, зустріч, нотатка, д.н)+

//        Меню програми:
//        - реєстрація або вхід юзера+
//        - створити нотатку+

//        - переглянути(якщо вже є нотатки, якщо в цього
//        юзера немає нотаток цей пункт не виводити)+

//        - переглянути по типах(аналогічно попередньому)+

//        Юзер поля:
//        - login+
//        - password+

//        Створити інтерфейс з одним методом, який підраховує кількість постів
//        кожного типу і виводить це значення біля кожного типу, наприклад:
//        1) подія (5)<-методом обраховується
//        2) зустріч (3)<-методом обраховується
//        3)...

//        нотатка повинна створюватись класом builder+


public class Main implements CalculatePOST {
    private static boolean wonExit = false;

    private static Scanner scannerNUM = new Scanner(System.in);
    private static Scanner scannerTEXT = new Scanner(System.in);

    private static String login;
    private static String password;

    private static ArrayList<Post> posts = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {

        Add_Birthday("w", "w", "BD", "", "q");
        Add_Event("w", "w", "Ev", "", "q");
        Add_Meeting("w", "w", "M", "", "q", "d");
        Add_Event("w", "w", "Ev", "", "q");
        Add_Note("w", "w", "N", "", "q");

        Add_Birthday("f", "wqcsaxas", "BD", "", "q");
        Add_Event("t", "qwdwqd", "Ev", "", "q");
        Add_Meeting("g", "qwf", "M", "", "q", "d");
        Add_Event("sa", "qwd", "Ev", "", "q");
        Add_Note("wfsa", "wqd", "N", "", "q");

        while (!wonExit) {
            System.out.println("Оберіть дію: 1.Вхід 2.Реєстрація 3.Вихід");
            int one1 = scannerNUM.nextInt();
            switch (one1) {
                case 1:
                    System.out.println("Вхід\nВведіть логін");
                    login = scannerTEXT.nextLine();

                    System.out.println("Введіть пароль");
                    password = scannerTEXT.nextLine();
                    if (Authorization(login, password)) {
                        while (IsUserEmpty()) {
                            MenuForEnptyUser();
                        }
                        MenuForUser();
                    } else System.out.println("Не вірний пароль чи логін повторіть спробу");
                    break;
                case 2:
                    System.out.println("Реєстрація\nВведіть логін");
                    String logReg = scannerTEXT.nextLine();
                    System.out.println("Введіть пароль");
                    String PassReg = scannerTEXT.nextLine();
                    AddUser(logReg, PassReg);
                    System.out.println("Користувача " + logReg + " створено !");
                    break;
                default:
                    Exiter();
            }
        }
    }

    private static boolean Authorization(String login, String password) {
        if (users.contains(new User(login, password))) return true;
        return false;
    }

    private static ArrayList<Post> Add_Event(String log, String pass, String title, String plase, String date) {
        AddUser(log, pass);
        Post post = Post.builder().title(title).plase(plase).date(date).noteType(NoteType.EVENT).user(new User(log, pass)).build();
        if (!posts.contains(post)) posts.add(post);
        return posts;
    }

    private static ArrayList<Post> Add_Meeting(String log, String pass, String title, String plase, String date, String contact) {
        AddUser(log, pass);
        Post post = Post.builder().title(title).plase(plase).date(date).noteType(NoteType.MEETING).user(new User(log, pass)).contact(contact).build();
        if (!posts.contains(post)) posts.add(post);
        return posts;
    }

    private static ArrayList<Post> Add_Note(String log, String pass, String title, String text, String date) {
        AddUser(log, pass);
        Post post = Post.builder().title(title).text(text).date(date).noteType(NoteType.NOTE).user(new User(log, pass)).build();
        if (!posts.contains(post)) posts.add(post);
        return posts;
    }

    private static ArrayList<Post> Add_Birthday(String log, String pass, String title, String contact, String date) {
        AddUser(log, pass);
        Post post = Post.builder().title(title).contact(contact).date(date).noteType(NoteType.BD).user(new User(log, pass)).build();
        if (!posts.contains(post)) posts.add(post);
        return posts;
    }

    private static ArrayList<User> AddUser(String log, String pass) {
        if (!users.contains(new User(log, pass))) {
            users.add(new User(log, pass));
        }
        return users;
    }

    private static boolean Exiter() {
        System.out.println("1.Продовжити 2.Вийти");
        int ex1 = scannerNUM.nextInt();
        switch (ex1) {
            case 1:
                wonExit = false;
                break;

            case 2:
                System.out.println("Бувай !");
                wonExit = true;
                break;
            default:
                System.out.println("Оберіть щось !");
        }
        return wonExit;
    }

    private static void MenuForUser() {

        while (!wonExit) {
            int a = +Calculate1(NoteType.BD) + Calculate1(NoteType.MEETING) + Calculate1(NoteType.EVENT) + Calculate1(NoteType.NOTE);
            System.out.println("1.Створити нотаткy\n2.Переглянути нотатки (" + a + ")\n3.Вивести нотатки по типах");
            int x1 = scannerNUM.nextInt();
            switch (x1) {
                case 1:
                    System.out.println("1.Подія 2.Зустріч 3.Нотатка 4.Деньнародження 5.Вийти");
                    int x2 = scannerNUM.nextInt();
                    switch (x2) {
                        case 1:
                            System.out.println("Подія\nНазва:");
                            String name = scannerTEXT.nextLine();
                            System.out.println("Місце:");
                            String place = scannerTEXT.nextLine();
                            System.out.println("Дата:");
                            String date = scannerTEXT.nextLine();
                            Add_Event(login, password, name, place, date);
                            System.out.println("Подія " + name + " створено");
                            break;
                        case 2:
                            System.out.println("Зустріч\nНазва:");
                            String name1 = scannerTEXT.nextLine();
                            System.out.println("Місце:");
                            String place1 = scannerTEXT.nextLine();
                            System.out.println("Дата:");
                            String date1 = scannerTEXT.nextLine();
                            System.out.println("Із ким заплановано зустріч:");
                            String contact1 = scannerTEXT.nextLine();
                            Add_Meeting(login, password, name1, place1, date1, contact1);
                            System.out.println("Подія " + name1 + " створено");
                            break;
                        case 3:
                            System.out.println("Нотатка\nНазва:");
                            String name2 = scannerTEXT.nextLine();
                            System.out.println("Нотатка:");
                            String note2 = scannerTEXT.nextLine();
                            System.out.println("Дата:");
                            String date2 = scannerTEXT.nextLine();
                            Add_Note(login, password, name2, note2, date2);
                            System.out.println("Подія " + name2 + " створено");
                            break;

                        case 4:
                            System.out.println("День народження\nНазва:");
                            String name3 = scannerTEXT.nextLine();
                            System.out.println("Імя іменинника:");
                            String contact3 = scannerTEXT.nextLine();
                            System.out.println("Дата:");
                            String date3 = scannerTEXT.nextLine();
                            Add_Birthday(login, password, name3, contact3, date3);
                            System.out.println("Подія " + name3 + " створено");
                            break;
                        default:
                            System.out.println("Оберіть");
                    }
                    Exiter();
                    break;

                case 2:

                    System.out.println("Усі нотатки");
                    for (Post post : posts) {
                        if (Objects.equals(post.getUser().getLogin(), login) && Objects.equals(post.getUser().getPassword(), password))
                            System.out.println(post);
                    }
                    Exiter();
                    break;

                case 3:
                    System.out.println("1.Подія (" + Calculate1(NoteType.EVENT) + ")| 2.Зустріч (" + Calculate1(NoteType.MEETING) + ")| 3.Нотатка (" + Calculate1(NoteType.NOTE) +")| 4.Деньнародження ("+Calculate1(NoteType.BD)+")");
                    int x3 = scannerNUM.nextInt();

                    switch (x3) {
                        case 1:
                            posts.forEach(post -> {
                                if (post.noteType.equals(NoteType.EVENT) && Objects.equals(post.getUser().getLogin(), login) && Objects.equals(post.getUser().getPassword(), password))
                                    System.out.println(post);
                            });
                            Exiter();
                            break;

                        case 2:
                            posts.forEach(post -> {
                                if (post.noteType.equals(NoteType.MEETING) && Objects.equals(post.getUser().getLogin(), login) && Objects.equals(post.getUser().getPassword(), password))
                                    System.out.println(post);
                            });
                            Exiter();
                            break;

                        case 3:
                            posts.forEach(post -> {
                                if (post.noteType.equals(NoteType.NOTE) && Objects.equals(post.getUser().getLogin(), login) && Objects.equals(post.getUser().getPassword(), password))
                                    System.out.println(post);
                            });
                            Exiter();
                            break;

                        case 4:
                            posts.forEach(post -> {
                                if (post.noteType.equals(NoteType.BD) && Objects.equals(post.getUser().getLogin(), login) && Objects.equals(post.getUser().getPassword(), password))
                                    System.out.println(post);
                            });
                            Exiter();
                            break;

                        case 5:
                            Exiter();
                        default:
                            System.out.println("Оберіть");
                    }
                    break;
                default:
                    System.out.println("Оберіть");
                    Exiter();
            }
        }
    }

    private static void MenuForEnptyUser() {

        while (!wonExit) {

            System.out.println("Додайте нотатку прямо зараз\n1.Подія 2.Зустріч 3.Нотатка 4.Деньнародження 5.Вийти");
            int x2 = scannerNUM.nextInt();
            switch (x2) {
                case 1:
                    System.out.println("Подія\nНазва:");
                    String name = scannerTEXT.nextLine();
                    System.out.println("Місце:");
                    String place = scannerTEXT.nextLine();
                    System.out.println("Дата:");
                    String date = scannerTEXT.nextLine();
                    Add_Event(login, password, name, place, date);
                    System.out.println("Подія " + name + " створено");
                    break;
                case 2:
                    System.out.println("Зустріч\nНазва:");
                    String name1 = scannerTEXT.nextLine();
                    System.out.println("Місце:");
                    String place1 = scannerTEXT.nextLine();
                    System.out.println("Дата:");
                    String date1 = scannerTEXT.nextLine();
                    System.out.println("Із ким заплановано зустріч:");
                    String contact1 = scannerTEXT.nextLine();
                    Add_Meeting(login, password, name1, place1, date1, contact1);
                    System.out.println("Подія " + name1 + " створено");
                    break;
                case 3:
                    System.out.println("Нотатка\nНазва:");
                    String name2 = scannerTEXT.nextLine();
                    System.out.println("Нотатка:");
                    String note2 = scannerTEXT.nextLine();
                    System.out.println("Дата:");
                    String date2 = scannerTEXT.nextLine();
                    Add_Note(login, password, name2, note2, date2);
                    System.out.println("Подія " + name2 + " створено");
                    break;

                case 4:
                    System.out.println("День народження\nНазва:");
                    String name3 = scannerTEXT.nextLine();
                    System.out.println("Імя іменинника:");
                    String contact3 = scannerTEXT.nextLine();
                    System.out.println("Дата:");
                    String date3 = scannerTEXT.nextLine();
                    Add_Birthday(login, password, name3, contact3, date3);
                    System.out.println("Подія " + name3 + " створено");
                    break;
                default:
                    System.out.println("Оберіть");
            }
            Exiter();
            break;
        }
    }

    private static boolean IsUserEmpty() {
        ArrayList<Post> list = new ArrayList<>();
        for (Post post : posts) {
            if (post.getUser().getLogin().equals(login) && post.getUser().getPassword().equals(password)) {
                list.add(post);
            }
        }
        return list.isEmpty();
    }

    private static int Calculate1(NoteType type) {
        ArrayList<Post> list = new ArrayList<>();
        for (Post post : posts) {
            if (post.getUser().getLogin().equals(login) && post.getUser().getPassword().equals(password) && post.getNoteType().equals(type)) {
                list.add(post);
            }
        }
        return list.size();
    }

    @Override
    public int Calculate(NoteType type) {
        return 0;
    }
}
