package lezione02;

public class Array {

	public static void main(String[] args) {
//		int a = 2;
//		int b = 7;
//		int c = -1;
//		int d = 18;
//		int e = 4;
//		int f = 12;
//		int g = 8;
		// è scomodo => uso un array
		// int[] interi = new int[9];
		// interi[0] => nella collezione interi all'indice 0
//		interi[0] = 2; // il primo indice è sempre 0
//		interi[1] = 7;
//		interi[2] = -1;
//		interi[3] = 18;
//		interi[4] = 4;
//		interi[5] = 12;
//		interi[6] = 8;
//		interi[7] = 0;
//		interi[8] = -4;
		int a = 2000000;
		int[] interi = { a, 7, -1, 18, 4, 12, 8, 0, -4, 11, -2, 38 }; 
		
//		int somma = a + b + c + d + e + f + g;
//		float media = (float)somma / (float)7;
		int somma = 0;
		for(int i = 0; i < interi.length; i++) {
			somma += interi[i];
		}
		float media = (float)somma / (float)interi.length;
	}

}
