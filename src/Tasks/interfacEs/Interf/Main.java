package Tasks.interfacEs.Interf;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        Policeman p1 = new Policeman();

        System.out.println(Arrays.toString(p1.Creator(22)));
        System.out.println(Arrays.toString(d1.Creator(34)));
        System.out.println(Arrays.toString(d1.Creator()));
        System.out.println(d1.Sqar(2.0));
        System.out.println(d1.Sqar(3.0,2.0));
        System.out.println(p1.Sqar(2.0));
        System.out.println(p1.Sqar(3.0,2.0));

















    }








//1. ствоити інтрейфейс, імплеметувати його в 2 класи.
//    В класах є приватне поле meaasge.
//    Зробити всі необхідні маніпуляції для ініціалізації полів.
//    в  інтерфейсі визначити метод void scream(); який буде виводити інформацію в консоль.
//    В першому классі зробити реалізацію методу на вивід message "аааааааа!!!!!"
//    В другому класі зробити реалізацію методу на вивід massage "ууууууууу".
    // В головному класі. створити метод, котрий приймає об'єкт цього інтерфейсу і виконує його метод

    private static void LetsScream(Humann a){
        I_intrr1 i = (I_intrr1) a;
        ((I_intrr1) a).Scream();
    }






}
