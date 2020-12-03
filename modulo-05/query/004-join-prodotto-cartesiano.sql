select
	nome_ricetta,
	nome_categoria
from
	ricetta, -- rango: 5, cardinalità: 4
	categoria -- rango: 2, cardinalità: 5
	-- prodotto cartesiano: è la combinazione di tutte le righe di ricetta
	--                      con tutte le gighe di categoria
where
	-- impongo come condizione di selezione sul prodotto cartesiano
	-- la condizione di congiunzione
	ricetta.id_categoria = categoria.id_categoria

-- un'altra sintassi SQL per la congiunzione

select
	r.nome_ricetta,
	c.nome_categoria
from
	ricetta as r join categoria as c -- join è l'operatore di congiunzione
	on c.id_categoria = r.id_categoria -- è il predicato che c'era in where
