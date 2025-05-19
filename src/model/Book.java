package model;

import enums.BookStatus;

public class Book {
    private String title;
    private String autor;
    private BookStatus status;
    
    public Book(String title, String autor, BookStatus status) {
    	this.title = title;
    	this.autor = autor;
    	this.status = status;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public BookStatus getStatus() {
		return status;
	}

	public void setStatus(BookStatus status) {
		this.status = status;
	}
}
