package br.com.bonatto.Justore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private String urlImagem;
	
	private double preco;

	
	
	

	public Produto(String nome, String descricao, String urlImagem, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.urlImagem = urlImagem;
		this.preco = preco;
	}

	
	public Produto()
	{}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}
	public String getUrlImagem() {
		return urlImagem;
	}

	public double getPreco() {
		return preco;
	}
	
	
}
