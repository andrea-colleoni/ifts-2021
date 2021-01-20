package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	// questa classe funziona come un singleton
	
	private static JpaUtil instance = null;
	
	private EntityManagerFactory emf;
	
	private JpaUtil() {
		emf = Persistence.createEntityManagerFactory("ricette");
	}
	
	public static JpaUtil getInstance() {
		if (instance == null) {
			instance = new JpaUtil();
		}
		return instance;
	}
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
