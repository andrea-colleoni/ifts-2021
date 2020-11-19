package lezione02;

public class CoseStatiche {

	public static void main(String[] args) {
		pippo = "a";
		// pluto = "b"; // quale??
		CoseStatiche x = new CoseStatiche();
		CoseStatiche y = new CoseStatiche();
		CoseStatiche z = new CoseStatiche();
		
		x.pluto = "b";
		
		mStat();
		x.m();
		y.m();
		
		System.out.println(pippo);
	}
	
	static String pippo; // variabile di classe
	String pluto; // variabili d'istanza
	
	// lavora nello STACK
	// metodo di classe
	static void mStat() {
		// System.out.println(x.pluto);
		System.out.println(pippo);
	}
	
	// lavora nell'HEAP
	// metodo d'istanza
	void m() {
		System.out.println(pluto);
		System.out.println(pippo);
		pippo = "c";
	}

}
