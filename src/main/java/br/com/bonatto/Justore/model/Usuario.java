package br.com.bonatto.Justore.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario 
{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String usuario;
	
	private String senha;
	
	
	
	public Usuario() {
		
	}


	public Usuario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}


	public Long getId() {
		return id;
	}


	public String getUsuario() {
		return usuario;
	}


	public String getSenha() {
		return senha;
	}
	
	
	
}
