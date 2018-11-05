package Tasks;

public class shitList {
    public static void main(String[] args) {
//        Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та:


//        8. Вивести масив в зворотньому порядку.
//        9. Всі попередні завдання (окрім 8), але в зворотньому циклі (с заду на перед)


//        1. Перебрати його циклом while
        //            0  1   2   3  4   5   6   7    8    9
        int[] arr1 = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        int i = 0;
/*  while (i<arr1.length){
      System.out.print(arr1[i]+" ");
      i++;
  }*/

        //        2. перебрати його циклом for
   /*     for (int i1 : arr1) {
            System.out.print(i1+" ");
        }
*/
//        3. перебрати циклом while та вивести  числа тільки з непарним індексом
       /* while (i<arr1.length){
            if (i%2==1){
                System.out.print(arr1[i]+" ");
            }
            i++;}*/
        System.out.println();
//        4. перебрати циклом for та вивести  числа тільки з непарним індексом
/*        for (int j = 0; j < arr1.length; j++) {
            int i1 = arr1[j];
            if (j%2==1) System.out.print(i1+" ");
        }*/


//        5. перебрати циклом while та вивести  числа тільки парні  значення
/*        while (i < arr1.length) {
            if (arr1[i] % 2 == 0) {
                System.out.print(arr1[i] + " ");
            }
            i++;
        }
        System.out.println();*/
//        6. перебрати циклом for та вивести  числа тільки парні  значення
/*        for (int j = 0; j < arr1.length; j++) {
            int i1 = arr1[j];
            if (i1 % 2 == 0) System.out.print(i1 + " ");
        }
        System.out.println();*/
//        7. замінити кожне число кратне 3 на слово "okten"

        for (int j = 0; j < arr1.length; j++) {
            int i1 = arr1[j];
            if (i1 % 3 == 0) {i1=0;
//                System.out.print("okten ");
            }
            System.out.print(i1 + " ");
        }




















    }

}
