# Esercizio Angular

## Geometria

- Creare diversi componenti angular per le diverse figure geometriche:
 - Triangolo
 - Quadrato
 - Rettangolo
 - Crechio
 - Trapezio

- Ciascun componente deve avere un'immagine della figura geometrica (da cercare su internet)
- Nel componente devono essere __visibili__ e __modificabili__ (per esempio con bottoni + e - ), le dimensioni di quella particolare figura
- Il programma di ciascun componente deve calcolare area e perimetro delle figure

- Nel componente root, visualizzate un'istanza di componente per ciascua figura
- (OPZIONALE) visualizzare ciascun componente in un accordion bootstrap


## Suggerimenti e procedure da ricordare

- Creazione di una nuova applicazione angular: ```ng new nome-app```
- Creazione di un componente: ```ng g c nome-componente```
- Gestione di un evento click su un elemento: ```(click)="funzione()"```
- Lettura di una variabile: ```{{variabile}}```
- Uso di un componente in un template: ```<app-mio-componente></app-mio-componente>```
- Installazione di bootstrap nell'applicazione:
  - ```npm i bootstrap```
  - ```npm i jquery```
  - Modifica di "styles" e "scripts" in "angular.json", come nell'esempio visto in classe
  ```
   "styles": [
        "node_modules/bootstrap/dist/css/bootstrap.min.css",
        "src/styles.css"
    ],
    "scripts": [
        "node_modules/jquery/dist/jquery.min.js",
        "node_modules/bootstrap/dist/js/bootstrap.min.js"
    ]
    ```
