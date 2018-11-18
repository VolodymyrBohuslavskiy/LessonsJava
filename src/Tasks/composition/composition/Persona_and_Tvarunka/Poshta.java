package Tasks.composition.composition.Persona_and_Tvarunka;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Poshta implements logIn{
    private String site, login, password;


    @Override
    public void LogIn(String login, String password) {
        if (Objects.equals(login, this.login) && Objects.equals(password, this.password)){
            System.out.println("=> Ви залогінені ");
        }
        else System.out.println("Ви НЕ залогінені ");
    }
}
