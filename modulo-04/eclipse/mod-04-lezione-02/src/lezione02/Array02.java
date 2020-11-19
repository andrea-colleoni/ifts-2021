package lezione02;

public class Array02 {

	public static void main(String[] args) {
		char[] saluto = {'b', 'u', 'o', 'n', 'g', 'i', 'o', 'r', 'n', 'o'};
		
		for(int i = 0; i < saluto.length; i++) {
			System.out.print(saluto[i]);
		}
		System.out.println("----------------");
		// la rappresentazione interna di una stringa in Java, è un array di char
		String salutoStr = "buonasera";
		for(int i = 0; i < salutoStr.toCharArray().length; i++) {
			System.out.println(salutoStr.toCharArray()[i]);
		}
	}

}
