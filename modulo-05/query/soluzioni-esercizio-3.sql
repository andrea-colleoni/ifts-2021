-- Elencare tutti gli articoli venduti nel mese di dicembre 2020

select 
	a.*,
	pf.[nome],
	pf.[congnome],
	pf.[ragione_sociale]
from 
	articoli a
	inner join riga_ordine ro on a.[cod_articolo] = ro.[cod_articolo]
	inner join [dbo].[ordini] o on ro.[cod_ordine] = o.[cod_ordine]
	inner join [dbo].[persone] pf on pf.[codice_fiscale] = o.[codice_fiscale_fornitore]
where
	pf.[soggetto_interno] = 1
	and o.[data_ordine] between '2020-12-01' and '2020-12-31'

-- Elencare tutti gli articoli acquistati nell'anno 2020

select 
	a.*,
	pc.[nome],
	pc.[congnome],
	pc.[ragione_sociale]
from 
	articoli a
	inner join riga_ordine ro on a.[cod_articolo] = ro.[cod_articolo]
	inner join [dbo].[ordini] o on ro.[cod_ordine] = o.[cod_ordine]
	inner join [dbo].[persone] pc on pc.[codice_fiscale] = o.[codice_fiscale_acquirente]
where
	pc.[soggetto_interno] = 1
	and o.[data_ordine] between '2020-01-01' and '2020-12-31'

-- Elencare i fornitori che hanno fatto acquisti nel secondo semestre del 2020

select
	o.[cod_ordine],
	pf.*
from 
	[dbo].[ordini] o
	inner join [dbo].[persone] pf on pf.[codice_fiscale] = o.[codice_fiscale_fornitore]
where
	o.[data_ordine] between '2020-01-06' and '2020-12-31'
	and pf.[soggetto_interno] = 0

-- Con un prodotto cartesiano, confrontare tutti gli articoli comprati e venduti 
-- (ogni riga di vendita con ogni riga d'acquisto per lo stesso articolo), determinando 
-- il margine di vendita e quindi ordinare il risultato ottenuto in ordine crescente di 
-- margine di vendita

select
	av.*,
	rov.prezzo - roa.prezzo margine
from
	-- venduti
	articoli av
	inner join [dbo].[riga_ordine] rov
	on av.[cod_articolo] = rov.[cod_articolo]
	inner join [dbo].[ordini] ov
	on rov.[cod_ordine] = ov.[cod_ordine]
	inner join [dbo].[persone] pf
	on pf.[codice_fiscale] = ov.[codice_fiscale_fornitore] and pf.[soggetto_interno] = 1
	, -- prodotto cartesiano
	-- acquistati
	articoli aa
	inner join [dbo].[riga_ordine] roa
	on aa.[cod_articolo] = roa.[cod_articolo]
	inner join [dbo].[ordini] oa
	on roa.[cod_ordine] = oa.[cod_ordine]
	inner join [dbo].[persone] pc
	on pc.[codice_fiscale] = oa.[codice_fiscale_acquirente] and pc.[soggetto_interno] = 1
where
	av.[cod_articolo] = aa.[cod_articolo]
order by
	margine
