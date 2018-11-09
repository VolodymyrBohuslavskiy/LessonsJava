package Books;

import java.util.Scanner;

public class main {
    static int i = 0;
    private static boolean wontExit = false;
    private static Scanner sc;

    public static void main(String[] args) {
        Book one = new Book("Книга-1", "Автор-1", 1995);
        Book two = new Book("Книга-2", "Автор-2", 1996);
        Book tree = new Book("Книга-3", "Автор-3", 1997);
        Book four = new Book("Книга-4", "Автор-4", 1998);
        Book five = new Book("Книга-5", "Автор-5", 1999);
        Book six = new Book("Книга-6", "Автор-6", 2000);
        Book seven = new Book("Книга-7", "Автор-7", 2001);
        Book eight = new Book("Книга-8", "Автор-8", 2002);
        Book nine = new Book("Книга-9", "Автор-9", 2003);
        Book ten = new Book("Книга-10", "Автор-10", 2004);

        Book[] kids = new Book[]{one, two, tree};
        Book[] romane = new Book[]{four, five, six};
        Book[] poezia = new Book[]{seven, eight, nine};

        poezia = ader(poezia, ten);

        Book[] obrani = new Book[]{one, seven, eight};

        Book[][] all = new Book[][]{kids, romane, poezia};



        while (!wontExit) {

            menu();
           /* Scanner sc;*/
            sc = new Scanner(System.in);

            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Зареєструвати книгу");
                    Exiter();
                    break;
                case 2:
                    System.out.println("Доступні книги:");
                    for (Book[] books : all) {
                        for (Book book : books) {
                            System.out.println(book.getName() + " автор:" + book.getAuthor() + " видано у " + book.getYer() + "р. ");
                        }
                    }
                    Exiter();
                    break;
                case 3:
                    Style(kids, romane, poezia);
                    Exiter();
                    break;
                case 4:
                    System.out.println("Перегляд по авторах:");
                    Exiter();
                    break;
                case 5:
                    System.out.println("Перегляд по роках:");
                    Exiter();
                    break;
                case 6:
                    System.out.println("Oбрані книги:");
                    for (Book book : obrani) {
                        System.out.println(book.getName() + " автор:" + book.getAuthor() + " видано у " + book.getYer() + "р. ");
                    }
                    Exiter();
                    break;

                case 7:
                    System.out.println("Бувай !");
                    wontExit = true;
                    break;
                default:
                    System.out.println("Оберіть розділ меню згідно порядкового номеру:");
            }
        }
        Sqar(10, 6);

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

    private static boolean Exiter() {
        System.out.println("1-Продовжити роботу 2-Вийти з програми");
        if (sc.nextInt() == 2) {
            System.out.println("Бувай !");
            return wontExit = true;
        }
        return false;
    }

}
