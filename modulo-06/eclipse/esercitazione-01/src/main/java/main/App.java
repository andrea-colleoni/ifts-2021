package main;

import java.util.ArrayList;

import model.Autore;
import model.Genere;
import model.Libro;
import util.JpaUtilSingleton;

public class App {

	public static void main(String[] args) {
		var em = JpaUtilSingleton.getInstance().getEntityManager();
		
		Genere g = new Genere();
		g.setNome("Giallo");
		
		Autore a = new Autore();
		a.setNome("Stephen King");
		
		Libro l = new Libro();
		l.setCodiceISBN("9780340364772");
		l.setTitolo("It");
		l.setNumeroPagine(800);
		
		l.setGenere(g);
		var autori = new ArrayList<Autore>();
		autori.add(a);
		l.setAutori(autori);
		try {
			// le operazioni di MODIFICA dei dati devono stare in una transazione
			em.getTransaction().begin(); // inizio
			
			//em.persist(a); // non è necessario aggiungere l'autore perché ho cascade ALL sull'associazione libro > autori
			em.persist(l);
			//em.persist(g); // non è necessario aggiungere il genere perché ho cascade ALL sull'associazione libro > genere
			
			em.getTransaction().commit(); // fine SUCCESSFUL
			// em.getTransaction().rollback(); // fine NOT SUCCESSFUL
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
