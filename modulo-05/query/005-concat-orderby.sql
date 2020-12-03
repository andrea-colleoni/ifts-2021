-- l'elenco deglle istruzioni per fare il tiramisù

select
	concat(r.nome_ricetta, ' passo ', i.numero_passo, ': ', i.istruzione) istruzioni
from
	ricetta r join istruzione i
	on i.id_ricetta = r.id_ricetta
where
	r.nome_ricetta = 'Tiramisù'
order by
	i.numero_passo