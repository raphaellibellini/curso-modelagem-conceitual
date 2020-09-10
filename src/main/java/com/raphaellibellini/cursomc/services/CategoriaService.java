package com.raphaellibellini.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphaellibellini.cursomc.domain.Categoria;
import com.raphaellibellini.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//o uso do "@Autowired" faz com que essa dependencia seja automaticamente instanciada pelo Spring
	@Autowired
	private CategoriaRepository repo;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj;
	}
}
