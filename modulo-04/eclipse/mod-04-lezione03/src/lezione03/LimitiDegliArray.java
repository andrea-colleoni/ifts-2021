package lezione03;

public class LimitiDegliArray {

	public static void main(String[] args) {
		// gli array hanno dimensione fissa, decisa in fase di dichiarazione
		// => la dimensione di un array NON PUO' essere modificata
		int[] numeri = { 1, 2, 3 };
		
		// problema: come faccio ad inserire un quarto numero?
		int [] temporaneo = new int[4];
		for(int i = 0; i < numeri.length; i++) {
			// copio tutti i valori da numeri => temporaneo
			temporaneo[i] = numeri[i];
		}
		// rimetto nella variabile numeri l'array ingrandito
		// spostando il puntatore di numeri all'oggetto puntato
		// temporaneo
		numeri = temporaneo;
		numeri[3] = 4;
		
	}

}
