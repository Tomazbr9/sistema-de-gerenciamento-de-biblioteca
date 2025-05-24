package repository;

import interfaces.IPerson;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentRepository implements IPerson<Student> {
    List<Student> students = new ArrayList<>();
    
    public void add(Student student) {
    	students.add(student);
    }
    
    public List<Student> list() {
    	return students;
    }
}
