package interfaces;

import model.Book;
import model.Student;

public interface ILibraryServices {
	void registerBook(Book book);
	
	void listAvailableBooks();
    
    void toLoanBook(Student student, Book book);
    
    void returnBook(Student student, Book book);
}
