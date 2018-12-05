package Tasks.Metods;


public class Main_sttings {

    public static void main(String[] args) {



    }

    // Пишемо  свій метод equalsIgnoreCase(). Як він буде працювати залежить від вас!
    //        ВАЖЛИВО ! Не використовувати стрінговий метод equals() , а то чітінг)))
    //

    //        1 написати метод,
    //        який вирізає зі стрічки вказаний діапазон і вертає його

    private static String cutFragment(String a, char a1, char b) {
        String rezult = a.substring(a.indexOf(a1) + 1, a.indexOf(b));
        return rezult;
    }


//    private static void cutFragmentII(String a, char a1, char b) {
//        char[] chars = a.toCharArray();
//
//        int q = 0;
//        int w = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            char aChar = chars[i];
//            if (aChar == a1) q = i;
//            if (aChar == b) w = i;
//        }
//
//        int r = w - q - 1;
//
//        char[] arr = new char[r];
//        int y=0;
//        arr[y] = chars[q + 1];
//        ++y;
//        arr[1] = chars[q + 2];
//        arr[2] = chars[q + 3];
//        arr[3] = chars[q + 4];
//        arr[4] = chars[q + 5];
//
//        for (char c : arr) {
//            System.out.print(c);
//        }
//    }


    //        2 написати метод,
    //        який розрізає стрічку по певному символу(ви задаєте самі)
    //        і вертає масив сегментів цієї стрічки

    private static String[] sliseOfstring(String arr, String word) {
        String[] mass = arr.split(word);
        return mass;
    }

    //        3 написати метод,
    //        який рахує кількість входжень символу який ви вводите як аргумент
    private static int howManySimvols(String text, String sorchWord) {
        int simvols = text.length() - text.replace(sorchWord, "").length();
        return simvols;
    }

}
