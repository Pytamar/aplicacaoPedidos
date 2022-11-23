package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date mesAniversario;
	
	
	
	public Client() {
		
	}
	
	public Client(String nome, String email, Date mesAniversario) {
		this.nome = nome;
		this.email = email;
		this.mesAniversario = mesAniversario;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(Date mesAniversario) {
		this.mesAniversario = mesAniversario;
	}

	public String toString() {
		return nome + " (" + sdf.format(mesAniversario) + ") - " + email;
	}
	
}	
