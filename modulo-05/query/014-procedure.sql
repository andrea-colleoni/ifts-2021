-- esempio procedurale (T-SQL)
declare @idCuoco int

select @idCuoco = id_cuoco
from ricetta
where id_ricetta = 1

select *
from cuoco
where id_cuoco = @idCuoco

-- equivalente relazionale (SQL)

select 
	c.*
from
	ricetta r inner join cuoco c
	on r.id_cuoco = c.id_cuoco
where 
	r.id_ricetta  = 1
