package lezione01.esercizi;

public class Esercizio5_03 {

	public static void main(String[] args) {
		int n = 40;
		String scritta = "*"; 
		for(int i = 0; i < n; i++) {
			System.out.println(scritta);
			scritta += "*";
		}
	}
}
