package programma;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Ricetta;

public class UsoDiEntityManager {

	public static void main(String[] args) {
		// uso il nome della persistence unit configurata in persistence.xml
		// per caricare tutta la configurazione della connessione al DB
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ricette");
		EntityManager em = emf.createEntityManager();
		
		Ricetta r = new Ricetta();
		r.setNomeRicetta("Macceroni ai formaggi");
		r.setDifficolta(3);
		r.setIdCategoria(1);
		
		// una transazione è un perimetro dentro al quale posso fare modifiche
		// ai dati sul DB
		em.getTransaction().begin();
		// salvo la ricetta sul DB
		em.persist(r);
		em.getTransaction().commit();
		
		// leggo un record dal DB
		Ricetta arrosto = em.find(Ricetta.class, 1005);
		System.out.println(arrosto);
	}

}
