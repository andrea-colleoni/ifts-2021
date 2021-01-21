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
		l.setCodiceISBN("9780452278905");
		l.setTitolo("The Green Mile");
		l.setNumeroPagine(800);
		
		//l.setGenere(g);
		g.addLibro(l);
		
		/*
		// aggiungo l'autore agli autori del libro
		var autori = new ArrayList<Autore>();
		autori.add(a);
		l.setAutori(autori);
		// aggiungo il libro ai libri dell'autore
		var libri = new ArrayList<Libro>();
		libri.add(l);
		a.setLibri(libri);
		*/
		
		// questo metodo creato nella classe modello, aggiunge in modo 
		// completo (dai due lati dell'associazione) e safe (inizializzando
		// le liste nulle) l'autore al libro
		l.addAutore(a);
		
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
