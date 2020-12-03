-- elencare gli ingredienti del tiramisù

select
	r.nome_ricetta,
	ri.quantita,
	ri.unita_misura,
	i.nome_ingrediente
from
	ricetta r join ricetta_ingrediente ri
	on r.id_ricetta = ri.id_ricetta
	join ingrediente i
	on ri.id_ingrediente = i.id_ingrediente

where
	r.nome_ricetta = 'Tiramisù'