// le funzioni in JS sono circa equivalenti ai metodi in Java

function funzione() {
    console.log('dentro alla funzione');
}

a = 'ciao';

console.log('programma principale');

funzione();  // () => chiamare la funzione

console.log('finito');

persona = {
    nome: 'Mario',
    cognome: 'Rossi',
    corri: function() {
        console.log(this.nome, 'corre...')
    }
}
persona.corri();