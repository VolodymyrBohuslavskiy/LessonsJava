package reflection_annotation_thread_token.Anotation;

import reflection_annotation_thread_token.user;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {


        user user1 = new user(-99, "LOSK", "pepe", false);
        hendler(user1);// міняємо ід на дефолт ід
        System.out.println(user1);


    }

    private static void hendler(user user) throws IllegalAccessException {

        Class<? extends user> miror = user.getClass();
        Field[] fields = miror.getDeclaredFields();


        //Ітеруємо fields рефлексії від класу user
        for (Field field : fields) {
            field.setAccessible(true);//Можливість доступу до філди яка protrcted

            if (field.isAnnotationPresent(Vslidateid.class))// якщо присутня анотація Vslidateid то
                if ((int) field.get(user) < 0) {// інтову філду з user
                    Vslidateid annotation = field.getAnnotation(Vslidateid.class);// якщо над філдою присутня анотація Vslidateid
                    String massage = annotation.massage();// викликаємо метод massage і записуємо його в змінну massage
                    System.out.println(massage);// виводимо massage
                    int i = annotation.defID();// викликаємо метод defID.відАнотації який повертає дефолтне ід і записуємо в змінну і
                    field.setInt(user, i);// методом setInt до обєкту user додаємо і=defID()
                }
        }
    }
}
