package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cuoco {
	
	@Id
	@Column(name = "id_cuoco")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCuoco;
	
	@Column(name = "nome_cuoco", nullable = false, length = 50)
	private String nomeCuoco;
	
	@OneToMany(mappedBy = "cuoco")
	private List<Ricetta> ricette;

	public Integer getIdCuoco() {
		return idCuoco;
	}

	public void setIdCuoco(Integer idCuoco) {
		this.idCuoco = idCuoco;
	}

	public String getNomeCuoco() {
		return nomeCuoco;
	}

	public void setNomeCuoco(String nomeCuoco) {
		this.nomeCuoco = nomeCuoco;
	}

	@Override
	public String toString() {
		return "Cuoco [idCuoco=" + idCuoco + ", nomeCuoco=" + nomeCuoco + "]";
	}

	public List<Ricetta> getRicette() {
		return ricette;
	}

	public void setRicette(List<Ricetta> ricette) {
		this.ricette = ricette;
	}

}
