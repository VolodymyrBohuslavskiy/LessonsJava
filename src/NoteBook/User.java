package NoteBook;



import lombok.Data;



@Data


public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
