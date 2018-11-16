package Tasks.Metods;

//Створити методи :


public class main_metods {
    public static void main(String[] args) {


        System.out.println(FiveSix('-', 23, 23, 45, 56, 788, 98, 443, 22));

    }

    //        1. приймає три числа та виводить та повертає найменьше.
    private static int First(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
            return a;
        }
        if (b > a && b > c) {
            System.out.println(b);
            return b;
        }
        if (c > a && c > b) {
            System.out.println(c);
            return c;
        }
        return 0;
    }

//        2. приймає три числа та виводить та повертає найбільше.

    private static int Second(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
            return a;
        }
        if (b < a && b < c) {
            System.out.println(b);
            return b;
        }
        if (c < a && c < b) {
            System.out.println(c);
            return c;
        }
        return 0;
    }


//        3. приймає будь-яку кількість чисел, повертає найменьше, а виводить найбільше

    private static int Third(int... args) {
        int max = args[0], min = args[0];
        for (int arg : args) {
            if (arg > max) max = arg;
            if (arg < min) min = arg;
        }
        System.out.print(max + " ");

        return min;
    }

    //        4. виводить масив
    protected static void Foo(int... args) {
        for (int arg : args) {
            System.out.print(arg + " ");
        }
    }

//        5. повертає найбільше число з масиву
//        6. повертає найменьше число з масиву

    protected static int FiveSix(char c, int... args) {
        int max = args[0], min = args[0];
        for (int arg : args) {
            if (arg > max) max = arg;
            if (arg < min) min = arg;
        }
        if (c == '+') return max;
        if (c == '-') return min;
        return 0;
    }


}
