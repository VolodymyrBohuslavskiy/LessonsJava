package reflection_annotation_thread_token;

import java.lang.reflect.*;

public class main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {


         user user = new user(1,"Olololol","Twerk",true);

        Class<? extends reflection_annotation_thread_token.user> miror = user.getClass();

        Field[] declaredFields = miror.getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println(field.getName()+" "+field.getType()+" - "+field.get(user));
            if (field.getType().toString().equals("int")){
                field.set(user,999);
            }
        }
        System.out.println(user);

        Class<reflection_annotation_thread_token.user> userClass = reflection_annotation_thread_token.user.class;
        reflection_annotation_thread_token.user def = userClass.getDeclaredConstructor().newInstance();
        reflection_annotation_thread_token.user all = userClass.getDeclaredConstructor(int.class, String.class, String.class,boolean.class).newInstance(2,"Arra","Taco",true);
        System.out.println(all+" "+def);

        final Method[] declaredMethods = user.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName()+" "+method.getReturnType());
        }

        final Constructor<?>[] constructors = reflection_annotation_thread_token.user.class.getConstructors();
        for (Constructor<?> constructor : constructors) {
            final Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
            }
        }




    }

}
