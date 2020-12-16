-- inserimento di un nuovo record nella tabella ricetta

INSERT INTO [dbo].[ricetta]
           ([nome_ricetta]
           ,[difficolta]
           ,[id_categoria]
           ,[id_cuoco])
     VALUES
           ('Gateaux di carciofi'
           ,1
           ,4
           ,NULL)

-- aggiornamento di una "o più" righe nella tabella ricetta
UPDATE [dbo].[ricetta]
   SET 
       [difficolta] = 3
      ,[id_cuoco] = 1
 WHERE id_ricetta = 1010 -- modifico una sola riga perché ho una condizione sulla PK

-- modifica massiva

UPDATE [dbo].[ricetta]
   SET 
       id_categoria = 5
 WHERE nome_ricetta LIKE 'Gateaux%'

-- cancellazione di una "o più" righe (record, non campi!!) dalla tabella ricetta

DELETE FROM [dbo].[ricetta]
      WHERE id_ricetta between 1011 and 1014

-- Esempi DDL

-- aggiunta di una colonna alla tabella ricetta
alter table ricetta add
	nuova_colonna varchar(20) null,
	altra_colonna int

-- creazione di una tabella
create table pippo (
	pluto int,
	topolino bit
)

-- eliminazione di una tabella
drop table pippo