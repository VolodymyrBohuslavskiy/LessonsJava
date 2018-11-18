package exception;

public class Main {
    public static void main(String[] args) {

        int i = 2;
        try {
            System.out.println(5 / i);
        } catch (Exception e) {
            System.out.println("Eror, nev value is " + 5 / ++i);
        } finally {
            System.out.println("finally завжди відпрацьовує !");
        }

        try {
            QWE(12, 0);
        } catch (Exception e) {
            System.out.println("Error :)");
        }


    }

    private static void QWE(int a, int b) throws Exception {
        System.out.println(a / b);
    }

}
