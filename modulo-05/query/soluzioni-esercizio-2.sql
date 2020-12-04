-- Elencare tutti i record della tabella ricette
select
	r.*
from
	ricetta r

-- Elencare le ricette fornendone solo il nome e la difficoltà
-- Estensione: decodificare la difficoltà (fornire una descrizione testuale)
select
	r.nome_ricetta,
	r.difficolta,
	CASE
		-- WHEN condizione THEN valore
		WHEN r.difficolta = 1 THEN 'Facile'
		WHEN r.difficolta > 1 AND LEFT(r.nome_ricetta, 1) = 'T' THEN 'Non facile'
		ELSE 'Non facile'
	END descrizione_difficolta
from
	ricetta r
 -- NOTA: la funzione LEFT estrae N caratteri da un varchar partendo da sinistra

-- Elencare tutti i passi di ricette che durano più di 10 minuti
select
	i.*
from
	istruzione i -- la tabella istruzione che da qui in poi chiameremo i
where
	i.tempo > 10
	AND i.unita_misura_tempo = 'min'

-- Elencare tutti gli ingredienti con l'unità di misura espressa in grammi
select
	i.id_ingrediente,
	i.nome_ingrediente
from
	ricetta_ingrediente ri JOIN ingrediente i
	on i.id_ingrediente = ri.id_ingrediente
where
	ri.unita_misura = 'gr'

-- Elencare tutte le ricette con relativa categoria
select
	r.*,
	c.*
from
	ricetta r JOIN categoria c
	on c.id_categoria = r.id_categoria

-- Elencare tutte le ricette con le informazioni sul cuoco
select 
	r.*,
	c.*
from
	ricetta r JOIN cuoco c
	on r.id_cuoco = c.id_cuoco

-- Elencare le ricette del primo cuoco (id_cuoco = 1) di categoria "primi"
select
	r.*
from 
	ricetta r JOIN categoria c
	on r.id_categoria = c.id_categoria
where
	r.id_cuoco = 1
	AND c.nome_categoria = 'Primi'

-- Elencare le istruzioni operative per realizzare la la ricetta con id_ricetta = 1
select
	i.*
from
	istruzione i
where
	i.id_ricetta = 1

-- Elencare gli ingredienti presenti nelle ricette usando questo modello di testo:
/*
  - "La ricetta xxx contiene yyy zzz di iii", dove
    - xxx: è il nome della ricetta
    - yyy: è l'unità di misura dell'ingrediente
    - zzz: è la quantità di ingrediente
    - iii: è il nome dell'ingrediente
*/
select
	concat('La ricetta ', r.nome_ricetta, ' contiene ', 
			ri.unita_misura, ' ', ri.quantita, ' di ', i.nome_ingrediente)
from
	ingrediente i JOIN ricetta_ingrediente ri
	on i.id_ingrediente = ri.id_ingrediente
	JOIN ricetta r
	on ri.id_ricetta = r.id_ricetta

-- Elencare le quantità effettive di ingredienti utilizzate durante i passi operativi eseguiti per realizzare un Tiramisù
select
	i.istruzione,
	rii.unita_misura,
	rii.quantita,
	rii.parte_ingrediente,
	ing.nome_ingrediente
from
	ricetta_ingrediente_istruzione rii JOIN istruzione i
	on rii.id_istruzione = i.id_istruzione
	JOIN ricetta r
	on rii.id_ricetta = r.id_ricetta
	JOIN ingrediente ing
	on rii.id_ingrediente = ing.id_ingrediente
where
	r.nome_ricetta = 'Tiramisù'

-- Elencare i passi operativi per produrre il Tiramisù in ordine di esecuzione
select
	*
from
	istruzione i join ricetta r
	on i.id_ricetta = r.id_ricetta
where
	r.nome_ricetta = 'Tiramisù'
order by
	i.numero_passo

-- Elencare gli ingredienti usati nelle ricette di Andrea
select
	i.*
from
	ingrediente i join ricetta_ingrediente ri
	on i.id_ingrediente = ri.id_ingrediente
	JOIN ricetta r
	on ri.id_ricetta = r.id_ricetta
	JOIN cuoco c
	on r.id_cuoco = c.id_cuoco
where
	c.nome_cuoco = 'Andrea C.'

-- Elencare le ricette che contengono caffè
select
	r.*
from
	ricetta r JOIN ricetta_ingrediente ri
	on ri.id_ricetta = r.id_ricetta
	JOIN ingrediente i
	on ri.id_ingrediente = i.id_ingrediente
where
	i.nome_ingrediente = 'Caffè'

-- Elencare i primi di Andrea che contengono basilico
select
	r.*
from
	ricetta r JOIN cuoco c
	on r.id_cuoco = c.id_cuoco
	JOIN categoria cat
	on r.id_categoria = cat.id_categoria
	JOIN ricetta_ingrediente ri
	on ri.id_ricetta = r.id_ricetta
	JOIN ingrediente i
	on ri.id_ingrediente = i.id_ingrediente
where
	c.nome_cuoco = 'Andrea C.'
	AND cat.nome_categoria = 'Primi'
	AND i.nome_ingrediente = 'Basilico'