package lezione03;

public class Ordinamento {

	public static void main(String[] args) {
		// bubble sort: algoritmo di ordinamento
		int[] numeri = { 10, 30, 1, 5, 18, -4, 20, 3, 32, 18, 6 };
		
		// i è l'indice più basso
		// j è sempre > i
		for(int i = 0; i < numeri.length - 1; i++) {
			for(int j = i + 1; j < numeri.length; j++) {
				if (numeri[j] < numeri[i]) {
					// devo scambiare
					int appoggio = numeri[j];
					numeri[j] = numeri[i];
					numeri[i] = appoggio;
				}
			}
		}
		for(int n : numeri) {
			System.out.println(n);
		}

	}

}
