package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.Autor;
import com.examen.service.AutorService;

@RestController
@RequestMapping("/api/rest/autor")
public class AutorController {
	
	@Autowired
	private AutorService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Autor>> listaAutor(){
		return ResponseEntity.ok(service.listaAutor());
	}
	
	@GetMapping("/porNombre/{filtro}")
	public ResponseEntity<List<Autor>> listaPorNombre(@PathVariable String filtro)
	{
		return ResponseEntity.ok(service.listaAutorPorNombre(filtro));
	}
}
