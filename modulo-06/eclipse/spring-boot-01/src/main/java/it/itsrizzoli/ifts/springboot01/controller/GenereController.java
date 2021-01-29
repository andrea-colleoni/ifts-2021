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
import it.itsrizzoli.ifts.springboot01.model.Genere;
import it.itsrizzoli.ifts.springboot01.model.Libro;
import it.itsrizzoli.ifts.springboot01.repository.GenereRepository;
import it.itsrizzoli.ifts.springboot01.repository.LibroRepository;

@RestController
public class GenereController {
	
	@Autowired
	private GenereRepository genRepo;
	@Autowired
	private LibroRepository bookRepo;
	
	/* 
	 * 5 metodi:
	 * - tutti i record (GET collezione)
	 * - un record data la chiave (GET item)
	 * - inserire un nuovo record (POST collezione)
	 * - modificare un record (PUT item)
	 * - cancellare 1 record (DELETE item)
	*/
	
	@GetMapping("/generi")
	public List<Genere> all() {
		return genRepo.findAll();
	}
	
	@GetMapping("/generi/{id}")
	public Genere byISBN(@PathVariable Integer id) {
		return genRepo
				.findById(id)
				.orElseThrow(() -> new NotFoundException());
	}
	
	@PostMapping("/generi")
	public Genere inserisci(@RequestBody Genere genere) {
		return genRepo.save(genere);
	}
	
	@PostMapping(path = "/generi/{id}/libri", consumes = {"application/json"})
	public Libro inserisciLibro(@PathVariable Integer id, @RequestBody Libro libro) {
		return genRepo
			.findById(id)
			.map(g -> {
				g.addLibro(libro);
				genRepo.save(g);
				return libro;
			})
			.orElseThrow(() -> new NotFoundException());
	}
	
	@PostMapping(path = "/generi/{id}/libri/{codiceISBN}")
	public void inserisciLibroPerISBN(@PathVariable Integer id, @PathVariable String codiceISBN) {
		var optGen = genRepo.findById(id);
		
		optGen.ifPresentOrElse(g -> {
			bookRepo.findById(codiceISBN)
			.map(l -> {
				g.addLibro(l);
				genRepo.save(g);
				return l;
			})
			.orElseThrow(() -> new NotFoundException());
		},
		() -> {
			throw new NotFoundException();	
		});
	}
	
	@PutMapping("/generi/{id}")
	public Genere aggiorna(@RequestBody Genere genere, @PathVariable Integer id) {
		return genRepo
			.findById(id)
			.map(a -> {
				a.setNome(genere.getNome());
				a.setLibri(genere.getLibri());
				return genRepo.save(a);
			})
			.orElseGet(() -> {
				genere.setIdGenere(id);
				return genRepo.save(genere);
			});
	}
	
	@DeleteMapping("/generi/{id}")
	public void eimina(@PathVariable Integer id) {
		genRepo.delete(genRepo
			.findById(id)
			.orElseThrow(() -> new NotFoundException())
			);
	}

}
