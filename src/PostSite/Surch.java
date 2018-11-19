package PostSite;


public class Surch extends Post {

    public String getType() {
        return "Surch";
    }

    public Surch(String titel, String text, Location location, Author user) {
        super(titel, text, location, user);
    }
}
