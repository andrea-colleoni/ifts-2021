package programma;

import java.util.List;

import javax.persistence.EntityManager;

import model.Ricetta;
import utility.JpaUtil;

public class AssociazioniConEntityManager {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getInstance().getEntityManager();
		
		// elenco dei cuochi delle ricette di categoria 1
		//Categoria primi = em.find(Categoria.class, 1);
		List<Ricetta> primi = em
				.createQuery("select r from Ricetta r where r.categoria.nomeCategoria = 'Primi'", Ricetta.class)
				.getResultList();
		
		//for(Ricetta r: primi.getRicette()) {
		for(Ricetta r: primi) {
			System.out.println(r.getNomeRicetta() + ": " + r.getCuoco());
		}
	}

}
