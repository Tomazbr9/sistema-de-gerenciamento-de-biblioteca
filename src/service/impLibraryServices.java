package service;

import enums.BookStatus;

import interfaces.ILibraryServices;

import model.Book;
import model.Student;

import repository.LibraryRepository;
import repository.LoanRepository;

public class ImpLibraryServices implements ILibraryServices {
	
	private final LibraryRepository libraryRepository;
	private final LoanRepository loanRepository;
	
	public ImpLibraryServices(LibraryRepository libraryRepository, LoanRepository loanRepository) {
		this.libraryRepository = libraryRepository;
		this.loanRepository = loanRepository;
	}

	@Override
	public void toLoanBook(Student student, Book book) {
		for(Book item : this.libraryRepository.listBook()) {
			if (item.equals(book)){
				if(book.getStatus() == BookStatus.EMPRESTADO) {
					System.out.println("Livro Indisponivel!");
					break;
				}
				this.loanRepository.loan(student, book);
			    item.setStatus(BookStatus.EMPRESTADO);
			    break;
			}
		}
		
	}

	@Override
	public void registerBook(Book book) {
		this.libraryRepository.addBook(book);
		
	}

	@Override
	public void listAvailableBooks() {
		for(Book book : this.libraryRepository.listBook()) {
			if(book.getStatus().equals(BookStatus.DISPONIVEL)) {
				System.out.println(book);
			}
		}
		
	}

	@Override
	public void returnBook(Student student, Book book) {
		for(Book item : this.libraryRepository.listBook()) {
			if (item.equals(book)){
			    this.loanRepository.returnBook(student);
			    item.setStatus(BookStatus.DISPONIVEL);
			    break;
			}
		}
		
	}

}
