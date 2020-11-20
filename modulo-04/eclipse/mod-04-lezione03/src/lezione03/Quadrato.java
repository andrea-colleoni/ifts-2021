package lezione03;

public class Quadrato {
	// campo, o variabile d'istanza
	int lato;
	
	static int numeroLati = 4;
	// se usassi final, numeroLati non sarebbe più modificabile da nessuno
	// le dichiarazioni final, sono assegnabili una sola volta
	// SOLO NEL MOMENTO STESSO DELLA DICHIARAZIONE
	// successivamente non possono essere più modificate
	
	// metodo che restituisce un int
	int perimetro() {
		String nome = "Il quadrato";
		return lato * numeroLati;
	}
	
	int area() {
		return (int)Math.pow(lato, 2);
	}
}
