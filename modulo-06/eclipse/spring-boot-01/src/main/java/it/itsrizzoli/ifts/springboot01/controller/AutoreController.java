package it.itsrizzoli.ifts.springboot01.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.itsrizzoli.ifts.springboot01.exceptions.NotFoundException;
import it.itsrizzoli.ifts.springboot01.model.Autore;
import it.itsrizzoli.ifts.springboot01.repository.AutoreRepository;

@RestController
public class AutoreController {
	
	@Autowired
	private AutoreRepository repository;
	
	/* 
	 * 5 metodi:
	 * - tutti i record (GET collezione)
	 * - un record data la chiave (GET item)
	 * - inserire un nuovo record (POST collezione)
	 * - modificare un record (PUT item)
	 * - cancellare 1 record (DELETE item)
	*/
	
	@GetMapping("/autori")
	public List<Autore> all() {
		return repository.findAll();
	}
	
	@GetMapping("/autori/{id}")
	public Autore byISBN(@PathVariable Integer id) {
		return repository
				.findById(id)
				.orElseThrow(() -> new NotFoundException());
	}
	
	@PostMapping("/autori")
	public Autore inserisci(@RequestBody Autore autore) {
		return repository.save(autore);
	}
	
	@PutMapping("/autori/{id}")
	public Autore aggiorna(@RequestBody Autore autore, @PathVariable Integer id) {
		return repository
			.findById(id)
			.map(a -> {
				a.setNome(autore.getNome());
				a.setLibri(autore.getLibri());
				return repository.save(a);
			})
			.orElseGet(() -> {
				autore.setIdAutore(id);
				return repository.save(autore);
			});
	}
	
	@DeleteMapping("/autori/{id}")
	public void eimina(@PathVariable Integer id) {
		repository.delete(repository
			.findById(id)
			.orElseThrow(() -> new NotFoundException())
			);
	}

}
