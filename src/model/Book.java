package model;

import java.util.Objects;

import enums.BookStatus;

public class Book {
    private String title;
    private String autor;
    private BookStatus status;
    
    public Book(String title, String autor) {
    	this.title = title;
    	this.autor = autor;
    	this.status = BookStatus.DISPONIVEL;
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", autor=" + autor + ", status=" + status + "]";
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
