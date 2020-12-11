package com.examen.service;

import java.util.List;

import com.examen.entity.Autor;

public interface AutorService {
	
	public List<Autor> listaAutor();
	public List<Autor> listaAutorPorNombre(String nombres);

}
