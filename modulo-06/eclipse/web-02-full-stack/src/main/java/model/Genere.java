package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Genere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idGenere;
	
	@Column(nullable = false, length = 30)
	private String nome;
	
	@JsonIgnore
	@OneToMany(mappedBy = "genere", cascade = CascadeType.ALL)
	private List<Libro> libri;
	
	public void addLibro(Libro l) {
		if (libri == null ) {
			libri = new ArrayList<>();
		}
		libri.add(l);
		l.setGenere(this);
	}	

	public Integer getIdGenere() {
		return idGenere;
	}

	public void setIdGenere(Integer idGenere) {
		this.idGenere = idGenere;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}

	@Override
	public String toString() {
		return "Genere [idGenere=" + idGenere + ", nome=" + nome + ", libri=" + libri + "]";
	}
	
	
}
