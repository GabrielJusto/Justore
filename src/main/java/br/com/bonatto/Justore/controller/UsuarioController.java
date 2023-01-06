package br.com.bonatto.Justore.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bonatto.Justore.dro.RequisicaoLogin;
import br.com.bonatto.Justore.dro.usuario.RequisicaoCadastroUsuario;
import br.com.bonatto.Justore.model.Usuario;
import br.com.bonatto.Justore.repository.UsuarioRepository;
import jakarta.validation.Valid;


@Controller
@RequestMapping("/usuario")
public class UsuarioController 
{
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/login")
	public String login(@Valid RequisicaoLogin requisicao, BindingResult result, Model model)
	{
		
		if(result.hasErrors())
			return "home";
		
		List<Usuario> usu = usuarioRepository.findByUsuario(requisicao.getUsuario());
		if(usu.size() > 0 && usu.get(0).getSenha().equals(requisicao.getSenha()))
			return "init";
		
		
		return "redirect:/home";
	}
	
	@GetMapping("/cadastro")
	public String cadastro(RequisicaoCadastroUsuario requisicao)
	{
		
		return "usuario/cadastro";
	}
	
	
	@PostMapping("/cadastrar")
	public String cadastrar(@Valid RequisicaoCadastroUsuario requisicao, BindingResult result)
	{
		if(result.hasErrors())
			return "usuario/cadastro";
		
		usuarioRepository.save(requisicao.converteUsuario());
		return "redirect:/home";
	}
	
	
}
