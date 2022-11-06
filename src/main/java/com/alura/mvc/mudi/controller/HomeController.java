package com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alura.mvc.mudi.model.Pedido;
import com.alura.mvc.mudi.repository.PedidosRepository;

@Controller
public class HomeController {
	
	@Autowired
	PedidosRepository repository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Pedido> pedidos = repository.recuperaTodosLosPedidos();
		model.addAttribute("pedidos",pedidos);
		return "home";
	}
}
