package br.com.bonatto.Justore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bonatto.Justore.dro.RequisicaoLogin;
import br.com.bonatto.Justore.model.Produto;
import br.com.bonatto.Justore.repository.ProdutoRepository;


@Controller
@RequestMapping("/home")
public class HomeController {

	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping()
	public String home( RequisicaoLogin requisicao)
	{
		return "home";
	}
	
	
	@GetMapping("/init")
	public String init(Model model)
	{
		
		
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("produtos" , produtos);
		
		return "init";
	}
}
