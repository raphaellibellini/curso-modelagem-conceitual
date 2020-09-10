package com.raphaellibellini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphaellibellini.cursomc.domain.Categoria;

@Repository
//Integer = tipo do atributo identificador da classe
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}
