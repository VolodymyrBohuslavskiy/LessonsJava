package PostSite;


public class Promote extends Post {

    public String getType() {
        return "Promote";
    }

    public Promote(String titel, String text, Location location, Author user) {
        super(titel, text, location, user);
    }
}
