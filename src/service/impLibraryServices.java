package service;

import enums.BookStatus;
import model.Book;
import repository.LibraryRepository;

public class ImpLibraryServices implements ILibraryServices {
	
	private final LibraryRepository repository;
	
	public ImpLibraryServices(LibraryRepository repository) {
		this.repository = repository;
	}

	@Override
	public void toLoanBook(Book book) {
		for(Book item : this.repository.listBook()) {
			if (item.equals(book)){
			    item.setStatus(BookStatus.EMPRESTADO);
			    break;
			}
		}
		
	}

	@Override
	public void registerBook(Book book) {
		this.repository.addBook(book);
		
	}

	@Override
	public void listAvailableBooks() {
		for(Book book : this.repository.listBook()) {
			if(book.getStatus().equals(BookStatus.DISPONIVEL)) {
				System.out.println(book);
			}
		}
		
	}

	@Override
	public void returnBook(Book book) {
		for(Book item : this.repository.listBook()) {
			if (item.equals(book)){
			    item.setStatus(BookStatus.DISPONIVEL);
			    break;
			}
		}
		
	}

}
