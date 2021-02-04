import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Libro } from '../model/libro';

@Component({
  selector: 'app-elenco',
  templateUrl: './elenco.component.html',
  styleUrls: ['./elenco.component.css']
})
export class ElencoComponent implements OnInit {

  libri: Libro[];

  constructor(
    private http: HttpClient,
  ) { }

  ngOnInit(): void {

    this.http.get<Libro[]>('http://localhost:8080/libri').subscribe((libri) => {
      this.libri = libri;
    });

  }
 
}
