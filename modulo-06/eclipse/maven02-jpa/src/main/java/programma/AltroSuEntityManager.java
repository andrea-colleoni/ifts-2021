package programma;

import java.util.List;

import javax.persistence.EntityManager;

import model.Cuoco;
import model.Ricetta;
import utility.JpaUtil;

public class AltroSuEntityManager {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getInstance().getEntityManager();
		
		// prelevo un cuoco per id
		Cuoco c = em.find(Cuoco.class, 1);
		for(Ricetta ric : c.getRicette()) {
			System.out.println(ric);
		}
		
		// come fare una query sull'intera tabella?
		// voglio l'elenco delle ricette
		// la query che scrivo in JPA deve essere scritta utlizzando JPQL
		// JPQL è object oriented, case sensitive e non è esattamente SQL
		List<Ricetta> ricette = em.createQuery("select r from Ricetta r", Ricetta.class).getResultList();
		for(Ricetta ric : ricette) {
			System.out.println(ric);
		}
	}

}
