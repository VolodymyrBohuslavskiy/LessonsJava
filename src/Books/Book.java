package Books;

public class Book {

    private String name, author;
    private int id=main.i++, yer;

    public Book(String name, String author, int yer) {
        this.name = name;
        this.author = author;
        this.yer = yer;
    }




    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public int getYer() {
        return yer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYer(int yer) {
        this.yer = yer;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (yer != book.yer) return false;
        if (!name.equals(book.name)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + id;
        result = 31 * result + yer;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                ", yer=" + yer +
                '}';
    }



}
