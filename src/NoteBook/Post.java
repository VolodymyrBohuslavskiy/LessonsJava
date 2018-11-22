package NoteBook;


import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Post {
     private String title, text, date,plase,contact;
     User user;
    NoteType noteType;



/*abstract class PostBilder{
    protected Post post;
}*/



    }



