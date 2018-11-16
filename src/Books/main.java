package Books;

import java.util.Scanner;

public class main {
    static int i = 0;
    private static boolean wontExit = false;
    private static Scanner sc;
    private static Scanner text;

    public static void main(String[] args) {
        Book one = new Book("Книга-1", "Автор-1", 2004);
        Book two = new Book("Книга-2", "Автор-1", 2002);
        Book tree = new Book("Книга-3", "Автор-1", 2009);
        Book four = new Book("Книга-4", "Автор-2", 2009);
        Book five = new Book("Книга-5", "Автор-2", 2004);
        Book six = new Book("Книга-6", "Автор-2", 2009);
        Book seven = new Book("Книга-7", "Автор-3", 2004);
        Book eight = new Book("Книга-8", "Автор-3", 2002);
        Book nine = new Book("Книга-9", "Автор-3", 2002);

        Book ten = new Book("Книга-10", "Автор-10", 2004);


        Book[] kids = new Book[]{one, two, tree};
        Book[] romane = new Book[]{four, five, six};
        Book[] poezia = new Book[]{seven, eight, nine};

        poezia = ader(poezia, ten);

        Book[][] Yer = new Book[][]{{two, eight, nine}, {one, five, seven}, {tree, four, six}};

        Book[][] Author = new Book[][]{{one, two, tree}, {four, five, six}, {seven, eight, nine}};

        Book[] obrani = new Book[]{one, seven,};

        Book[][] all = new Book[][]{kids, romane, poezia};

        Sqar(3, 12);

        while (!wontExit) {

            menu();
            sc = new Scanner(System.in);
            text = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    Reged();
                    ShowBy(all);
                    Exiter();
                    break;
                case 2:
                    System.out.println("Доступні книги:");
                    ShowBy(all);
                    Exiter();
                    break;
                case 3:
                    Style(kids, romane, poezia);
                    Exiter();
                    break;
                case 4:
                    System.out.println("Перегляд по авторах:");
                    ShowBy(Author);
                    Exiter();
                    break;
                case 5:
                    System.out.println("Перегляд по роках:");
                    ShowBy(Yer);
                    Exiter();
                    break;
                case 6:
                    System.out.println("Oбрані книги:");
                    ShowBy(obrani);
                    Exiter();
                    break;

                case 7:
                    System.out.println("Бувай !");
                    wontExit = true;
                default:
                    System.out.println("Оберіть розділ меню згідно порядкового номеру:");
            }
        }


    }

    private static void menu() {
        System.out.println(
                "1 Зареєструвати книгу\n" +
                        "2 Переглянути всі\n" +
                        "3 Перегляд по жанрах\n" +
                        "4 Перегляд по авторах\n" +
                        "5 Перегляд по роках\n" +
                        "6 Обрані книги\n" +
                        "7 Вихід");
    }

    private static void Style(Book[] a, Book[] b, Book[] c) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Доступні жанри:");
        System.out.println("1-Дитячі");
        System.out.println("2-Романи");
        System.out.println("3-Поезії");

        int ganr = sc.nextInt();
        switch (ganr) {
            case 1:
                for (Book kid : a) {
                    System.out.println(kid.getName() + " " + kid.getAuthor() + " " + kid.getYer());
                }
                break;
            case 2:
                for (Book rom : b) {
                    System.out.println(rom.getName() + " " + rom.getAuthor() + " " + rom.getYer());
                }
                break;
            case 3:
                for (Book poez : c) {
                    System.out.println(poez.getName() + " " + poez.getAuthor() + " " + poez.getYer());
                }
                break;
            default:
                Style(a, b, c);
        }

    }

    private static Book[] ader(Book[] arrOld, Book nEw) {
        Book[] arrnew = new Book[arrOld.length + 1];
        System.arraycopy(arrOld, 0, arrnew, 0, arrOld.length);
        arrnew[arrOld.length] = nEw;
        return arrOld;
    }

    private static boolean Exiter() {
        System.out.println("1-Продовжити роботу 2-Вийти з програми");
        if (sc.nextInt() == 2) {
            System.out.println("Бувай !");
            return wontExit = true;
        }
        return false;
    }

    private static Book Reged() {
        System.out.println("Зареєструвати книгу");
        System.out.println("Назва книги:");
        String name = text.nextLine();
        System.out.println("Автор:");
        String author = text.nextLine();
        System.out.println("Рік:");
        int year = sc.nextInt();

        System.out.println("Нова книга: " + name + " " + author + " " + year);
        Book ell = new Book(name, author, year);
        return ell;
    }


    private static void ShowBy(Book[][] a) {
        for (Book[] books : a) {
            for (Book book : books) {
                System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getYer());
            }
        }

    }

    private static void ShowBy(Book[] a) {
        for (Book book : a) {
            System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getYer());
        }

    }

    private static void Sqar(int a, char s) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print(s + " ");
                } else {
                    if (j == 0 || j == a - 1) {
                        System.out.print(s + " ");
                    } else {
                        System.out.print(' ' + " ");
                    }
                }
            }
            System.out.print("\n");
        }
    }

    private static void Sqar(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print('*' + " ");
                } else {
                    if (j == 0 || j == b - 1) {
                        System.out.print('*' + " ");
                    } else {
                        System.out.print(' ' + " ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
