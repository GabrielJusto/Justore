package br.com.bonatto.Justore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bonatto.Justore.dro.RequisicaoLogin;


@Controller
@RequestMapping("/home")
public class HomeController {

	
	@GetMapping()
	public String home( RequisicaoLogin requisicao)
	{
		return "home";
	}
}
