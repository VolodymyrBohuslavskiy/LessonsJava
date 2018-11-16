package Tasks.oop_paradigmas.human_array_with_array;

//Создать класс Человек(ф ,и, о, возраст, пол, статус(boolean), массив языков)


//        Все тоже самое но циклом while


public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("lee", "Lemon", "Rob", "man", 15, true, new String[]{"HTML", "CSS", "JS"});
        Human h2 = new Human("Jay", "Snith", "Gee", "woman", 14, false, new String[]{"Rubi", "CSS"});
        Human h3 = new Human("Kay", "Renger", "Too", "man", 18, true, new String[]{"JS", "CSS",});
        Human h6 = new Human("Nevil", "Simon", "Nice", "woman", 18, true, new String[]{"HTML", "CSS"});
        Human h7 = new Human("John", "Bkack", "Simon", "man", 21, false, new String[]{"HTML", "CSS", "JS"});
        Human h8 = new Human("Oleg", "Man", "Rutor", "woman", 22, true, new String[]{"HTML", "CSS",});
        Human h9 = new Human("Vova", "Callback", "Ex", "man", 25, true, new String[]{"CSS", "JS"});
        Human h10 = new Human("Fin", "Dog", "Vk", "woman", 25, false, new String[]{"HTML", "CSS", "JS"});
        Human h4 = new Human("Taras", "Green", "Ololol", "man", 11, true, new String[]{"CSS", "JS"});
        Human h5 = new Human("Ruslan", "Chak", "Kool", "woman", 19, false, new String[]{"HTML", "CSS", "JS"});
        Human h11 = new Human("Nazar", "Otello", "Hot", "woman", 30, true, new String[]{"HTML", "JS"});
        Human h12 = new Human("Hullio", "Fernrndes", "Chico", "man", 40, true, new String[]{"HTML", "CSS", "JS", "Java"});


        Human[] arr = new Human[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12};

        int i = 0;
//        каждого отдельно и его язык, вывести в формате "имя знает - язык"
/*
        for (Human human : arr) {
            for (String language : human.getLanguages()) {
                System.out.print(human.getName()+" knows "+language+" ");
                System.out.println();

            }
        }

while (i<arr.length){
            System.out.println(arr[i]);
            i++;
        }

*/
//        вывести :
//        всех М
/*
        for (Human human : arr) {
           if (Objects.equals(human.getSex(), "man")) {
               System.out.print(human.getName()+" ");
           }
        }

             while (i < arr.length) {
            if (Objects.equals(arr[i].getSex(), "man")) {
                System.out.println(arr[i]);
            }
            i++;
        }
*/


//        всех Ж

/*

        for (Human human : arr) {
            if (Objects.equals(human.getSex(), "woman")) {
                System.out.print(human.getName()+" ");
            }
        }

                while (i < arr.length) {
            if (Objects.equals(arr[i].getSex(), "woman")) {
                System.out.println(arr[i]);
            }
            i++;
        }
*/

//        всех у кого больше 2х языков
/*

        for (Human human : arr) {
if (human.languages.length>2){
    System.out.println(human.getName());
            }
        }

                while (i < arr.length) {
            if (arr[i].languages.length>2) {
                System.out.println(arr[i].getName());
            }
            i++;
        }
*/


    }
}
