var numClick = 0;

function contaClick() {
    numClick++;
    //console.log('hai clicato ' + numClick + ' volte!');
    // voglio aggiornare il numClick sulla pagina
    // ricordiamo ch esiste in JS nel browser l'oggetto 'window'
    // questo oggetto rappresenta e da accesso a tutto ciò che vedo nella finestra (scheda) corrente
    // => c'è anche il documento HTML
    //console.log(window.document);
    // cerco un elemento per id
    //console.log(window.document.getElementById('conteggio'));

    // provo ad osservare alcune proprietà di questo HTML Element
    //console.log(window.document.getElementById('conteggio').innerText);

    // se posso leggerlo, allora quasi certamente posso modificarlo
    window.document.getElementById('conteggio').innerText = numClick;
}

function altro() {
    console.log('altro.....');
}

function espandi() {
    var mioDiv = window.document.getElementById('pnl-1');
    mioDiv.style = 'width: 500px;background-color: red;';
}

function restringi() {
    var mioDiv = window.document.getElementById('pnl-1');
    mioDiv.style = 'width: 300px;background-color: aquamarine;';
}