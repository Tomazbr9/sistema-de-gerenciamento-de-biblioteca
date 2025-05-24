package repository;

import java.util.HashMap;
import java.util.Map;

import model.Student;
import model.Book;

public class LoanRepository {
    Map<String, Book> loans = new HashMap<>();
    
    public void loan(Student student, Book book) {
    	loans.put(student.getName(), book);
    }
    
    public void returnBook(Student student) {
    	loans.remove(student.getName());
    }
}
