package service;

import java.util.List;

import model.Student;
import repository.StudentRepository;
import repository.TeacherRepository;

public class PersonServices {
	
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;
    
	public PersonServices(StudentRepository studentRepository, TeacherRepository techaerRepository) {
		this.studentRepository = studentRepository;
		this.teacherRepository = techaerRepository;
	}
	
	public boolean loginStudent(String name, String password) {
		
		if (this.studentRepository.list().isEmpty()) {
			for(Student student : this.studentRepository.list()) {
			    if(student.getName() == name && student.getPassword() == password) {
			    	System.out.println("Estudante logado com sucesso");
			    	return true;
			    }
			    else {
			    	System.out.println("Estudante não encontrado");
			    	return false;
			    }
			
			}
		}
		else {
			System.out.println("Não há estudantes cadastrados");
			return false;
		}
	}
}
