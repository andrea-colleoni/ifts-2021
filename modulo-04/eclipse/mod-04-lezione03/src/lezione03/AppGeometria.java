package lezione03;

import java.util.Scanner;
// AppGeometria è un identificatore che vale nell'ambito package = lezione03
public class AppGeometria {
	// i code block delimitano gli scope
	
	// main è identificatore di metodo e vale nella class AppGeometria
	public static void main(String[] args) {
		// args è una dichiarazione che avviene nell'argomento del metodo
		// l'argomento del metodo vale nello scope del metodo
		// quindi args vale nello scope main()
		
		// due dichiarazioni: s e figura => valgono nello scope main()
		Scanner scanner = new Scanner(System.in);
		Quadrato.numeroLati = 5;
		System.out.println("Scegliere una figura dall'elenco:");
		System.out.println("q: Quadrato");
		System.out.print("Fai la tua scelta > ");
		String figura = scanner.nextLine();
		switch(figura) {
		case "q":
			quadrato();
			break;
		default:
			System.out.println("Scelta non riconosciuta");	
		}
		
		System.out.println(Math.PI);
		// Math.PI = 12;
	}
	
	// quadrato è identificatore di metodo e vale nella class AppGeometria
	static void quadrato() {
		System.out.print("Dimmi la misura del lato > ");
		// questo scanner NON È lo steesso scanner che c'è nel main()
		Scanner scanner = new Scanner(System.in);
		int lato = scanner.nextInt();
		Quadrato q = new Quadrato();				
		q.lato = lato;
		System.out.println("Perimetro: " + q.perimetro());
		System.out.println("Area: " + q.area());
		
		Quadrato q2 = new Quadrato();				
		q2.lato = lato;
		System.out.println("Perimetro: " + q2.perimetro());
		System.out.println("Area: " + q2.area());
	}

}
