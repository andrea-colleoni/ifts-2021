# Esercizio 4

# Operazioni preliminari

- Assicurarsi che la FK_ricetta_cuoco, abbia "Enforce Foreign Key Constraint" a False
- Assicurarsi che il campo id_cuoco nella tabella ricetta sia NULLABLE

# Scrivere le seuenti query in SQL sullo schema "ricette"

## Con delle query di INSERT

### Inserimenti e modifiche usando SQL (non vale usare editor grafico!!)

- Inserire due nuovi cuochi
- Inserire sei ricette 2 senza cuoco (id_cuoco = NULL), 2 con un cuoco inesistente e 2 con un cuoco tra quelli disponibili
- Inserire una nuova categoria: 6, Impossibile!
- Modificare la difficolta delle ricette senza cuoco impostandola a 1

### Interrogazioni con outer join

- Elencare i cuochi che non hanno ricette
- Elencare le ricette che non hanno cuochi
- Elencare le ricette che hanno cuochi che non esistono nella tabella cuoco
- Elencare gli ingeienti che non sono mai stati utilizzati
- Elencare le categorie che non hanno ricette

### Interrogazioni con funzioni di aggregazione e raggruppamenti

- Contare i cuochi
- Visualizzare il numero totale di ingredienti per ogni ricetta
- 

