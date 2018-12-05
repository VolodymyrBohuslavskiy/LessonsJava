package Tasks.annotations;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Field;


/*Створти аннотацію, яка перевіряє наявність в стрічці символів !@#$%^&*()
        Застосувати аннотацію до двох полів класу (Класс створюється довільно)*/
public class annotations {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        System.out.println(validate(new User("KAMAZ)", "LOL")));


    }


//private static boolean validate(User a){
//    String[] simvols = new String[]{"!","@","#","$","%","^", "&","*","(",")"};
//        for (String sub : simvols) {
//            if (a.getName().contains(sub) || a.getSurname().contains(sub))
//                return true;}
//    return false;}

//    private static User validate(User user) throws NoSuchFieldException, IllegalAccessException {
//        final Class<? extends User> userClassclass = user.getClass();
//        final Field[] fields = userClassclass.getDeclaredFields();
//        for (Field field : fields) {
//            field.setAccessible(true);
//            if (field.isAnnotationPresent(ValidationSinmvol.class)) {
//                String curentString = (String) field.get(user);
//                if (curentString.contains("!")) {
//                    ValidationSinmvol annotation = field.getAnnotation(ValidationSinmvol.class);
//                    String defString = annotation.defString();
//                    field.set(user, defString);
//                }
//            }
//        }
//        return user;
//    }

    private static User validate(User user) throws NoSuchFieldException, IllegalAccessException {
        final Class<? extends User> userClassclass = user.getClass();
        final Field[] fields = userClassclass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(ValidationSinmvol.class)) {
                String curentString = (String) field.get(user);

                String[] simvols = new String[]{"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
                for (String simvol : simvols) {
                    if (curentString.contains(simvol)) {
                        ValidationSinmvol annotation = field.getAnnotation(ValidationSinmvol.class);
                        String defString = annotation.defString();
                        field.set(user, defString);
                    }

                }
            }
        }
        return user;
    }
}

@AllArgsConstructor
@Data
class User {
    @ValidationSinmvol(defString = " 0_0 ")
    private String name, surname;
}

