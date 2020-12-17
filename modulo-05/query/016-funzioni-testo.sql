-- funzioni per i (var)char

declare @testo varchar(100)

set @testo = '   aBcdefGhijkl   MnopQrsTuvWxyZ   '

print left(@testo, 5)
print right(@testo, 5)
print UPPER(@testo)
print LOWER(@testo)
print TRIM(@testo)
print LEFT(TRIM(UPPER(@testo)), 5) -- funzioni nelle funzioni
print LEN(@testo)
print REPLICATE('ciao', 10)

select 
	LEFT(UPPER(r.nome_ricetta), 10),
	REPLACE(UPPER(r.nome_ricetta), 'O', '*********')
from ricetta r