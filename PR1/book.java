import java.lang.*;

public class book {
    private String name = "Book";
    private String author = "N/A";
    private int publishing_year;

    public book(int year){
        publishing_year = year;
    }

    public book(String name_1, String auth, int year){
        name = name_1;
        author = auth;
        publishing_year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublishing_year(int publishing_year) {
        this.publishing_year = publishing_year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPublishing_year() {
        return publishing_year;
    }

    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing_year=" + publishing_year +
                '}';
    }

    public void getInfo(){
        System.out.println(this);
    }
}
