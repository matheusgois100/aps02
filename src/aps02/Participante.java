package aps02;

public class Participante {
	private String nome;
	private String email;
	
	public Participante(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
}
