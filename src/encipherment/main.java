package encipherment;



import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class main {
    public static void main(String[] args) {



    }

    public static String sI(String s, int kay) {

        byte[] c = s.getBytes();
        byte[] cnew = new byte[c.length];

        for (int i = 0; i < c.length; i++) {
            byte b = c[i];
            int i1 = kay + b;
            cnew[i] = (byte) i1;
        }
        String s1 = new String(cnew);
        return s1;
    }

    public static String dI(String s, int kay){

        byte[] bytes = s.getBytes();

        byte[] ii = new byte[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            ii[i]= (byte) (b-kay);
        }
        String s1=new String(ii);

    return s1;}

    public static String sIs(String s, String kay) {

        byte[] c = s.getBytes();
        byte[] cnew = new byte[c.length];

        for (int i = 0; i < c.length; i++) {
            byte b = c[i];
            int i1 = kay.hashCode() + b;
            cnew[i] = (byte) i1;
        }
        String s1 = new String(cnew);
        return s1;
    }

    public static String dIs(String s, String kay){

        byte[] bytes = s.getBytes();

        byte[] ii = new byte[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            ii[i]= (byte) (b-kay.hashCode());
        }
        String s1=new String(ii);

        return s1;}




    public static String shphr(String word, String kay, int seconds) {
        String jwtoken = Jwts.builder()//Оголошуємо змінну для шифрування
                .setSubject(word)//Солво що шифрується
                .signWith(SignatureAlgorithm.HS512, kay.getBytes())//Обираємо алгоритм шифрування ,слово для дешифрування у байтовий масив
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * seconds))// термін дії цього jwtoken
                .compact();// Кінець цього шифруванння
        return jwtoken;
    }

    public static String deShphr(String shphr, String kay) {
        String subject;//Дістаємо субєкт
        subject = Jwts.parser()//Оголошуємо змінну для дешифрування
                .setSigningKey(kay.getBytes())//слово для дешифрування у байтовий масив
                .parseClaimsJws(shphr)//Вставити
                .getBody()//Дістаємо боді
                .getSubject();
        return subject;
    }

}
