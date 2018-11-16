package Tasks.annotations;

import java.util.Scanner;

/*Створти аннотацію, яка перевіряє наявність в стрічці символів !@#$%^&*()
        Застосувати аннотацію до двох полів класу (Класс створюється довільно)*/
public class annotations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String word = sc.nextLine();

        String[] simvols = new String[]{"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};

        for (String sub : simvols) {
            if (word.contains(sub))
                System.out.println("Присутні !@#$%^&*()");
            else System.out.println("no");
        }

    }
}
