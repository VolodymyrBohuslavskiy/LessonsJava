package Tasks.interfacEs.Testing;

public class main {
    public static void main(String[] args) {
        Man m1 = new Man("Ne", "ga");
        Dude d1 = new Dude(22);

        Igangster ololon = m1;
        ololon.Shut();

        Igangster onononon = d1;
        onononon.pase();


        Runer rt = d1;
        System.out.println(rt.Run());

        Runer ew = m1;
        System.out.println(ew.Run());

    }
}
