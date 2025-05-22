package service;

import model.Book;

public interface ILibraryServices {
	
	void registerBook(Book book);
	
	void listAvailableBooks();
    
    void toLoanBook(Book book);
    
    void returnBook(Book book);
}
