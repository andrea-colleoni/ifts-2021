package lezione02;

import java.util.Scanner;

public class LetturaDiInteri {

	// calcolo la media di 4 numeri interi
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] interi = new int[5];
		System.out.println("Calcolo della media di 4 interi");
		for(int i= 0; i < interi.length; i++) {
			System.out.print("Inserisci l'intero n. " + i + ": ");
			interi[i] = scanner.nextInt();
		}
		System.out.println();
		// copia-incollato da Array.java
		int somma = 0;
		for(int i = 0; i < interi.length; i++) {
			somma += interi[i];
		}
		float media = (float)somma / (float)interi.length;
		System.out.println("somma: "  + somma + "; media: " + media);
	}

}
