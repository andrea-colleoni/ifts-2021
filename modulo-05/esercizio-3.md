# Esercizio 3

[Torna alla lezione](/modulo-05/lezione-3.md)

# Creare il database del problema descritto

- Dobbiamo creare un applicazione per gestire un magazzino automatizzato. Per mettere degli articoli nel magazzino, è necessario inserire nel DB un ordine a fornitore. L'ordine a fornitore, riporta: i dati identificativi del fornitore, la data, un numero univoco e contiene un elenco di articoli (righe d'ordine). Ogni riga d'ordine riporta il codice e la descrizione dell'articolo, la quantità, il prezzo unitario di acquisto.
Per prelevare gli articoli dal magazzino è necessario inserire nel DB un ordine cliente; molto simile all'ordine fornitore, l'ordine cliente riporta i dati identitifativi del cliente, la data, un numero univoco e un elenco di articoli (righe d'ordine). Ogni riga d'ordine a cliente riporta il codice e la descrizione dell'articolo prelevato dal magazzino, la quantità e il prezzo unitario di vendita.
- Rappresentare un diagramma ER del problema
- Produrre lo schema logico (regole di derivazione) e implementarlo in un nuovo DB SQL Server
- Inserire un po' di dati

# Scrivere le seuenti query in SQL sullo schema ricavato dal problema

- Elencare tutti gli articoli vednuti nel mese di dicembre 2020
- Elencare tutti gli articoli acquistati nell'anno 2020
- Elencare i fornitori che hanno fatto acquisti nel secondo semetre del 2020
- Elencare i clienti che sono anche fornitori
- Elencare gli atricoli in magazzino che hanno una descrizione che inizia con 'A' e termina con 'A'
- Elencare gli atricoli in magazzino che hanno una descrizione che inizia e termina con la setssa lettera
- Elencare le righe d'ordine a cliente che hanno quantità di articoli comprese tra 10 e 50
- Elencare le righe d'ordine a fornitore che hanno un prezzo di vendita pari 10, 20, 30 o 40
- Elencare le righe d'ordine a fornitore che hanno un prezzo di vendita pari a un multiplo di 10
- Elencare i clienti per cui non è stato specificato un numero di telefono
- Fornire un elenco di tutte le righe d'ordine con le seguenti informazioni: descrizione articolo, quantità, prezzo unitario, prezzo totale, prezzo comprensivo di IVA al 22%
- Con un prodotto cartesiano, confrontare tutti gli articoli comprati e venduti (ogni riga di vendita con ogni riga d'acquisto per lo stesso articolo), determinando il margine di vendita e quindi ordinare il risultato ottenuto in ordine crescente di margine di vendita
- Individuare tutte le righe d'ordine di acquisto di clienti di Milano, Bergamo, Brescia Lecco, Monza Brianza e Lodi
- Per trovare i clienti e i fornitori che risiedono allo stesso indirizzo, usare un prodotto cartesiano che confronti tra loro gli indirizzi dei clienti e dei fornitori

# Se volete scoprire qualcosa di più, usando cose a cui potete arrivare ma che ancora non ho spiegato...

- Elencare gli ordini a fornitore, indicando per ciascun ordine, il numero di righe d'ordine
- Individuare la data del primo ordine a cliente del 2020
- Elencare gli ordini a fornitore, indicando per ciascun ordine, il totale dell'ordine (la somma di tutti gli importi delle righe d'ordine, quindi quantità per prezzo unitario)
- Individuare il prezzo medio di vendita di tutti gli articoli
- Elencare per ogni articolo, il prezzo medio di acquisto, il prezzo medio di vendita e il margine medio
- Elencare gli articoli non venduti
- Elencare gli articoli indicando la giacenza di magazzino
- Trovare il valore del magazzino al prezzo medio d'acquisto, al prezzo medio di vendita e determinarne il margine 