package lezione01;

public class ControlloDiFlusso {

	public static void main(String[] args) {
		// branching con if
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
		System.out.println("fine del programma");
	}

}
