package Tasks.Metods;


public class Main_sttings {

    public static void main(String[] args) {


    }

    // Пишемо  свій метод equalsIgnoreCase(). Як він буде працювати залежить від вас!
    //        ВАЖЛИВО ! Не використовувати стрінговий метод equals() , а то чітінг)))
    //

    //        1 написати метод,
    //        який вирізає зі стрічки вказаний діапазон і вертає його

    private static String CutFragment(String a) {
        String rezult = a.substring(a.indexOf('>') + 1, a.indexOf('<'));
        return rezult;
    }

    //        2 написати метод,
    //        який розрізає стрічку по певному символу(ви задаєте самі)
    //        і вертає масив сегментів цієї стрічки

    private static String[] SliseOfstring(String arr, String word) {
        String[] mass = arr.split(word);
        return mass;
    }

    //        3 написати метод,
    //        який рахує кількість входжень символу який ви вводите як аргумент
    private static int HowManySimvols(String text, String sorchWord) {
        int simvols = text.length() - text.replace(sorchWord, "").length();
        return simvols;
    }

}
