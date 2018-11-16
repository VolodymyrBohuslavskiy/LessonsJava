package PT;

public class Main {
    public static void main(String[] args) {

        TV samsung = new TV("aD56656", true, 0.1, 17.3, true);
        Wash indezit = new Wash("156as15wd6", true, 0.5, 1200, false);
        NoteBook dell = new NoteBook("564q6wd5", true, 3000, 15.3, "Win", "i5", 6000);
        SmatPhone mi = new SmatPhone("5631a2d5", true, 3000, 5, "Andr", 13.2, true);


        Process(samsung);
        System.out.println("____________");
        Process(indezit);
        System.out.println("____________");
        Process(dell);
        System.out.println("____________");
        Process(mi);
mi.Star();
    }

    private static void Process(All thin) {
        System.out.println("Start");
        Work ololool = thin;
        ololool.DoSone();
        System.out.println("Finish");
    }

}
