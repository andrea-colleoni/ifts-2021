package lezione02;

public class ChiamateDiMetodo {

	public static void main(String[] args) {
		System.out.println("inizio...");
		// questa è una chimata di metodo
		// metodo1() è il chiamato; main() è il chiamante
		String risultato = metodo1();
		System.out.println("risultato della chiamata: " + risultato);
		metodo2("dal main");
		System.out.println("fine del programma");
	}
	
	// questo metodo dichiara che quando funziona è in grado di 
	// restituire a chi lo chiama un valore di tipo String
	static String metodo1() {
		System.out.println("sono nel metodo 1");
		// le chiamate al metodo2() devono specificare una String come argomento
		metodo2("dal metodo1");
		System.out.println("fine del metodo 1");
		// return serve per restituire al chiamante il risultato
		// dell'esecuzione di questo metodo (che è una String)
		return "ho finito.... son contento";
	}
	
	// questo metodo dichiara di aver bisogno di un argomento
	// di tipo String per poter funzionare
	static void metodo2(String argomento) {
		System.out.println("sono nel metodo 2 => " + argomento);
		// se io chiamassi il metodo1() entrerei
		// in un loop infinito: stack overflow
		// metodo1();
	}

}
