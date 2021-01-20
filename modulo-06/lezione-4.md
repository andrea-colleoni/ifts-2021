# Modulo 6 - Lezione 4

__Data__: 20/01/2021  
[Torna all'indice](/README.md)
[Lezione 3](/modulo-06/lezione-3.md): Introduzione a JS  

## Argomenti

- Gestione delle dipendenze in un progetto
- Uso di Maven per la gestione delle dipendenze
- Coordinate di un articaft: group id, artifac id, version
- Ricerca di un artifact su MVNRepository
- Aggiunta di una dipendenza al pom.xml del progetto
- Esempio di aggiunta di un driver JDBC al progetto
- Introduzione a JPA
- Definizione di ORM
- Aggiunta di Hibernate JPA ad un progetto usando Maven
- Definizione di un'entità
  - Definizione di una classe come JavaBean (campi privati + getters/setters pubblici)
  - Aggiunta dell'annotazione @Entity
  - Definizione delle caratteristiche aggiuntive dei campi: @Id, @Column, @GeneratedValue
- Utilizzo dell'EntityManagerFactory e dell'EntityManager
- Inserimento di un nuovo record con EntityManager
- Ricerca di un record per chiave con EntityManager
- Utilizzo di EntityManagerFactory da un singleton
- Definizione delle associazioni con JPA
  - @OneToMany - @ManyToOne
  - @ManyToMany
- Interrogazione di un modello JPA con JPQL
- Forward engineering di un modello su un RDBMS

## Esercitazioni

- Definire una o più entity del proprio progetto di gruppo in un progetto Maven/JPA
- Verificare che il progetto sia in grado di connettersi al DB, di recuperare i record e di mapparli con le entità definite

## Riferimenti, bibliografia, sitografia

I libri sono nella cartella "books"

- [JPA Wiki](https://en.wikibooks.org/wiki/Java_Persistence)

