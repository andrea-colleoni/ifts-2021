persona = {
    nome: 'Andrea',
    cognome: 'Colleoni',
    numeroScarpe: 43,
    indirizzo: {
        via: 'Roma',
        cap: '24100',
        citta: 'Bergamo',
    }
}

console.log(persona);

persona.email = 'andrea@colleoni.info';

console.log(persona);
console.log(persona.indirizzo); // corretto
// console.log(indirizzo); // indirizzo come variabile, qui non esiste (undefined)

automobile = {
    marca: 'Fiat',
    modello: 'Tipo',
    targs: 'AB123CD'
}
console.log(automobile);
persona.auto = automobile;
console.log(persona);

console.log(persona.indirizo); // !!!  ATTENZIONE  !!!!