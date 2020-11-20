package lezione03;

import java.util.Scanner;

public class AltriCostruttiControlloDiFlusso {

	public static void main(String[] args) {
		// switch/case
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci un numero tra 1 e 5: ");
		int numero = scanner.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Hai scelto 1");
			break;
		case 2:
			System.out.println("Hai scelto 2");
			break;
		case 3:
			System.out.println("Hai scelto 3");
			break;
		case 4:
			System.out.println("Hai scelto 4");
			break;
		case 5:
			System.out.println("Hai scelto 5");
			break;
		default:
			System.out.println("La scelta non è tra quelle possibili.");
		}
		
		// ciclo while/ do..while
		int i = 0;
		while(i < numero) {  // condizione booleana => se true, continua l'iterazione
			System.out.println("Sono nel ciclo while....");
			i++;
		}
		// altra forma di while....
		// do...while assicura che almeno UNA volta eseguo il code block
		// a differenza di while() che esegue il code block solo se la condizione è vera 
		// (anche la prima iterazione è soggetta alla condizione)
		i = 0;
		do {
			System.out.println("Sono nel ciclo while....");
			i++;
		} while (i < numero);
		System.out.println("programma terminato");
	}

}
