package lezione01;

public class VariabiliEOperatori {

	public static void main(String[] args) {
		// tipi di dati PRIMITIVI (rappresentano singoli valori)
		// numerici, testo
		
		// numerici:
		// interi
		byte a = 10; // (1 byte) -128 a 127
		short b = 20; // (2 byte) -3200 a 32000
		int c = 30; // (4 byte) -2 mld a 2 mld
		long d = 40; // (8 byte) -9 mld di mld a 9 mld di mld
		
		// a virgola mobile
		float e; // dichiarazione - (4 byte) 3 10-38 a 3 10+38
		e = 50; // assegnazione (operatore =)
		double f = 10.5; // (8 byte) 1.7 10-308 a 1.7 10+308
		
		// boolean (vero/falso)
		boolean g = true; // (1 bit) accetta: true oppure false
		
		// testo: rappresentazione del testo secondo una codifica (UTF-8)
		char h = 'x'; // (2 byte)
		
		// operatori: servono per eseguire operazioni con le variabili o tra variabili e valori
		// artitmetici: operazioni matematiche
		// +, -, *, /, %, ++, --
		// tra valori letterali
		System.out.println(10 + 20);
		// tra variabili (che devo avere obbligatoriamente già dichiarato e alle quali devo avere già
		// assegnato un valore)
		System.out.println(b - a);
		// misti e utilizzando espressioni (un'espressione è una operazione complessa che opera con
		// vari operatori tra variabili, valori, ecc.
		// valgono le regole di precedenza della matematica
		System.out.println(c + 10 - 4.5 * (40 / f));
		
		// modulo (remainder): è il resto della divisione intera tra due numeri
		System.out.println(10 % 3); // 1 è il resto della divisione
		
		// valore assoluto
		int w = Math.abs(-1); // restituisce 1
		
		long x = 10;
		System.out.println(x);
		x++; // incremento x, che diventa quindi 11
		System.out.println(x);
		x--; // decremento x, che ritorna quindi 10
		System.out.println(x);
	}

}
