package model;

public class Student {
    private String name;
    private int age;
    private boolean isTeacher;
    
    
    public Student(String name, int age, boolean isTeacher) {
    	this.name = name;
    	this.age = age;
    	this.isTeacher = isTeacher;
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


	public boolean isTeacher() {
		return isTeacher;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
}
