package br.com.bonatto.Justore.dro.usuario;

import br.com.bonatto.Justore.model.Usuario;
import br.com.bonatto.Justore.validacao.CadastroUsuarioValido;
import jakarta.validation.constraints.NotBlank;

@CadastroUsuarioValido
public class RequisicaoCadastroUsuario 
{

	@NotBlank
	private String usuario;
	
	@NotBlank
	private String senha;
	
	private String senhaConfirmacao;

	
	public Usuario converteUsuario()
	{
		return new Usuario(usuario, senha);
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenhaConfirmacao() {
		return senhaConfirmacao;
	}

	public void setSenhaConfirmacao(String senhaConfirmacao) {
		this.senhaConfirmacao = senhaConfirmacao;
	}
	
	
	
}
