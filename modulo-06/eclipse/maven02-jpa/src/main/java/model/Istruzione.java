package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Istruzione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_istruzione")
	private Integer idIstruzione;
	
	@Column(length = 1000, nullable = false)
	private String istruzione;
	
	@Column(name=" numero_passo", nullable = false)
	private Integer numeroPasso;
	
	private Float tempo;
	
	@Column(name = "unita_misura_tempo", length = 5)
	private String unitaMisura;
	
	@ManyToOne
	@JoinColumn(name = "id_ricetta")
	private Ricetta ricetta;

	public Integer getIdIstruzione() {
		return idIstruzione;
	}

	public void setIdIstruzione(Integer idIstruzione) {
		this.idIstruzione = idIstruzione;
	}

	public String getIstruzione() {
		return istruzione;
	}

	public void setIstruzione(String istruzione) {
		this.istruzione = istruzione;
	}

	public Integer getNumeroPasso() {
		return numeroPasso;
	}

	public void setNumeroPasso(Integer numeroPasso) {
		this.numeroPasso = numeroPasso;
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public String getUnitaMisura() {
		return unitaMisura;
	}

	public void setUnitaMisura(String unitaMisura) {
		this.unitaMisura = unitaMisura;
	}

	public Ricetta getRicetta() {
		return ricetta;
	}

	public void setRicetta(Ricetta ricetta) {
		this.ricetta = ricetta;
	}

	@Override
	public String toString() {
		return "Istruzione [idIstruzione=" + idIstruzione + ", istruzione=" + istruzione + ", numeroPasso="
				+ numeroPasso + ", tempo=" + tempo + ", unitaMisura=" + unitaMisura + ", ricetta=" + ricetta + "]";
	}

}
