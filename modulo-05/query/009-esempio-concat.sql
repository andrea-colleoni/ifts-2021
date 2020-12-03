-- funzione concat()

select concat('a', 'b', 'c', 'd')
select concat('ciao', ' ', 'io', ' ', 'sono', ' ', 'Andrea')

select
	concat('parole qualunque', r.nome_ricetta, r.nome_ricetta, 100, (r.id_ricetta / 2))
from 
	ricetta r