package Tasks.Arrays.Atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //User
        Account ac1 = new Account("ac1", "1111", 1, 1280.5);

        //Scaner
        Scanner logpass;
        logpass = new Scanner(System.in);
        System.out.println("Enter login: ");
        String lo = logpass.nextLine();
        System.out.println("Enter password: ");
        String pa = logpass.nextLine();


        //Перевірка даних акаунту
        if (ac1.getLogin().equals(lo) && ac1.getPassword().equals(pa)) {

            //Привітання
            System.out.println("Welcome");
            //Можливсіть вийти
            boolean wontExit = false;
            while (!wontExit) {


//                Вибір операцій до виконання
                System.out.println();
                System.out.println("Choose any operation: ");
                // Menu_________________________________________________________________________
                Scanner sc;
                sc = new Scanner(System.in);
                String a = sc.nextLine();

                switch (a) {

                    case "Account Status":
                        System.out.println("Account balance is:");
                        System.out.println(ac1.getSum() + " grn");
                        break;

                    case "Take money":
                        System.out.println("Enter sum: ");
                        Scanner summa = new Scanner(System.in);
                        int sum = summa.nextInt();

                        if (sum > ac1.getSum()) {
                            System.out.println("The balance can not be negative");
                            System.out.println();
                        } else ac1.setSum(ac1.getSum() - sum);
                        System.out.println("Yor balance is " + ac1.getSum() + " grn");


                        break;

                    case "Put money":
                        System.out.println("Enter sum: ");
                        Scanner summa1 = new Scanner(System.in);
                        int sum1 = summa1.nextInt();
                        if (sum1 < 0) {
                            System.out.println("The sum can not be negative");
                            System.out.println();
                        } else ac1.setSum(ac1.getSum() + sum1);
                        System.out.println("Yor balance is " + ac1.getSum() + " grn");
                        break;

                    case "Exit":
                        System.out.println("See you soon !");
                        wontExit = true;
                        break;


                }

            }

        } else System.out.println("Check Login or password ");
    }
}
