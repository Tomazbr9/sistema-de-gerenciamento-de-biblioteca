package model;

public class Teacher {
    private String nome;
    private boolean isTeacher;

	public Teacher(String nome, boolean isTeacher) {
		this.nome = nome;
		this.isTeacher = isTeacher;
	}

	public boolean isTeacher() {
		return isTeacher;
	}


	@Override
	public String toString() {
		return "Teacher [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
    
}
