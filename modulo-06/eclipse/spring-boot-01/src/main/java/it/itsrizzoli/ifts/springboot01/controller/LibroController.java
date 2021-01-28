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
	
	@PostMapping("/libri")
	public Libro inserisci(@RequestBody Libro libro) {
		return repository.save(libro);
	}
	
	@PutMapping("/libri/{codiceISBN}")
	public Libro aggiorna(@RequestBody Libro libro, @PathVariable String codiceISBN) {
		repository
				.findById(codiceISBN)
				.ifPresentOrElse((l) -> {
					l.setAutori(libro.getAutori());
					l.setDataPubblicazione(libro.getDataPubblicazione());
					l.setGenere(libro.getGenere());
					l.setNumeroPagine(libro.getNumeroPagine());
					l.setTitolo(libro.getTitolo());
					repository.save(l);
				}, () -> {
					repository.save(libro);
				});
		return repository.findById(codiceISBN).get();
	}
	
	@DeleteMapping("/libri/{codiceISBN}")
	public void eimina(@PathVariable String codiceISBN) {
		repository.deleteById(codiceISBN);
	}

}
