package repository;
import model.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
	
    List<Book> books = new ArrayList<>();
    
    public void addBook(Book book) {
    	books.add(book);
    }
    
    public List<Book> listBook() {
    	return books;
    }
}
