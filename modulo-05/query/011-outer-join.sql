select
	r.*,
	c.*
from
	cuoco c full outer join ricetta r
	on r.id_cuoco = c.id_cuoco

-- outer join, oltre alle righe che matchanop l'uguaglianza del
-- predicato di join, elenca anche le righe che non matchano
-- di una delle due tabelle coivolte nel join (la tabella
-- di sinistra o quella di destra)

-- quali cuochi non hanno ancora fatto ricette?

select
	c.*,
	r.id_ricetta
from 
	cuoco c left outer join ricetta r
	on c.id_cuoco = r.id_cuoco
where 
	r.id_ricetta IS NULL

-- quali ricette sono di cuochi ignoti o sbagliati?
select
	c.*,
	r.*
from 
	cuoco c full outer join ricetta r
	on c.id_cuoco = r.id_cuoco
where 
	c.id_cuoco IS NULL
