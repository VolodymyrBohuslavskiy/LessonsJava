package Tasks.interfacEs.Testing;


public class Dude implements Igangster,Runer{
    int age;

    public Dude(int age) {
        this.age = age;
    }

    @Override
    public void Shut() {
        System.out.println( "shut nigga !");
    }

    @Override
    public void pase() {
        System.out.println(this.age + 63);
    }

    @Override
    public String Run() {
        return "9";
    }

    @Override
    public String Der() {
        return null;
    }
}