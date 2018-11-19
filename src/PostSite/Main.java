package PostSite;

//Замовник хоче отримати сайт для розмішення постів. Пости розміщуються звичайними юзерами.
//        Пости поділяются на два типи:
//        ті хто шукає роботу
//        ті хто пропонує роботу

//        Поля постів:
//        Заголовок
//        опис
//        країна(роботи)
//        місто(роботи)
//        телефон
//        ім'я автора поста
//        один автор може розмітити багато різних типів постів.

//        Створити меню:
//        - створити пост+
//        - переглянути всі пости+
//        - переглянути пости по типах+
//        - видалити пост+
//        - знайти пост певного типу в певному місті+

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    //    private boolean wonExit=false;
//    private Scanner num;
//    private Scanner text;
    public static void main(String[] args) {


        ArrayList<Post> posts = new ArrayList<>();

        AddPostS(posts, "Кіт", "Куплю кота", "Укр", "Львів", "Назар", "102");
        AddPostP(posts, "Пес", "Продам песика", "Укр", "Стрий", "Микола", "103");
        AddPostS(posts, "Хом'як", "Куплю хом'яка", "Укр", "Моршин", "Іван", "104");
        AddPostP(posts, "Шиншила", "Продам шиншилу", "Укр", "Дрогобич", "Тарас", "105");



    }


    private static ArrayList<Post> AddPostP(ArrayList<Post> posts, String titel, String text, String Country, String city, String name, String tel) {
        Promote p = new Promote(titel, text, new Location(Country, city), new Author(name, tel));
        if (!posts.contains(p)) {
            posts.add(p);
        }
        return posts;
    }

    private static ArrayList<Post> AddPostS(ArrayList<Post> posts, String titel, String text, String Country, String city, String name, String tel) {
        Surch p = new Surch(titel, text, new Location(Country, city), new Author(name, tel));
        if (!posts.contains(p)) {
            posts.add(p);
        }
        return posts;
    }

    private static void ShowAll(ArrayList<Post> posts) {
        for (Post post : posts) {
            System.out.println(post.getTitel()+" "+post.getText()+" "+post.getUser().getName()+" "+post.getUser().getTel()+" "+post.getLocation().getCity()+" "+post.getLocation().getCountry());
        }
    }

    private static void ShowAllByType(ArrayList<Post> posts, String type) {
        for (Post post : posts) {
            if (Objects.equals(post.getType(), "Surch") && Objects.equals(type, "Попит")) System.out.println(post);
            if (Objects.equals(post.getType(), "Promote") && Objects.equals(type, "Пропозиція"))
                System.out.println(post);
        }
    }

    private static ArrayList<Post> DelPost(ArrayList<Post> posts, String name, String title) {
        Iterator<Post> iterator = posts.iterator();
        while (iterator.hasNext()){if (iterator.next().getUser().getName()==name)iterator.remove();}
        DelPostByTitle(posts, title);
        return posts;
    }

    private static ArrayList<Post> DelPostByTitle(ArrayList<Post> posts, String titel) {
        Iterator<Post> iterator = posts.iterator();
        while (iterator.hasNext()){if (iterator.next().getTitel()==titel)iterator.remove();}
        return posts;
    }

    private static void ShowByCity_Type(ArrayList<Post> posts, String city,String type) {
        for (Post post : posts) {
            if (post.getLocation().getCity()==city)ShowAllByType(posts,type);
        }
    }


}




