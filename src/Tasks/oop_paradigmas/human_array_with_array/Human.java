package Tasks.oop_paradigmas.human_array_with_array;


import java.util.Arrays;

//Создать класс Человек(ф ,и, о, возраст, пол, статус(boolean), массив языков)
//        вывести :
//        каждого отдельно и его язык, вывести в формате "имя знает - язык"
//        всех М
//        всех Ж
//        всех у кого больше 2х языков
//
//        Все тоже самое но циклом while
public class Human {
    protected String name,surname,secondname, sex;
    protected int age;
    protected boolean statuse;
    protected String [] languages;

    public Human(String mane, String surname, String secondname, String sex, int age, boolean statuse, String[] languages) {
        this.name = mane;
        this.surname = surname;
        this.secondname = secondname;
        this.sex = sex;
        this.age = age;
        this.statuse = statuse;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatuse() {
        return statuse;
    }

    public void setStatuse(boolean statuse) {
        this.statuse = statuse;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (statuse != human.statuse) return false;
        if (!name.equals(human.name)) return false;
        if (!surname.equals(human.surname)) return false;
        if (!secondname.equals(human.secondname)) return false;
        if (!sex.equals(human.sex)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(languages, human.languages);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + secondname.hashCode();
        result = 31 * result + sex.hashCode();
        result = 31 * result + age;
        result = 31 * result + (statuse ? 1 : 0);
        result = 31 * result + Arrays.hashCode(languages);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", statuse=" + statuse +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
