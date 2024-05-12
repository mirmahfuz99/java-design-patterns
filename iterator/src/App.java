import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<Book> bookList = Arrays.asList(
            new Book(10, "science"),
            new Book(10, "Computer Science"),
            new Book(10, "Math")

        );

        Library lib =new Library(bookList);
        Iterator iterator = lib.createIterator();

        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }

    }
}
