package lezione02;

public class Stringhe {

	public static void main(String[] args) {
		// String non è un tipo primitivo, è un REFERENCE type
		// quindi le stringhe sono in effetti "oggetti"
		String str = "abcDEfghijklmnopqrSTUVwxyz-aBCdefghijklmnopqrstuvWXYz";
		
		// metodi utili in String
		System.out.println(str.toLowerCase()); // tutto minuscole
		System.out.println(str.toUpperCase()); // tutto maiuscole
		System.out.println(str.substring(5, 10)); // estrazione di una sottostringa da una stringa
		System.out.println(str.indexOf('m')); // ricerca di una stringa (o carattere) in una stringa
		System.out.println(str.indexOf('m', 20)); // ricerca a partire dal carattere num. 20
		System.out.println(str.charAt(15)); // carattere all'indice 15
		System.out.println(str.toCharArray()[15]); // altro modo per estarre il carattere in posizione 15
		System.out.println(str.startsWith("abc")); // true, se la string inizia con "abc"
		System.out.println(str.replaceAll("mno", "###"));
		
		// ATTENZIONE: i metodi della string NON ALTERA IL CONTENUTO DELLA STRINGA!!
		//             invece restituiscono una nuova stringa trasformata secondo l'elaborazione
		//             richiesta
		// Le stringhe in Java sono IMMUTABILI
		System.out.println(str);
		
		// se voglio cambiare il contenuto di str devo assegnarle un nuovo valore (sostituire)
		str = str.toLowerCase(); // questo sostituisce in str il valore di str tutto minuscole
		System.out.println(str);
	}

}
