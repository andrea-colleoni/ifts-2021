array = [
    1,
    2,
    3,
    10,
    20,
]

console.log(array);
// accedere ad un elemento
console.log(array[3]);

// modificare un elemento
array[4] = 18;
console.log(array);

// aggiungere elementi
array[5] = 33;
console.log(array);

array[12] = 'ciccio';
console.log(array);

// posso mettere nell'array anche un oggetto
array[2] = {
    qualsiasiCosa: 'valore'
}
console.log(array);

array[9] = [
    1,
    'pippo',
    { saluto: 'Buongiorno'}
]
console.log(array);

console.log('lunghezza: ', array.length);
array.length = 5;
console.log(array);