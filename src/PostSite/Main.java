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
//        - створити пост
//        - переглянути всі пости+
//        - переглянути пости по пипах+
//        - видалити пост
//        - знайти пост певного типу в певному місті+

import java.util.ArrayList;

public class Main {
    //    private boolean wonExit=false;
//    private Scanner num;
//    private Scanner text;
    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>();
        Author all = new Author("All", "099");
        authors.add(all);
        Author nick = new Author("Nick", "069");
        authors.add(nick);

        ArrayList<Location> locations = new ArrayList<>();
        Location location = new Location("UA", "LV");
        locations.add(location);
        Location location1 = new Location("UA", "FR");
        locations.add(location1);

        Surch one = new Surch("Buy", "Cat", location1, nick);


        ArrayList<Post> posts = new ArrayList<>();
        posts.add(one);


    }
}
