package lezione03;

public class EsempioEquals {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		String testo1 = sb1.append("ciao").toString();
		String testo2 = sb2.append("ciao").toString();
		
		System.out.println(testo1 == testo2);
		System.out.println(testo1.equals(testo2));
		// quando si confrontano tra loro due oggetti
		// bisogna sempre usare equals()
	}

}
