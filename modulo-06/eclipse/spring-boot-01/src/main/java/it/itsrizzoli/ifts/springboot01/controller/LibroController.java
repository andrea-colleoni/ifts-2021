package it.itsrizzoli.ifts.springboot01.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.itsrizzoli.ifts.springboot01.model.Libro;
import it.itsrizzoli.ifts.springboot01.repository.LibroRepository;

@RestController
public class LibroController {
	
	@Autowired
	private LibroRepository repository;
	
	/* 
	 * 5 metodi:
	 * - tutti i record
	 * - un record data la chiave
	 * - inserire un nuovo record
	 * - modificare un record
	 * - cancellare 1 record
	*/
	
	@GetMapping("/libri")
	public List<Libro> all() {
		return repository.findAll();
	}
	
	@GetMapping("/libri/{codiceISBN}")
	public Libro byISBN(@PathVariable String codiceISBN) {
		return repository
				.findById(codiceISBN)
				.orElseThrow();
	}

}
