# Esercizio 4

[Torna alla lezione](/modulo-05/lezione-4.md)

# Operazioni preliminari

- Assicurarsi che la FK_ricetta_cuoco, abbia "Enforce Foreign Key Constraint" a False
- Assicurarsi che il campo id_cuoco nella tabella ricetta sia NULLABLE

# Scrivere le seuenti query in SQL sullo schema "ricette"

## Inserimenti e modifiche usando SQL (non vale usare editor grafico!!)

- Inserire due nuovi cuochi
- Inserire sei ricette 2 senza cuoco (id_cuoco = NULL), 2 con un cuoco inesistente e 2 con un cuoco tra quelli disponibili
- Inserire una nuova categoria: 7, Impossibile :-)
- Modificare la difficolta delle ricette senza cuoco impostandola a 1
- Modificare la categoria delle ricette con difficolta 4 con il nuovo valore 6 (categoria impossibile)

## Interrogazioni con outer join

- Elencare i cuochi che non hanno ricette
- Elencare le ricette che non hanno cuochi
- Elencare le ricette che hanno cuochi che non esistono nella tabella cuoco
- Elencare gli ingeienti che non sono mai stati utilizzati
- Elencare le categorie che non hanno ricette

## Interrogazioni con funzioni di aggregazione e raggruppamenti

- Contare i cuochi
- Visualizzare il numero totale di ingredienti per ogni ricetta
- Per ogni ingrediente di ogni ricetta visualizzare la quantità tiotale utilizzata
- Contare i passi (istruzioni) di ogni ricetta
- Visualizzare ogni ricetta con il tempo totale di completamento
- Visualizzare l'elenco dei cuochi con il tempo totale di realizzazione delle relative ricette
- Visualizzare un elenco delle categorie di ricette con il tempo medio di realizzazione


