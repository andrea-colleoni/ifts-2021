package it.itsrizzoli.ifts.springboot01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.itsrizzoli.ifts.springboot01.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, String> {

}
