package lezione03;

import java.util.ArrayList;
import java.util.Scanner;

public class EsempiArrayList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numeri = new ArrayList<>();
		System.out.println("Calcolo della media (digita * per terminare linserimento)");
		System.out.print("Inserisci l'intero n. " + (numeri.size()  + 1) + ": ");
		String valoreLetto = scanner.nextLine();
		
		// ! : è l'operatore logico NOT, esprime la negazione
		// equals(): serve per confrontare due oggetti; gli oggetti non si possono confrontare usando
		//           gli operatori di confronto (==, !=, <, >, <=, >=)
		while(!valoreLetto.equals("*")) {
			// devo trasformare la stringa in numero (parse)
			numeri.add(Integer.parseInt(valoreLetto));
			System.out.print("Inserisci l'intero n. " + (numeri.size()  + 1) + ": ");
			valoreLetto = scanner.nextLine();
		}
		int somma = 0;
		for(int n : numeri) {
			somma += n;
		}
		
		System.out.println("La somma dei " + numeri.size() + " numeri è: " + somma);
		System.out.println("La media dei " + numeri.size() + " numeri è: " + ((float)somma / (float)numeri.size()));

	}

}
