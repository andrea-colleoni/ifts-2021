select 
	-- row_number() over (order by id_ricetta) as numero, -- numero di riga
	1 as uno, -- un valore letterale
	100 * 1.5, -- un'espressione 
	'ciao', -- un valore letterale varchar
	difficolta, -- un campo della tabella
	nome_ricetta, -- un altro campo
	difficolta * 2 as [doppia difficolta], -- un'espressione con un termine preso da un campo
	'Nome ricetta: ' + nome_ricetta as descrizione_ricetta, -- un'altra espressione
	difficolta as pippo, -- as server a dare un nome alla colonna proiettata
	'.....'
from 
	ricetta -- rango: 5, cardinalità: 3

select
	* -- l'operatore * indica sinteticamente TUTTI I CAMPI
from
	ricetta