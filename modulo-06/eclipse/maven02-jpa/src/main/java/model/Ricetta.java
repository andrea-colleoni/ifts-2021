package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// questa è una entità
@Entity
public class Ricetta {
	
	@Id
	@Column(name = "id_ricetta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRicetta;
	
	@Column(name = "nome_ricetta", nullable = false, length = 100)
	private String nomeRicetta;
	
	// - non sono costretto a fornire una mappatura del nome, se il nome del
	// campo in Java è uguale al nome del campo sul DB
	
	// uso una classe wrapper perché altrimenti non riesco a rappresentare
	// la nullabilità del campo, che sul DB si può fare, ma in Java per un 
	// tipo primitivo non si può fare
	private Integer difficolta;
	
	@Column(name = "id_categoria", nullable = false)
	private Integer idCategoria;
	
	// nullable ha default a true, quindi lo specifico solo se è false
	@Column(name = "id_cuoco")
	private Integer idCuoco;

	public Integer getIdRicetta() {
		return idRicetta;
	}

	public void setIdRicetta(Integer idRicetta) {
		this.idRicetta = idRicetta;
	}

	public String getNomeRicetta() {
		return nomeRicetta;
	}

	public void setNomeRicetta(String nomeRicetta) {
		this.nomeRicetta = nomeRicetta;
	}

	public Integer getDifficolta() {
		return difficolta;
	}

	public void setDifficolta(Integer difficolta) {
		this.difficolta = difficolta;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Integer getIdCuoco() {
		return idCuoco;
	}

	public void setIdCuoco(Integer idCuoco) {
		this.idCuoco = idCuoco;
	}

	@Override
	public String toString() {
		return "Ricetta [idRicetta=" + idRicetta + ", nomeRicetta=" + nomeRicetta + ", difficolta=" + difficolta
				+ ", idCategoria=" + idCategoria + ", idCuoco=" + idCuoco + "]";
	}

}
