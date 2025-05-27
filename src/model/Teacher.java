package model;

public class Teacher {
    private String nome;
    private String password;
    private boolean isTeacher;
    
	public Teacher(String nome, String password, boolean isTeacher) {
		this.nome = nome;
		this.password = password;
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
	
	 public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
    
    
}
