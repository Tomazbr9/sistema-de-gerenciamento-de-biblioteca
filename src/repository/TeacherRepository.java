package repository;

import interfaces.IPersonRepository;

import java.util.ArrayList;
import java.util.List;

import model.Teacher;

public class TeacherRepository implements IPersonRepository<Teacher> {
	List<Teacher> teachers = new ArrayList<>();
    
    public void add(Teacher teacher) {
    	teachers.add(teacher);
    }
    
    public List<Teacher> list() {
    	return teachers;
    }
}
