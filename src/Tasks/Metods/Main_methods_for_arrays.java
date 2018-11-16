package Tasks.Metods;

import java.util.Arrays;

public class Main_methods_for_arrays {
    public static void main(String[] args) {


        int[] re = new int[]{1, 2, 4, 55, 6, 8, 10, 144, 28, 90, 12, 55, 44, 999};
        int[] rt = new int[]{1, 2, 4, 55, 6, 8, 10, 144, 28, 90, 12, 55, 44, 1000};
        System.out.println(Arrays.toString(TwoArrMax(re, rt)));

    }

    // метод геренинует массив размером в 10 эл
    private static void One() {
        int[] arr = new int[10];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    // метод геренинует массив парных размером в 10 эл
    private static void Two() {
        int[] arr = new int[10];
        for (int i = 0, j = 2; i < arr.length; i++, j += 2) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    // метод геренинует массив непарных размером в 10 эл
    private static void Th() {
        int[] arr = new int[10];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    // метод геренинует массив размером в ? эл
    private static void Fh(int a) {
        int[] arr = new int[a];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    // метод геренинует массив парных размером в ? эл
    private static void Sh(int a) {
        int[] arr = new int[a];
        for (int i = 0, j = 0; i < arr.length; i++, j += 2) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    // метод геренинует массив непарных размером в ? эл
    private static void Se(int a) {
        int[] arr = new int[a];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }


    // метод заполняет массив размером в 10 эл
    private static int[] Eight(int[] a) {
        for (int i = 0, j = 0; i < a.length; i++, j++) {
            a[i] = j;
        }
        return a;
    }

    // метод заполняет массив парных размером в ? эл
    // метод заполняет массив парных размером в 10 эл
    private static int[] Nine(int[] a) {
        for (int i = 0, j = 0; i < a.length; i++, j += 2) {
            a[i] = j;
        }
        return a;
    }

    // метод заполняет массив непарных размером в ? эл
    // метод заполняет массив непарных размером в 10 эл
    private static int[] Te(int[] a) {
        for (int i = 0, j = 0; i < a.length; i++, j += 3) {
            a[i] = j;
        }
        return a;
    }

    // метод заполняет массив размером в ? эл
    private static int[] Ell(int[] a) {
        for (int i = 0, j = 0; i < a.length; i++, j++) {
            a[i] = j;
        }
        return a;
    }

    // метод находит в массиве наибольшее число
    // метод находит в массиве наименьшее  число


    private static int Twe(int[] a, char s) {
        int max = a[0], min = a[0];
        for (int arg : a) {
            if (arg > max) max = arg;
            if (arg < min) min = arg;
        }
        if (s == '+') {
            System.out.print(max + " ");
            return max;
        }
        if (s == '-') {
            System.out.print(min + " ");
            return min;
        }
        return 0;
    }

// метод переносит парные числа другой массив
    // (Обери 1 непарні, 2 парні числа попадуть в масв)
// метод непарные  числа другой массив

    private static void THin(int[] a, int chose1or2) {
        if (chose1or2 == 1) {
            for (int i : a) {
                if (!(i % 2 == 0)) main_metods.Foo(i);
            }
        }
        if (chose1or2 == 2) {
            for (int i : a) {
                if (i % 2 == 0) main_metods.Foo(i);
            }
        }
    }


    // метод принимает массивы, находит с каждого из них максимальное знаяение и записывает их в новый сгенертрованный массив
    private static int[] TwoArrMax(int[] a, int[] b) {
        int[] al = new int[]{main_metods.FiveSix('+', a), main_metods.FiveSix('+', b)};
        return al;
    }

}
