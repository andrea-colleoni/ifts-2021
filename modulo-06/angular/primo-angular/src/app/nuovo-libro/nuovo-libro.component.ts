import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Libro } from '../model/libro';

@Component({
  selector: 'app-nuovo-libro',
  templateUrl: './nuovo-libro.component.html',
  styleUrls: ['./nuovo-libro.component.css']
})
export class NuovoLibroComponent implements OnInit {

  constructor(
    private http: HttpClient,
  ) { }

  ngOnInit(): void {
  }

  aggiungi(titolo : string, codiceISBN: string, numeroPagine: number, dataPubblicazione: Date) {
    let libro = new Libro();
    libro.titolo = titolo;
    libro.codiceISBN = codiceISBN;
    libro.dataPubblicazione = dataPubblicazione;
    libro.numeroPagine = numeroPagine;

    this.http.post<Libro>('http://localhost:8080/libri', libro).subscribe();
  }

}
