-- elencare le ricette indicando nome della ricetta, nome della categoria, 
-- nome del cuoco, e una classificazione dove, se difficoltà = 1 => facile,
-- se difficoltà = 2 => media, se difficioltà = 3 => difficile, 4 = impossibile
-- ordinate per difficoltà crescente

select
	r.nome_ricetta,
	c.nome_categoria,
	cu.nome_cuoco,
	case
		when r.difficolta = 1 then 'facile'
		when r.difficolta = 2 then 'media'
		when r.difficolta = 3 then 'difficile'
		when r.difficolta = 4 then 'impossibile'
	end difficolta
from
	(ricetta r join categoria c
	on r.id_categoria = c.id_categoria)
	join cuoco cu
	on cu.id_cuoco = r.id_cuoco
order by
	r.difficolta