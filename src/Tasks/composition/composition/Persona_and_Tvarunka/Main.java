package Tasks.composition.composition.Persona_and_Tvarunka;

//1. Стоврити класс Персона, та Тваринка
//        В Персона є тваринка.
//        У персона є ім'я, прізвище, вік, Пошта.
//        В тваринки є клічка, вік.
//        Пошта - сайт , логін, пароль
//        Поведінка.
//        Тварини -  Гавкати. Пісяти(усюди)
//        Пошти - логінитись (логін, пароль) => Ви залогінені

//2. Компанія.
//        назва
//        Департаменти []
//        назва
//        Працівників []
//        ім'я
//        прізвище
//        стаж
//        посаду

//        3. Зявка
//        номер
//        дату
//        Тип(enum?)
//        Клієнат
//        прізвище
//        ім'я
//        дату народження
//        Паспорт
//        ким виданий
//        серію
//        номер
public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Nik", "Revyera", 34, new Tvarunka("Bingo", 2), new Poshta("Gmail", "Nik", "olol"));

        persona.getTvarunka().GAF();
        persona.getPoshta().LogIn("Nik","olol");
















    }
}
