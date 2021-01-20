package programma;

import model.Ricetta;

public class UsoDiUnJavaBean {

	public static void main(String[] args) {
		Ricetta r = new Ricetta();

		// imposto il/i campi
		r.setNomeRicetta("Maccheroni ai formaggi dfsd fds fsd fsd fds sd fsd sd dfs  sd fds fsd f sdf sdf sdf ds fds fsd f sf sdf sd fsd sdf sdf sdf sdf sd f sdf s fs df sdf sd fsd fsd f sdf ds fsd f sd f sdf sd fsd f sd f sdf sd fs  sf sd f sf sd f sdf  sd fsd fsd f sdf sdf");
		r.setDifficolta(3);

		// leggo il/i campo
		System.out.println(r.getNomeRicetta().length());
		System.out.println(r.getNomeRicetta());
	}

}
