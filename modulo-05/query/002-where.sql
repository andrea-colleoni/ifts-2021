select * from categoria -- estrae tutte le righe e tutte le colonne di categoria

select
	* -- proietto tutti i campi
from
	ricetta
where
	difficolta >= -100	-- predicato di selezione, valutato record per record
						-- i record in cui il predicato è true, saranno nel risultato