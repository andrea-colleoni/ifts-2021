package main;

import java.util.Date;

import model.Autore;
import model.Genere;
import model.Libro;
import util.JpaUtilSingleton;

public class ProgrammaCRUD {

	public static void main(String[] args) {
		var em = JpaUtilSingleton.getInstance().getEntityManager();
		// voglio inserire un nuovo libro di Stephen King
		var nomeAutore = "Dante Alighieri";
		
		var autori = em
				.createQuery("select a from Autore a where a.nome = :nome", Autore.class)
				.setParameter("nome", nomeAutore)
			    .getResultList();
		Autore autore;
		
		em.getTransaction().begin();
		
		if (autori.size() == 1) {
			autore = autori.get(0);
		} else {
			autore = new Autore();
			autore.setNome(nomeAutore);
			em.persist(autore);  // aggiunge al DB un nuovo oggetto
		}
			
		Genere g = em.find(Genere.class, 1);
		
		Libro l = new Libro();
		l.setCodiceISBN("3456");
		l.setTitolo("La Divina Commedia");
		l.setGenere(g);
		
		// quando aggiungo un libro, viene inserito perché
		// ho impostato cascade ALL su tutte le associazioni
		autore.addLibro(l); 
		
		em.getTransaction().commit();
		
		// modifica delle date => tutte le modifiche che faccio all'oggetto
		// in una transazione, si riflettono sul DB al commit
		em.getTransaction().begin();
		var libri = em.createQuery("select l from Libro l", Libro.class).getResultList();
		for(var lib : libri) {
			lib.setDataPubblicazione(new Date());
		}
		em.getTransaction().commit();
		
		
		// elimino i libri che hanno "..." nel titolo (sempre in una transazione)
		em.getTransaction().begin();
		var daEliminare = em.createQuery("select l from Libro l where l.titolo = 'Altro libro di Dante'", Libro.class)
				.getResultList();
		for(var lib : daEliminare) {
			em.remove(lib); // toglie un oggetto dal DB
		}
		em.getTransaction().commit();
	}

}
