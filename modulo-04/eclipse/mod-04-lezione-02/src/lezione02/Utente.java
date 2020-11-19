package lezione02;

public class Utente {
	// le variabili definite in questa 
	// parte della classe, vengono chiamate 
	// campi (fields)
	
	String nome;
	String cognome;
	String email;
	String numeroTelefono;
	int altezzaInCm;
	float pesoInKg;
	
	// void indica che questo metodo
	// non "restituisce" niente
	void saluta() {
		// corpo del metodo
		System.out.println("ciao, io sono " + nome);
	}
}
