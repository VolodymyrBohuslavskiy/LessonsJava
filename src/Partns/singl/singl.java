package Partns.singl;


public class singl {

    public static void main(String[] args) {
President ononoon= President.getInstance("Lupo");
President ononoo1= President.getInstance("Zero");

        System.out.println(ononoon);

    }
}



class President{
    private String name;
    private static President pr=new President();

    public President() {
    }

    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                '}';
    }

    public static President getInstance(String name) {
        pr.name=name;
        return pr;
    }
}
