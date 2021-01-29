package it.itsrizzoli.ifts.springboot01.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class, 
		property = "idGenere"
)
public class Genere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idGenere;
	
	@Column(nullable = false, length = 30)
	private String nome;
	
	@OneToMany(
			mappedBy = "genere", 
			cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, 
			orphanRemoval = true
	)
	private List<Libro> libri = new ArrayList<>();

	public void addLibro(Libro l) {
		libri.add(l);
		l.setGenere(this);
	}
	
	public void removeLibro(Libro l) {
		libri.remove(l);
		l.setGenere(null);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idGenere == null) ? 0 : idGenere.hashCode());
		result = prime * result + ((libri == null) ? 0 : libri.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genere other = (Genere) obj;
		if (idGenere == null) {
			if (other.idGenere != null)
				return false;
		} else if (!idGenere.equals(other.idGenere))
			return false;
		if (libri == null) {
			if (other.libri != null)
				return false;
		} else if (!libri.equals(other.libri))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
