package lezione01.esercizi;

public class Esercizio2_02 {

	public static void main(String[] args) {
		int a;
		int b;
		
		a = 2;
		b = 7;
		int somma = 0;
		for(int i = Math.min(a,  b); i <= Math.max(a,  b); i++) {
			somma += i;
			System.out.println(somma);
		}

		float media = (float)somma / (float)(Math.abs(a - b) + 1);
		System.out.println("la somma di tutti i numeri compresi tra " + a + " e " + b + " è: " + somma);
		System.out.println("la media dei numeri compresi tra " + a + " e " + b + " è: " + media);
	}

}
