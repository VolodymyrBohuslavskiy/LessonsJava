package Tasks.annotations;


import lombok.AllArgsConstructor;
import lombok.Data;


/*Створти аннотацію, яка перевіряє наявність в стрічці символів !@#$%^&*()
        Застосувати аннотацію до двох полів класу (Класс створюється довільно)*/
public class annotations {
    public static void main(String[] args) {

        System.out.println(iscorect(new User("a", "a")));
        System.out.println(iscorect(new User("a!", "a")));




















    }
private static boolean iscorect(User a){
    String[] simvols = new String[]{"!","@","#","$","%","^", "&","*","(",")"};
        for (String sub : simvols) {
            if (a.getName().contains(sub) || a.getSurname().contains(sub))
                return true;}
    return false;}







}
@AllArgsConstructor
@Data
class User{
@ValidationSinmvol
    private String name,surname;
}

