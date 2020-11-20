package lezione03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdinamentoArrayList {

	public static void main(String[] args) {
		// inizializzo l'arraylist
		ArrayList<Integer> numeri = 
				new ArrayList<>(List.of(10, 30, 1, 5, 18, -4, 20, 3, 32, 18, 6));
		
		// sort in Collections applica l'algoritmo più efficiente per ordinare
		// la collezione
		Collections.sort(numeri);
		
		for(int i : numeri) {
			System.out.println(i);
		}
		
		ArrayList<String> stringhe = 
				new ArrayList<>(List.of("abc", "xyz", "def", "mno", "bcd", "tuv"));
		
		// sort in Collections applica l'algoritmo più efficiente per ordinare
		// la collezione
		Collections.sort(stringhe, Collections.reverseOrder());
		for(String s : stringhe) {
			System.out.println(s);
		}
		
		Integer[] interi = { 10, 30, 1, 5, 18, -4, 20, 3, 32, 18, 6 };
		Arrays.sort(interi, Collections.reverseOrder());
		for(int n : interi) {
			System.out.println(n);
		}
	}

}
