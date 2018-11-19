package PostSite;

import lombok.Data;

@Data
public abstract class Post {
    private String titel, text;
    private Location location;
    private Author user;

    private String type;

    public Post(String titel, String text, Location location, Author user) {
        this.titel = titel;
        this.text = text;
        this.location = location;
        this.user = user;
    }
}
