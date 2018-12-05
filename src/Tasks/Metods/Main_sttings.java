package Tasks.Metods;


public class Main_sttings {
    // Пишемо  свій метод equalsIgnoreCase(). Як він буде працювати залежить від вас!
    //        ВАЖЛИВО ! Не використовувати стрінговий метод equals() , а то чітінг)))
    public static void main(String[] args) {






    }
    //        1 написати метод,
    //        який вирізає зі стрічки вказаний діапазон і вертає його

//    private static String cutFragment(String a, char a1, char b) {
//        String rezult = a.substring(a.indexOf(a1) + 1, a.indexOf(b));
//        return rezult;
//    }


    private static String cutFragment(String a, char a1, char a2) {

        int start = 0;
        int finish = 0;

        char[] ac = a.toCharArray();
        for (int i = 0; i < ac.length; i++) {
            if (ac[i] == a1) start = i;
            if (ac[i] == a2) finish = i;
        }
        char[] chars = new char[finish - start - 1];
        for (int i = ++start; i < finish; i++) {
            for (int j = 0; j < chars.length; j++) {
                chars[j] = ac[i];
            }
        }
        String suba = new String(chars);
        return suba;
    }


    //        2 написати метод,
    //        який розрізає стрічку по певному символу(ви задаєте самі)
    //        і вертає масив сегментів цієї стрічки

//    private static String[] sliseOfstring(String arr, String word) {
//        String[] mass = arr.split(word);
//        return mass;
//    }

private static String [] slisesOfString(String a, char a1){
    int len1 = 0;
    int len2;
    char[] ac = a.toCharArray();
    for (int i = 0; i < ac.length; i++) {
        if (ac[i] == a1) len1 = i;
    }
    char[] sub1 = new char[len1];
    for (int i = 0; i < sub1.length; i++) {
        for (int j = 0; j < len1; j++) {
            sub1[j] = ac[j];
        }
    }
    len2 = ac.length - len1;

    char[] sub2 = new char[len2 - 1];
    for (int i = 0, j = len1 + 1; i < sub2.length; i++, j++) {
        sub2[i] = ac[j];
    }

    String subs1 = new String(sub1);
    String subs2 = new String(sub2);
    String[] strings = {subs1,subs2};
return strings;}

    //        3 написати метод,
    //        який рахує кількість входжень символу який ви вводите як аргумент
//    private static int howManySimvols(String text, String sorchWord) {
//        int simvols = text.length() - text.replace(sorchWord, "").length();
//        return simvols;
//    }
private static void hovMany(String a, char c){
    int q=0;
    char[]chars=a.toCharArray();
    for (char aChar : chars) {
        if (aChar==c)q++;
    }
    System.out.println(q);

}
}
