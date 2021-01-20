package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Ingrediente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ingrediente")
	private Integer idIngrediente;
	
	@Column(name = "nome_ingrediente", length = 100, nullable = false)
	private String nomeIngrediente;
	
	@ManyToMany
	@JoinTable(
		name = "ricetta_ingrediente",
		joinColumns = @JoinColumn(name = "id_ingrediente"),
		inverseJoinColumns = @JoinColumn(name = "id_ricetta")
	)
	private List<Ricetta> ricette;

	public Integer getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(Integer idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public List<Ricetta> getRicette() {
		return ricette;
	}

	public void setRicette(List<Ricetta> ricette) {
		this.ricette = ricette;
	}

	@Override
	public String toString() {
		return "Ingrediente [idIngrediente=" + idIngrediente + ", nomeIngrediente=" + nomeIngrediente + ", ricette="
				+ ricette + "]";
	}
	
	
}
