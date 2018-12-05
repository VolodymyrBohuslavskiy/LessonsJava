package reflection_annotation_thread_token.token;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;


public class main {
    public static void main(String[] args) {

// ШИФРУЄМО
        String jwtoken = Jwts.builder()//Оголошуємо змінну для шифрування
                .setSubject("Ololololo")//Солво що шифрується
                .signWith(SignatureAlgorithm.HS512, "qwe".getBytes())//Обираємо алгоритм шифрування ,слово для дешифрування у байтовий масив
                .setExpiration(new Date(System.currentTimeMillis() + 3000))// термін дії цього jwtoken
                .compact();// Кінець цього шифруванння
        System.out.println(jwtoken);//отримали ключ


//ДЕШИФРУЄМО
String subject=Jwts.parser()//Оголошуємо змінну для дешифрування
        .setSigningKey("qwe".getBytes())//слово для дешифрування у байтовий масив
        .parseClaimsJws(jwtoken)//Вставити
        .getBody()//Дістаємо боді
        .getSubject();//Дістаємо субєкт
        System.out.println(subject);// Виводимо слово




    }
}
