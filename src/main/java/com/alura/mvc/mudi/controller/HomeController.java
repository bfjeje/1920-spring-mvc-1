package com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNombreDelProducto("Console Nintendo Switch OLED");
		pedido.setDescripcion("Una descripcion para la nintendo switch");
		pedido.setUrlProducto("https://www.amazon.com.br/Console-Nintendo-Switch-OLED-Branco/dp/B098RKWHHZ/ref=sr_1_7?crid=2VZZ14N9FSTZO&keywords=nintendo+switch&qid=1667086131&qu=eyJxc2MiOiI0LjY5IiwicXNhIjoiNC45MyIsInFzcCI6IjMuNjQifQ%3D%3D&sprefix=%2Caps%2C178&sr=8-7&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
		pedido.setUrlImagen("https://m.media-amazon.com/images/I/61dYrzvBLbL._AC_SX679_.jpg");
		
		List<Pedido> pedidos = Arrays.asList(pedido,pedido,pedido,pedido);
		model.addAttribute("pedidos",pedidos);
		
		return "home";
	}

}
