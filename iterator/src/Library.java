import java.util.List;

public class Library implements Aggregate{
    private List<Book> bookList;

    public Library(List<Book> books){
        this.bookList = books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }

    
}
