package lezione02;

public class AltriCicli {

	public static void main(String[] args) {
		String str = "ciao mondo!!";
		
		for(int i = 0; i < str.length(); i++) { // attenzione a length(): è un metodo di String
			System.out.println(str.charAt(i));
		}
		
		// altra forma di for per scorrere tutti gli elementi di una collezione
		for(char carattere : str.toCharArray()) { // questa forma del ciclo for, si chiama anche for each
			System.out.println(carattere);
		}
		
		int[] interi = { 1, 5, 19, -2, 6, 8 };
		for(int intero : interi) {
			System.out.print(intero + ", ");
		}

	}

}
