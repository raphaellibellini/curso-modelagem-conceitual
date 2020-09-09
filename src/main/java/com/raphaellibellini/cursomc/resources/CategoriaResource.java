package com.raphaellibellini.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias") //endpoint
public class CategoriaResource {
	
	//é importante atribuir os métodos REST para cada método
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!";
	}
}
