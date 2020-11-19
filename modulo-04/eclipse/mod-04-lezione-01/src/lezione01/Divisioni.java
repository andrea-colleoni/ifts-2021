package lezione01;

public class Divisioni {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 3;
		float a = 10;
		float b = 3;
		
		System.out.println(a / b);
		
		// overload degli operatori matematici:
		// gli operatori si comportano in modo diverso, a seconda degli operandi
		// es: se io eseguo la divisione tra due interi => int / int => l'operatore diviso
		//     assumerà il comportamento "divisione tra interi" che da un risultato intero
		// quindi:
		// se cambio il tipo di operandi, cambia il comportamento dell'operatore
		
		// per trattare una variabile come se fosse di un altro tipo e quindi "forzare" l'operatore
		// a comportarsi secondo le nostre necessità, possiamo usare il cast
		// es: 1 è un intero, ma è anche vero che può essere un float
		int x = 1;
		float y = 1;
		// (float)x => tratta l'int x come se fosse un float e si dice "cast a float di x"
		// cast non trasforma la variabile, non ne cambia il tipo, la "interpreta" secondo un tipo, solo
		// ai fini dell'operazione che sto eseguendo nel momento in cui faccio il cast
		
	}

}
