package Tasks.composition.composition.Kompaniya;

///2. Компанія. new
//        назва

//        Департаменти [] new
//        назва

//        Працівників [] new
//        ім'я
//        прізвище
//        стаж
//        посаду

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Departament> fordDep = new ArrayList<>();

        ArrayList<Pratsivnuk> eropFordpratsivPratsivnuks = new ArrayList<>();
        ArrayList<Pratsivnuk> usaFordpratsivPratsivnuks = new ArrayList<>();
        ArrayList<Pratsivnuk> asiaFordpratsivPratsivnuks = new ArrayList<>();

        Kompaniya ford = new Kompaniya("Ford", fordDep);

        fordDep.add(new Departament("Europ", eropFordpratsivPratsivnuks));
        fordDep.add(new Departament("USA", usaFordpratsivPratsivnuks));
        fordDep.add(new Departament("Asia", asiaFordpratsivPratsivnuks));


        eropFordpratsivPratsivnuks.add(new Pratsivnuk("Homer", "Simpson", "Ing", 12));
        eropFordpratsivPratsivnuks.add(new Pratsivnuk("Bart", "Simpson", "Line", 4));
        eropFordpratsivPratsivnuks.add(new Pratsivnuk("Mag", "Simpson", "Tec", 2));


        asiaFordpratsivPratsivnuks.add(new Pratsivnuk("Nelson", "Kaka", "Ing", 11));
        asiaFordpratsivPratsivnuks.add(new Pratsivnuk("Jimbo", "Jones", "Line", 6));
        asiaFordpratsivPratsivnuks.add(new Pratsivnuk("Kirney", "Ololol", "Tec", 3));


        asiaFordpratsivPratsivnuks.add(new Pratsivnuk("a","A","L",1));
        asiaFordpratsivPratsivnuks.add(new Pratsivnuk("b","B","I",10));
        asiaFordpratsivPratsivnuks.add(new Pratsivnuk("c","C","T",11));


    }

}
