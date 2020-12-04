-- elenco delle ricette di diffioltà 2 oppure 4

select
	r.*
from
	ricetta r
where
	--r.difficolta = 2 OR r.difficolta = 4 (senza IN)
	r.difficolta IN (2, 4) -- i valori di difficoltà appartengono all'insieme di valori {2, 4}

-- elenco degli ingredienti nelle ricette con qtà compresa tra 50 e 150 gr
select
	ri.*
from
	ricetta_ingrediente ri
where
	ri.unita_misura = 'gr'
	-- AND ri.quantita >= 50
	-- AND ri.quantita <= 150
	and ri.quantita between 50 and 150
	-- AND ri.quantita between ri.id_ingrediente AND (ri.id_ricetta / 7) 
	-- AND 10 between 0 and 2
	-- and id_ingrediente > 3

-- elenco delle ricette il cui nome inizia con la lettera T
select
	r.*
from
	ricetta r
where
	r.nome_ricetta LIKE 'T%'

-- elenco delle ricette il cui nome finisce con 'o'
select
	r.*
from
	ricetta r
where
	r.nome_ricetta LIKE '%e'

-- elenco di tutte le ricette che contengono una 'o' nel nome
select
	r.*
from
	ricetta r
where
	r.nome_ricetta LIKE '%o%' -- LIKE e uguale rispettano le regole di confronot del DB (collation)
	-- r.nome_ricetta = 'ostriche' collate Latin1_General_CI_AS
	-- r.nome_ricetta = 'tiramisu' -- collate Latin1_General_CI_AI

-- elenco delle ricette in cui il nome ha alla 2 lettera una i
select
	r.*
from
	ricetta r
where
	r.nome_ricetta LIKE '_i%'

-- elenco delle ricette in cui il nome di 5 lettere
select
	r.*
from
	ricetta r
where
	r.nome_ricetta LIKE '_____' -- <= 5 volte _


-- pattern senza "wildcard"
select
	r.*
from
	ricetta r
where
	r.nome_ricetta LIKE 'Tiramisù' -- si comporta come un =

-- trovare una riga degli ingredienti usati dove non è stata specificata la parte
select
	rii.*
from
	ricetta_ingrediente_istruzione rii
where
	rii.parte_ingrediente is null -- dove è nullo
	-- rii.parte_ingrediente is not null -- dove non è nullo
	
-- 1 = 1 => true
-- 1 = 2 => false
-- 1 <> 2 => true
-- NULL = NULL => false
-- NULL <> NULL => false

select 1 + 2 + 4 + NULL -- <= NULL perché uno degli operandi è ignoto (NULL), quindi
				        --    il risultato è parimenti ignoto

-- per inserire un NULL in una cella con SSMS si usa la combinazione CTRL + 0