import java.lang.*;

public class bookTest {
    public static void main(String args[]){
        book Book1 = new book(1928);
        book Book2 = new book("Travels", "Nike", 2000);
        book Book3 = new book("Kitchen", "N/A", -523);

        System.out.println(Book1);

        Book1.setAuthor("Ara");
        Book1.setName("Smth");

        System.out.println();
        Book1.getInfo();
        Book2.getInfo();
        Book3.getInfo();
    }
}
