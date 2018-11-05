package Tasks.Arrays;


import java.util.Random;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

//        робити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та:
        //               0  1   2   3  4   5   6   7   8     9
        Object[] arr1 = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};


//        1. Перебрати його циклом while
        int i = 0;
       /* while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }*/

/*РОЗДІЛЯЄМО*/
        System.out.println();

//        2. перебрати його циклом for
        /*for (Object o : arr1) {
            System.out.print(o + " ");
        }*/

/*РОЗДІЛЯЄМО*/
        System.out.println();

//        3. перебрати циклом while та вивести  числа тільки з непарним індексом
        /*while (i < arr1.length) {
            if (i % 2 == 0) {
                System.out.print(arr1[i] + " ");
            }
            i++;
        }*/
/*РОЗДІЛЯЄМО*/
        System.out.println();

//        4. перебрати циклом for та вивести  числа тільки з непарним індексом
/*        for (int j = 0; j < arr1.length; j++) {
            Object o = arr1[j];
            if (j%2==0) {System.out.print(o+" ");}
        }*/
/*РОЗДІЛЯЄМО*/
        System.out.println();
//        5. перебрати циклом while та вивести  числа тільки парні  значення
/*        while (i < arr1.length) {
            if ((int)arr1[i]%2==0){System.out.print(arr1[i] + " ");}
            i++;}*/
/*РОЗДІЛЯЄМО*/
        System.out.println();
//        6. перебрати циклом for та вивести  числа тільки парні  значення
        /*for (Object anArr1 : arr1) {
            if ((int) anArr1 % 2 == 0) {
                System.out.print(anArr1 + " ");
            }
        }*/


//        7. Кратні 3 на "okten"
/*        for (int j = 0; j < arr1.length; j++) {
            Object o = arr1[j];
if ((int)o%3==0){o="okten";}
            System.out.print(o+" ");
        }*/
//        8. Вивести масив в зворотньому порядку.
/*        for (int j = 0; j < arr1.length; j++) {
            Object o = arr1[arr1.length - 1 - j];//реверс це [arr1.length-1-j]
            System.out.print(o + " ");
        }*/
//        9. Всі попередні завдання (окрім 8), але в зворотньому циклі (с заду на перед)
        /*РОЗДІЛЯЄМО*/
        System.out.println();

//        7. Кратні 3 на "okten"
/*        for (int j = 0; j < arr1.length; j++) {
            Object o = arr1[arr1.length-1-j];
if ((int)o%3==0){o="okten";}
            System.out.print(o+" ");
        }*/
        System.out.println();
//        6. перебрати циклом for та вивести  числа тільки парні  значення
/*
        for (int j = 0; j < arr1.length; j++) {
            Object o = arr1[arr1.length-1-j];
            if ((int)o%2==0){
                System.out.print(o+" ");
            }
        }
*/
//        5. перебрати циклом while та вивести  числа тільки парні  значення
/*
        while (i < arr1.length) {
            if ((int)arr1[i]%2==0){System.out.print(arr1[arr1.length-1-i] + " ");}
            i++;}
*/

//        4. перебрати циклом for та вивести  числа тільки з непарним індексом
/*        for (int j = 0; j < arr1.length; j++) {
            Object o = arr1[arr1.length-1-j];
            if (j%2==0) {System.out.print(o+" ");}
        }*/

//        3. перебрати циклом while та вивести  числа тільки з непарним індексом
/*        while (i < arr1.length) {
            if (i % 2 == 0) {
                System.out.print(arr1[arr1.length-1-i] + " ");
            }
            i++;
        }*/

//        2. перебрати його циклом for
/*        for (int j = 0; j < arr1.length; j++) {
            Object o = arr1[arr1.length - 1 - j];
            System.out.print(o + " ");
        }*/


//        1. Перебрати його циклом while
/*        while (i < arr1.length) {
            System.out.print(arr1[arr1.length - 1 -i] + " ");
            i++;
        }*/

//______________________________________________________________________________________________________________________

//        Створити пустий масив та :
//        1. Заповнити його 50 парними числами.
/*        int[] arr2 = new int[51];

        for (int e = 2, b = 0; e <= arr2.length; e++) {
            if (e % 2 == 0) {
                arr2[b] = e;
                System.out.print(arr2[b] + " ");
                b++;
            }
        }*/

        /*РОЗДІЛЯЄМО*/
        System.out.println();
//        2. Заповнити його 50 непарними числами.

/*        for (int e = 2, b = 0; e <= arr2.length; e++) {
            if (e % 2 != 0) {
                arr2[b] = e;
                System.out.print(arr2[b] + " ");
                b++;
            }
        }
        System.out.println();*/

//        1. используя Math.random заполнить массив из ??? элементов.
//                диапазон рандома ??? до ???.

        //Random
         /*
        Random r1=new Random();
        System.out.println(r1.nextInt(10));
        */


        Random r = new Random();
        int rt = r.nextInt(100);
        int[] arr3 = new int[rt];

/*
        for (int j = 0; j < arr3.length; j++) {
            arr3[j]=r.nextInt(200);
            System.out.print(arr3[j]+" ");
        }
*/

        System.out.println();

//        2. Вывести на консоль  каждый третий елемент

/*
        for (int j = 0; j < arr3.length; j++) {
            arr3[j]=r.nextInt(200);
            //System.out.print(arr3[j]+" ");//Розкоментуй і каждый третий елемент буде повторюватися !
            if (j%3==0){
                System.out.print(arr3[j]+" ");}
        }
*/
//        3. Вывести на консоль  каждый третий елемент
//        но при условии что он имеет парное значение.

/*        for (int j = 0; j < arr3.length; j++) {
            arr3[j]=r.nextInt(200);
            //System.out.print(arr3[j]+" ");//Розкоментуй і каждый третий елемент буде повторюватися !
            if (j%3==0 && arr3[j]%2==0){
                System.out.print(arr3[j]+" ");}
        }*/

//        4. Вывести на консоль  каждый третий елемент
//        но при условии что он имеет парное значение и
//        записать их в другой массив.

        /*int[] arr4 = new int[rt];

        for (int j = 0; j < arr3.length; j++) {
            arr3[j] = r.nextInt(200);
            if (j % 3 == 0 && arr3[j] % 2 == 0) {
                System.out.print(arr3[j]+" ");
                arr4[j]=arr3[j];
                System.out.println(arr4[j]+" ");
            }
        }*/

/*        System.out.println("Enter:");
        Scanner scan =new Scanner(System.in);
        int x=scan.nextInt();
        System.out.println(x+1);*/

























    }


}
