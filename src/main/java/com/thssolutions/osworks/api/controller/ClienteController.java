package com.thssolutions.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thssolutions.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

/*	
	@GetMapping("/clientes")
	public String listar() {
			return "Teste";
	}
*/

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João das Coves");
		cliente1.setTelefone("13991915116");
		cliente1.setEmail("tr.rodrigo@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria da Silva");
		cliente2.setTelefone("13991915116");
		cliente2.setEmail("maria@gmail.com");	
		
		return Arrays.asList(cliente1, cliente2); 
	}
	
}
