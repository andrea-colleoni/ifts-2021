package lezione02;

public class Oggetti {

	// non tutte le classi sono eseguibili
	// non tutte le classi vengono progettate
	// per essere eseguite direttamente
	public static void main(String[] args) {
		// istanzio un nuovo oggetto di classe Utente
		// e lo assegno alla variabile
		
		// il metodo costruttore ha il compito di
		// riservare la memoria necessaria a rappresentare
		// l'oggetto nell'HEAP
		// è obbligatorio chiamarlo con "new"
		Utente a = new Utente(); // metodo costruttore
		a.nome = "Andrea";
		a.cognome = "Colleoni";
		
		Utente b = new Utente();
		b.nome = "Luigi";
		b.cognome = "Rossi";
		// andrea e luigi: sono oggetti di tipo Utente
		
		a.saluta();
		b.saluta();
		
		a.aletzzaInCm = 185;
		b.pesoInKg = 85.3F;
		
	}

}
