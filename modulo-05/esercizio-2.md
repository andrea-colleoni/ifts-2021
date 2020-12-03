# Esercizio 2

# Creare il database ricette

- Eseguire in SQL Server Management Studio lo script presente nella cartella query/db-ricette.sql
  - Scarucare lo script sul proprio PC
  - File > Apri > File
  - Esplora fino allo script 
  - Una volta aperto lo script in SSMS premere "Esegui"
- __OPPURE__: copiare e incollare lo script in una nuova finestra query

# Scrivere le seuenti query in SQL sullo schema "ricette"

- Elencare tutti i record della tabella ricette
- Elencare le ricette fornendone solo il nome e la difficoltà
- Elencare tutti i passi di ricette che durano più di 10 minuti
- Elencare tutti gli ingredienti con l'unità di misura espressa in grammi
- Elencare tutte le ricette con relativa categoria
- Elencare tutte le ricette con le informazioni sul cuoco
- Elencare le ricette del primo cuoco (id_cuoco = 1) di categoria "primi"
- Elencare le istruzioni operative per realizzare la la ricetta con id_ricetta = 1
- Elencare gli ingredienti presenti nelle ricette usando questo modello di testo:
  - "La ricetta xxx contiene yyy zzz di iii", dove
    - xxx: è il nome della ricetta
    - yyy: è l'unità di misura dell'ingrediente
    - zzz: è la quantità di ingrediente
    - iii: è il nome dell'ingrediente
- Elencare le quantità effettive di ingredienti utilizzate durante i passi operativi eseguiti per realizzare un Tiramisù
- Elencare i passi operativi per produrre il Tiramisù in ordine di esecuzione
- Elencare gli ingredienti usati nelle ricette di Andrea
- Elencare le ricette che contengono caffè
- Elencare i primi di Andrea che contengono basilico