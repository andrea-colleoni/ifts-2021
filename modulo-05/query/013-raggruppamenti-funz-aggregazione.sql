-- contare quante ricette ho nel db?

-- tabella completa
select
	r.*
from
	ricetta r

-- riduco il numero di righe usando la selezione
select
	*
from
	ricetta r
where
	r.id_categoria = 2

-- riduco il numero di righe applicando AGGREGAZIONE
select
	COUNT(*) conteggio
from
	ricetta r

-- funzioni di aggregazione
select
	MIN(r.[difficolta]) min_diff,
	MAX(r.[difficolta]) max_diff,
	COUNT(*) conteggio,
	AVG(r.difficolta) diff_media,
	SUM(r.difficolta) somm_diff
from
	ricetta r

-- problema dettaglio/aggregato
-- non si può mostrare nella stessa query sia dettaglio che aggregato
select
	MIN(r.[difficolta]) min_diff,
	r.[id_ricetta]
from
	ricetta r

-- sol 1: usare in select solo funz. di aggregazione
select
	MIN(r.[difficolta]) min_diff,
	MAX(r.[id_ricetta]) -- ho cambiato la query mettendo una funz. di aggregazione 
					    -- su tutte le colonne proiettate
from
	ricetta r

-- sol 2: usare query di raggruppamento
select
	r.id_cuoco,
	MIN(r.difficolta) min_diff,
	MAX(r.difficolta) max_diff
from
	ricetta r
group by
	r.id_cuoco

-- qual è la difficoltà media delle ricette "per" cuoco
select
	r.id_cuoco,
	c.nome_cuoco,
	AVG(r.difficolta) diff_media
from
	ricetta r full outer join cuoco c
	on r.id_cuoco = c.id_cuoco
group by
	r.id_cuoco, c.nome_cuoco

-- contare quante ricette ha fatto "ogni" cuoco
select
	r.id_cuoco,
	COUNT(*)
from
	ricetta r
group by
	r.id_cuoco

-- contare quante ricette ci sono "per" ciascun grado di difficoltà
select
	r.difficolta,
	COUNT(*)
from
	ricetta r
group by
	r.difficolta

-- quante ricette per cuoco divise per difficoltà ci sono?
select
	r.id_cuoco,
	r.difficolta,
	COUNT(*) num_ricette
from
	ricetta r
group by
	r.id_cuoco, r.difficolta
