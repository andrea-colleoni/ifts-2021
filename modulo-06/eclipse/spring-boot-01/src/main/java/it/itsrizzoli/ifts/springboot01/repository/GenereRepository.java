package it.itsrizzoli.ifts.springboot01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.itsrizzoli.ifts.springboot01.model.Genere;

public interface GenereRepository extends JpaRepository<Genere, Integer> {

}
