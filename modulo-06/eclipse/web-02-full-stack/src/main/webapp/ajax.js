console.log('ajax js caricato');

// obiettivo: rappresentare in html i libri, che vengono passati alla f() come oggetti JS
function disegnaLibri(libri) {
	console.log(libri);
	// manipolare il documento HTML (DOM: Documento Object Model)
	var corpoTabella = document.getElementById('corpoTabella');
	console.log(corpoTabella);
	/* devo creare per ogni libro una riga della tabella:
		<tr>
			<td>ISBN</td>
			<td>titolo</td>
			<td>num pagine</td>
			<td>data</td>
		</tr>
	*/
	// prima rimovo tutto quello che c'è nel corpo della tabella
	corpoTabella.innerHTML = '';

	// faccio un ciclo sui libri e aggiungo una riga per libro
	var tr;
	var html;
	for(i = 0; i < libri.length; i++) {
		// crea in memoria un nuovo HTMLElement di tipo <tr></tr> (la riga della tabella)
		tr = document.createElement('TR');

		// uso una stringa interpolata (con il backtick ALT + 96)
		// per definire le celle di questa riga
		html = `<td>${libri[i].codiceISBN}</td>
			<td>${libri[i].titolo}</td>
			<td>${libri[i].numeroPagine}</td>
			<td>${libri[i].dataPubblicazione}</td>`;

		// metto le celle della riga nell'html della riga stessa
		tr.innerHTML = html;
		// appendo (aggiungo alla fine) al corpo della tabella questa riga
		corpoTabella.appendChild(tr);
	}
}

function caricaLibri() {
	console.log('sto per caricare i libri');
	// questo oggetto serve per fare richieste HTTP al server
	var xhr = new XMLHttpRequest();

	// onreadystatechange è un Event Handler (gestore evento)
	// esso è in grado di registrare una funzione che verrà eseguita nel futuro
	// quando l'evento accadrà
	// => la funzione che scrivo qui ora, non viene eseguita qui e ora, ma quando l'evento accadrà
	// => la funzione la devo preprare prima che l'evento accada, altrimenti quando accadrà
	//   xhr non saprà cosa deve fare

	// quando cambierà lo stato della richiesta associata a questo oggetto
	// xhr, verrà eseguita questa funzione
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) { 
			// xhr.readyState == 4 => la request/response è terminata
			// xhr.status == 200 => è andata a buon fine (SUCCESS)

			// console.log(xhr.responseText);
			// con JSON faccio il parse del testo per ottenere un vero oggetto JS
			var libri = JSON.parse(xhr.responseText);
			disegnaLibri(libri);
		}
	}

	// preparo la richiesta
	xhr.open('GET', 'http://localhost:8080/web-02-full-stack/LibriServlet');

	// eseguo la richiesta (faccio concretamente la chimata http)
	// (interazione n. 3 nel grafico della lavagna)
	xhr.send();  

	// quando send() ha terminato il suo lavoro, finalmente lo stato di xhr cambierà
	// e il gestore eventi chiamerà la funzione che ho definito sopra
	
}