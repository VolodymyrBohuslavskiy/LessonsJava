package reflection_annotation_thread_token;


import reflection_annotation_thread_token.Anotation.Vslidateid;

public class user {
    @Vslidateid(massage="Alarm", defID=1)
    private int id;
    private String name, surname;
    private boolean statuse;

    public user(int id, String name, String surname, boolean statuse) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.statuse = statuse;
    }

    public user() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isStatuse() {
        return statuse;
    }

    public void setStatuse(boolean statuse) {
        this.statuse = statuse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof user)) return false;

        user user = (user) o;

        if (id != user.id) return false;
        if (statuse != user.statuse) return false;
        if (!name.equals(user.name)) return false;
        return surname.equals(user.surname);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + (statuse ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", statuse=" + statuse +
                '}';
    }
}
