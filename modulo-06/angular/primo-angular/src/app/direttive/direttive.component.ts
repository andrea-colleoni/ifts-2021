import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-direttive',
  templateUrl: './direttive.component.html',
  styleUrls: ['./direttive.component.css']
})
export class DirettiveComponent implements OnInit {

  visibile = true;

  collezioneDiStringhe = [
    'prima stringa',
    'ciao',
    'buongiorno',
    'buonasera',
  ];

  constructor() { }

  ngOnInit(): void {
  }

  invertiVisibile() {
    this.visibile = !this.visibile;
  }

  cancella() {
    this.collezioneDiStringhe.length = 0;;
  }

  aggiungi(testoDaAggiungere: string) {
    this.collezioneDiStringhe.push(testoDaAggiungere);
  }

}
