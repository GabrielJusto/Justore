package br.com.bonatto.Justore.dro.produto;

import br.com.bonatto.Justore.model.Produto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RequisicaoCadastroProduto 
{

	@NotBlank
	private String nome;
	
	@NotNull
	private double preco;
	
	private String descricao;
	
	private String urlImagem;

	
	public Produto converteProduto()
	{
		return new Produto(nome, descricao, urlImagem, preco);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getUrlImagem() {
		return urlImagem;
	}


	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	
	
	
}
