-- elenco delle ricette di Andrea

select 
	r.nome_ricetta,
	c.nome_cuoco
from
	ricetta r join cuoco c     -- r e c sono detti nomi di correlazione
	on r.id_cuoco = c.id_cuoco -- e possono essere usati ovunque nella query
where                          -- devono essere usati obbligatoriamente solo in caso di 
	c.nome_cuoco = 'Andrea C.' -- omonimia tra nomi di campi di tabelle diverse