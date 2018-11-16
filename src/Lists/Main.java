package Lists;


import Cats.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        ArrayList CatsNames=new ArrayList();
CatsNames.add("Vaska");
CatsNames.add("Olololn");
CatsNames.add("Pushok");
CatsNames.add("Kobaska");

        System.out.println(CatsNames);


        CatsNames.add("MaoW");
        CatsNames.add("Ted");
        System.out.println(CatsNames);


        ArrayList<String> ololol=new ArrayList<>();
        ololol.add("122321");
        ololol.add("1223212");
        ololol.add("1223222wds1");
        ololol.add("122321dsvvv");
        ololol.add("122321sfcvs");

        Iterator iterator=CatsNames.iterator();
        /*System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());*/

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Cats.Cat cat1= new Cat("Kobas","Olololon","Red",4);
        Cats.Cat cat2= new Cat("Ralph","Olololon","Gray",2);
        Cats.Cat cat3= new Cat("Barsik","Olololon","Blakc",5);
        Cats.Cat cat4= new Cat("Pushok","Olololon","Silver",7);


        ArrayList<Cat> catlist =new ArrayList<>();
catlist.add(cat1);
catlist.add(cat2);
catlist.add(cat3);
catlist.add(cat4);

        Comparator<Cat> catComparator =new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o2.getName().compareTo(o1.getName()) ;
            }
        };

        catlist.sort(catComparator);

        System.out.println(catlist);






    }
}
