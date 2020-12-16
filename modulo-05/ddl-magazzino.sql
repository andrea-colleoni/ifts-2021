
CREATE TABLE persone (
                codice_fiscale VARCHAR(20) NOT NULL,
                p_iva VARCHAR(15),
                ragione_sociale VARCHAR(100),
                nome VARCHAR(50),
                congnome VARCHAR(50),
                indirizzo VARCHAR(100) NOT NULL,
                email VARCHAR(100),
                CONSTRAINT persone_pk PRIMARY KEY (codice_fiscale)
)

CREATE TABLE ordini (
                cod_ordine INT IDENTITY NOT NULL,
                data_ordine DATETIME NOT NULL,
                codice_fiscale_fornitore VARCHAR(20) NOT NULL,
                codice_fiscale_acquirente VARCHAR(20) NOT NULL,
                note VARCHAR(100) NOT NULL,
                CONSTRAINT ordini_pk PRIMARY KEY (cod_ordine)
)

CREATE TABLE articoli (
                cod_articolo VARCHAR(20) NOT NULL,
                descrizione VARCHAR(200) NOT NULL,
                CONSTRAINT articoli_pk PRIMARY KEY (cod_articolo)
)

CREATE TABLE riga_ordine (
                cod_riga_ordine INT IDENTITY NOT NULL,
                quantita FLOAT NOT NULL,
                prezzo DECIMAL(15,3) NOT NULL,
                cod_ordine INT NOT NULL,
                cod_articolo VARCHAR(20) NOT NULL,
                sconto_pct FLOAT DEFAULT 0,
                CONSTRAINT riga_ordine_pk PRIMARY KEY (cod_riga_ordine)
)

ALTER TABLE ordini ADD CONSTRAINT persone_ordini_fk
FOREIGN KEY (codice_fiscale_fornitore)
REFERENCES persone (codice_fiscale)
ON DELETE NO ACTION
ON UPDATE NO ACTION

ALTER TABLE ordini ADD CONSTRAINT persone_ordini_fk1
FOREIGN KEY (codice_fiscale_acquirente)
REFERENCES persone (codice_fiscale)
ON DELETE NO ACTION
ON UPDATE NO ACTION

ALTER TABLE riga_ordine ADD CONSTRAINT ordini_riga_ordine_fk
FOREIGN KEY (cod_ordine)
REFERENCES ordini (cod_ordine)
ON DELETE NO ACTION
ON UPDATE NO ACTION

ALTER TABLE riga_ordine ADD CONSTRAINT articoli_riga_ordine_fk
FOREIGN KEY (cod_articolo)
REFERENCES articoli (cod_articolo)
ON DELETE NO ACTION
ON UPDATE NO ACTION