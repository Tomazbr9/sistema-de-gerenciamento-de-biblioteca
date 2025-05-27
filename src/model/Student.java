package model;

public class Student {
    private String name;
    private String password;
    private boolean isTeacher;
    
    public Student(String name, String password, boolean isTeacher) {
    	this.name = name;
        this.password = password;
    	this.isTeacher = isTeacher;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isTeacher() {
		return isTeacher;
	}

	public void setTeacher(boolean isTeacher) {
		this.isTeacher = isTeacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



