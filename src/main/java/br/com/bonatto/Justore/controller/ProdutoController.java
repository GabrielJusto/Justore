package br.com.bonatto.Justore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bonatto.Justore.dro.produto.RequisicaoCadastroProduto;
import br.com.bonatto.Justore.repository.ProdutoRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	
	
	
	@Autowired
	ProdutoRepository repository;
	
	@GetMapping("/cadastro")
	public String cadastro(RequisicaoCadastroProduto requisicao)
	{
		return "produto/cadastro";
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@Valid RequisicaoCadastroProduto requisicao, BindingResult result)
	{
		if(result.hasErrors())
			return "produto/cadastro";
		
		repository.save(requisicao.converteProduto());
		return "redirect:/home/init";
	}

}
