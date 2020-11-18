package lezione01;

public class ControlloDiFlusso {

	public static void main(String[] args) {
		// branching (ramificazione) con if
		int a = 10;
		System.out.println("inizio del programma");
		if (a > 20) {
			// a > 20; condizione => deve essere boolean (true o false)
			// { ... }: code block => è una porzione di programma
			System.out.println("a è maggiore di 20!");
			System.out.println("....");
			System.out.println("....");
		} else if (a < 5) {
			// else if (ne posso mettere n) è opzionale; 
			// viene eseguita se le condizioni precedenti sono false
			System.out.println("a è minore di 5");
		} else {
			// else è opzionale; viene eseguita se TUTTE le condizioni precedenti sono false
			System.out.println("a è compreso tra 5 e 20");
		}
		System.out.println("-----");
		// looping (ciclo) con for
		// for (istr 1; istr 2; istr 3)
		// istr 1: viene eseguita solo UNA volta prima di entrare
		//         nel ciclo
		// istr 2: (boolean) viene verificata prima di ogni iterazione
		//         è la condizione di permanenza nel ciclo
		// istr 3: viene eseguita ad ogni fine ciclo
		for (int i = 0; i < 10; i += 2) {
			System.out.println("istruzione n. 1 ripetuta => iterazione n." + i);
		}
		// System.out.println("valore di i alla fine del ciclo: " + i); // NO!!
		System.out.println("-----");
		// casi limite
		int j = 0;
		for (; j < 10; j += 2) {
			System.out.println("istruzione n. 2 ripetuta => iterazione n." + j);
		}
		System.out.println("valore di j alla fine del ciclo: " + j);
		System.out.println("-----");
		int k = 0;
		for (; k < 10;) {
			System.out.println("istruzione n. 3 ripetuta");
			k += 2;
		}
		System.out.println("-----");
		int h = 0;
		for(;;) {
			if (h >= 10) {
				break; // istruzione che mi permette di uscire da un loop
			}
			System.out.println("istruzione n. 4 ripetuta");
			h += 2;
		}
		System.out.println("fine del programma");
	}

}
