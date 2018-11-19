package PostSite;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Post {
    private String titel, text;
    private Location location;
    private Author user;
}
