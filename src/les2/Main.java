package les2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i < 3) {
            System.out.print("Yea ");
            i++;
        }
        System.out.println();
        do {
            System.out.print("yw");
            i++;
        } while (i < 3);

        for (int j = 0; j < 10; j++) {
            System.out.print(j);

        }
        System.out.println();

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(Arrays.toString(arr1)+" ");

        User user1 = new User("One", "0000001", "Nice", 1, 11.1);
        User user2 = new User("Two", "0000002", "Moran", 2, 22.2);
        User user3 = new User("Three", "0000003", "Moran", 3, 33.3);
        User user4 = new User("Four", "0000004", "Nice", 4, 44.4);
        User user5 = new User("Fifth", "0000005", "Moran", 5, 55.5);
        User user6 = new User("Third", "0000006", "Nice", 6, 66.6);
        User user7 = new User("Seventh", "0000007", "Moran", 7, 77.7);
        User user8 = new User("Eight", "0000008", "Nice", 8, 88.8);
        User user9 = new User("Ninth", "0000009", "Moran", 9, 99.9);

        System.out.println();

        User[] arr = {user1, user2, user3, user4, user5, user6, user7, user8, user9};
        for (User user : arr) {
            System.out.print(user.getName(1111)+" ");
        }
        int[][] arr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
//        System.out.println(arr2[0][3]);

/*
        for (int j = 0; j < arr2.length; j++) {
            int[] ints = arr2[j];
            for (int k = 0; k < ints.length; k++) {
                int anInt = ints[k];
                System.out.print(anInt);
            }
        }
*/
        System.out.println();

        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
        }


        int[][] arr3 = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}, {7, 7}, {8, 8}, {9, 9}, {10, 10}};
//        System.out.println(arr3[9][1]);

        /*for (int j = 0; j < arr3.length; j++) {
            int[] ints = arr3[j];
            for (int k = 0; k < ints.length; k++) {
                int anInt = ints[k];
                System.out.print(anInt);
            }
        }*/
        System.out.println();
        for (int[] ints : arr3) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
        }
        System.out.println();

        int [][] arr4={{1,2,3,4},{11,12,13},{21,22},{99,100}};
/*        for (int j = 0; j < arr4.length; j++) {
            int[] ints = arr4[j];
            for (int k = 0; k < ints.length; k++) {
                int anInt = ints[k];
                System.out.print(anInt+" ");
            }
        }*/

        for (int[] ints : arr4) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
        System.out.println();
int [][] arr5=new int[2][10];
        Random rand = new Random(0);
        for (int[] ints : arr5) {
            System.out.println();

            for (int anInt1 : ints) {
                int anInt;
                anInt = rand.nextInt(10);
                System.out.print(anInt + " ");
            }
        }
        System.out.println();
        System.out.println();


        // Randome numbers
        Random ra=new Random(0);
        System.out.println(ra.nextInt(100));

        System.out.println();


        user1.plus();
        user2.plus();
        user3.plus();
        user4.plus();
        user5.plus();
        user6.plus();
        user7.plus();
        user8.plus();

        System.out.println();


        user9.skid(8,2);
        System.out.println();


        int x1=user1.idPlusOne();
        System.out.println(x1*2);



        System.out.println();

        System.out.println(user9.oloolo());

        System.out.println();

        System.out.println(user1.Summa(1.5,1.5));
        System.out.println();

        System.out.println(user9.getName(1111));

        user6.setId(85);
        System.out.println(user6.getId());


        User user9clone =new User("Ninth", "0000009", "Moran", 9, 99.9);

        System.out.println(user9.equals(user9clone));
        System.out.println(user1.equals(user9clone));
    }


}
