import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  testo = 'Valore della variabile';

  base = 1;
  altezza = 15;

  oggetto = {
    nome: 'Andrea',
    cognome: 'Colleoni',
  }

  constructor() { }

  ngOnInit(): void {
  }
  aumentaBase() {
    this.base++;
  }
  diminuisciBase() {
    this.base--;
  }
  aumentaAltezza() {
    this.altezza++;
  }
  diminuisciAltezza() {
    this.altezza--;
  }

  funzione() {
    console.log('mi hai cliccato!!');
    this.altezza = 25;
  }


}
